# import logging
from logger import getMyLogger
import os
from time import time
import ntpath
import re

class ProFiler:
    def __init__(self,path, pathAttrs = {}):
        if os.path.exists(path):
            self.path = path
            self.pathAttrs = pathAttrs
            self.attrs = None
            getMyLogger().debug( 'Create ProFiler at {}'.format(path))
        else:
            raise Exception('Not valid path to profiler!')
    
    def getPath(self):
        return self.path;
    
    def isDir(self):
        return os.path.isdir(self.path)
    def isDoc(self):
        return os.path.isfile(self.path)
    def isLink(self):
        return os.path.islink(self.path)
    
    def getSecondsFrom(self,operation):
        info = os.stat(self.path)
        now = time()
        
        moment = None
        if operation=='modification':
            moment = info.st_mtime
        elif operation=='creation':
            moment = info.st_ctime
        
        return now-moment
    
    def getSize(self):
        if hasattr(self,'size_'):
            return self.size_
        
        if self.isDoc():
            self.size_ = os.stat(self.path).st_size
        elif self.isDir():
            sum = 0 
            for filename in os.listdir(self.path):
                subelement = os.path.join(self.path,filename)
                profiler = ProFiler(subelement)
                sum = sum + profiler.getSize()
            self.size_ = sum
        return self.size_
        
        
    def isEmpty(self):
        return self.getSize()==0
    
    
    def getFileName(self):
        filename =  ntpath.basename(self.path) 
        return os.path.splitext(filename)[0]
    
    def getExtension(self):
        filename =  ntpath.basename(self.path) 
        return os.path.splitext(filename)[1].strip('.')
    
    
    # tag -> #sadrzaj
    def getTags(self):
        basename = self.getFileName()
        tgs =  re.findall('#([a-zA-Z][a-zA-Z0-9]* ?)',basename)
        return [tg.strip() for tg in tgs]
    
    # atribut -> [key=val]
    def getCustomAttrs(self):
        if self.attrs is None:
            basename = self.getFileName()
            attrs = re.findall('\[([a-zA-Z][a-zA-Z0-9]*=[a-zA-Z0-9]+ ?)\]',basename)
            self.attrs = {pair.split('=')[0].strip(): pair.split('=')[1].strip() for pair in attrs}
        return self.attrs
    
        
    def getAllAttrs(self):
        retval = self.getCustomAttrs().copy()
        retval.update(self.pathAttrs)
        retval['basename'] = '{}.{}'.format(self.getFileName(),self.getExtension()) if self.getExtension()!='' else self.getFileName()
        retval['purename'] = '{}.{}'.format(self.getPureFileName(),self.getExtension()) if self.getExtension()!='' else self.getPureFileName()
        return retval
    
    
    def getPureFileName(self):
        basename = self.getFileName()
        attrs = self.getCustomAttrs()
        rattrs = ['[\s]*\[[\s]*'+ky+'[\s]*=[\s]*'+attrs[ky]+'[\s]*\][\s]*'  for ky in attrs.keys() ]
        rtags = self.getTags()
    
#         phase = 0
#         getMyLogger().debug('phase: {} -> {}'.format(phase,basename))
        for r in  rattrs:
            basename = re.sub(r,'',basename)
#             phase = phase +1
#             getMyLogger().debug('phase: {} -> {}'.format(phase,basename))
        for tg in rtags:
#             getMyLogger().debug( "  basename = re.sub('#{}','',{})  ".format(tg,basename) )
            basename = re.sub('#'+tg,'',basename)
#             phase = phase +1
#             getMyLogger().debug('phase: {} -> {}'.format(phase,basename))
        
        return basename.strip()        
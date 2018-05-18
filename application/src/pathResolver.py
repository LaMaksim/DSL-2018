# import logging
from logger import getMyLogger
import os
from profiler import ProFiler




class PathResolver:
    def __init__(self):
        pass
    
    def getProfilers(self,steps):
        self.profilers = []
        self._search(steps)
        return self.profilers
    
    def _search(self, steps,index=0,temp='',attrs={}):
        
        # ako smo resolve-ovali do kraja
        getMyLogger().debug( 'resolving at path: {}  {}  {} '.format( index, len(steps), temp)  )
        if index>=len(steps):
            if os.path.isdir(temp):

                try:
                    for fullname in os.listdir(temp):
                        curr_attrs = attrs.copy()
                        curr_attrs['fullname'] = fullname
                        profiler =  ProFiler(os.path.join(temp,fullname),curr_attrs)  
                        self.profilers.append( profiler)
                except (IOError, OSError), e:
                    getMyLogger().error( 'Access Denied to: {}'.format( temp))
                    
            return
                
        # ako nismo, preuzmemo sledeci korak
#         print index, len(steps), temp
        step = steps[index]
        val = step.value.replace(':',':\\')
        index = index +1
        
        # ako je konkretan, nista ne ispitujemo
        if not step.parametrized:
            temp = os.path.join(temp,val)
            self._search(steps,index,temp,attrs)
            
        # ako nije konkretan, dodamo sve podputanje koje postoje
        elif step.parametrized and os.path.isdir(temp):
            try:
                for name in os.listdir(temp):
                    curr_temp = os.path.join(temp,name)
                    curr_attrs = attrs.copy()
                    curr_attrs[val]=name

                    getMyLogger().debug( 'go to subpath: {}'.format(curr_temp) )
                    self._search(steps,index,curr_temp,curr_attrs)
            except (IOError, OSError), e:
                getMyLogger().debug( 'Access denied to: {}'.format(temp) )
                
    
    def getDestination(self,profiler,steps):
        attrs = profiler.getAllAttrs()
        dst = ''
        for step in steps:
            val = step.value.replace(':',':/')    
            if step.parametrized:
                val = attrs[val]
            dst = os.path.join(dst,val)
        return dst        
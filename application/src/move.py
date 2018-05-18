import os
import shutil
import ntpath
                    
from logger import getMyLogger

from pathResolver import PathResolver
from select import Select

class Move:
    
    def __init__(self,destination,selection_name,tactic):
        resolver = PathResolver()
        profilers = Select.getFromRegister(selection_name).resultSet()
        
        for prof in profilers:
            dst = resolver.getDestination(prof,destination)
        
            if tactic=='carefully':
                self._move_carefully(prof.getPath(),dst)
            elif tactic=='forced':
                self._move_forced(prof.getPath(),dst)
            elif tactic=='append':
                self._move_append(prof.getPath(),dst)
    
    def _move_carefully(self,src,dst):
        if os.path.exists(dst):
            return False
        
        
        parent = os.path.dirname(dst)
        if not os.path.exists(parent):
            os.makedirs(parent)
        shutil.move(src,dst)
        return True                 
    
    def _move_forced(self,src,dst):
        if os.path.exists(dst):
            if os.path.isfile(dst):
                os.remove(dst)
            elif os.path.isdir():
                shutil.rmtree(dst)
        
        parent = os.path.dirname(dst)
        if not os.path.exists(parent):
            os.makedirs(parent)
        shutil.move(src,dst)
        return True
    
    
    def _move_append(self,src,dst):
        parent = os.path.dirname(dst)
        basename =  ntpath.basename(dst) 
        filename = os.path.splitext(basename)[0]
        extension = os.path.splitext(basename)[1]#.replace('.','')
        replication = 0
        
        if not os.path.exists(parent):
            getMyLogger().debug('{} directly moved to {}'.format(src,dst))
            os.makedirs(parent)    
            shutil.move(src,dst)
            return True
        
        elif os.path.exists(parent):
            while True:
                tryname = '{}({}){}'.format(filename,replication,extension) if replication > 0 else '{}{}'.format(filename,extension)
                trypath = os.path.join(parent,tryname)
                if not os.path.exists(trypath):
                    shutil.move(src,trypath)
                    getMyLogger().debug('{} eventually moved to {}'.format(src,trypath))
                    return True
                replication = replication+1
                
            
            
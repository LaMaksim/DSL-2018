class Copy:
    
    def __init__(self,destination,selection_name,tactic):
        resolver = PathResolver()
        profilers = Select.getFromRegister(selection_name).resultSet()
        
        for prof in profilers:
            dst = resolver.getDestination(prof,destination)
        
            if tactic=='carefully':
                self._copy_carefully(prof.getPath(),dst)
            elif tactic=='forced':
                self._copy_forced(prof.getPath(),dst)
            elif tactic=='append':
                self._copy_append(prof.getPath(),dst)
                
    def _copy_carefully(self,src,dst):
        if os.path.exists(dst):
            return False
        
        if os.path.isfile(src):
            parent = os.path.dirname(dst)
            if not os.path.exists(parent):
                os.makedirs(parent)
            shutil.copy(src,dst)
            
        elif os.path.isdir(src):
            shutil.copytree(src,dst)
        
        return True
    
    def _copy_forced(self,src,dst):
        if os.path.exists(dst):
            if os.path.isfile(dst):
                os.remove(dst)
            elif os.path.isdir():
                shutil.rmtree(dst)
        
        if os.path.isfile(src):
            parent = os.path.dirname(dst)
            if not os.path.exists(parent):
                os.makedirs(parent)
            shutil.copy(src,dst)
            
        elif os.path.isdir(src):
            shutil.copytree(src,dst)
        return True
    
    
    def _copy_append(self,src,dst):
        parent = os.path.dirname(dst)
        basename =  ntpath.basename(dst) 
        filename = os.path.splitext(basename)[0]
        extension = os.path.splitext(basename)[1]#.replace('.','')
        replication = 0
        
        if not os.path.exists(parent):
            os.makedirs(parent)    
            if os.path.isdir(src):
                shutil.copytree(src,dst)
            elif os.path.isfile(src):
                shutil.copy(src,dst)
            logger.debug('{} directly copied to {}'.format(src,dst))
            return True
        
        elif os.path.exists(parent):
            while True:
                tryname = '{}({}){}'.format(filename,replication,extension) if replication > 0 else '{}{}'.format(filename,extension)
                trypath = os.path.join(parent,tryname)
                if not os.path.exists(trypath):
                    if os.path.isdir(src):
                        shutil.copytree(src,os.path.join(parent,trypath))
                    elif os.path.isfile(src):
                        shutil.copy(src,os.path.join(parent,trypath))
                    logger.debug('{} eventually copied to {}'.format(src,trypath))
                    return True
                replication = replication+1
                
            
            
            
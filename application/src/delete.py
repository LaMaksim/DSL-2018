import os
import shutil

from pathResolver import PathResolver
from select import Select

class Delete:
    def __init__(self,selection_name):
        profilers = Select.getFromRegister(selection_name).resultSet()
        resolver = PathResolver()
        
        for prof in profilers:
            dst = prof.getPath()
        
            if prof.isDoc():
                os.remove(dst)
            elif prof.isDir():
                shutil.rmtree(dst)
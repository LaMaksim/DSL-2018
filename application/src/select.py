class Select:
    register = {}
    
    def __init__(self,name,path,where):
        self.path = path
        self.where = where
        self.name = name
        Select.register[name] = self
    
    def resultSet(self):
        resolver = PathResolver()
        preliminary = resolver.getProfilers(steps=self.path)
        return filter(self.where,preliminary)
    
    @staticmethod
    def getFromRegister(name):
        return Select.register[name]
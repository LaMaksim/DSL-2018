def singleton(class_):
    instances = {}
    def getinstance(*args, **kwargs):
        if class_ not in instances:
            logger.debug(True)
            instances[class_] = class_(*args, **kwargs)
        return instances[class_]
    return getinstance

@singleton
class MyClass():
    def __init__(self):
        self.val = 0
        
    def inc(self):
        self.val = self.val +1
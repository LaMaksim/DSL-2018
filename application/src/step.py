class Step:
    def __init__(self,value,parametrized=False):
        self.value = value
        self.parametrized = parametrized
    
    @staticmethod
    def CreateSteps(steps):
        length = len(steps)
        results = []
        
        for index,elem in enumerate(steps):
            if type(elem) is str:
                results.append(Step(elem))
            elif type(steps[index]).__name__ == 'instance':
                results.append(elem)
                
        return results
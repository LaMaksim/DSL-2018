class Filter:
    @staticmethod
    def checkProfilerTags(profiler, extensionList, negation=False, quantity=-1, noMore=False):
        sExisting = set(profiler.getTags())
        sDesired = set(extensionList)

        # greska ako postoje tagovi koji nisu u nasoj listi zeljenih
        if noMore and len(sExisting.difference(sDesired)):
            return False
        cnt = -1

        if not negation: # brojimo postojece
            s = sDesired.intersection(sExisting) # koliko od specificiranih postoje
            cnt = len(s)
        else:
            s = sDesired.difference(sExisting) # koliko od specificiranih ne postoje
            cnt = len(s)
        if quantity==-1:
            return cnt==len(sDesired) # vazi za sve
        else:
            return cnt>=quantity # vazi za dovoljno mnogo

    @staticmethod
    def checkProfilerAttribute(profiler,attr,val=None,neg=False):
        ats = profiler.getCustomAttrs()

        has = ats.has_key(attr)

        exact = True
        if has and val is not None and ats[attr]!=val:
            exact = False

        retval = has and exact
        if neg:
            return not retval
        else:
            return retval
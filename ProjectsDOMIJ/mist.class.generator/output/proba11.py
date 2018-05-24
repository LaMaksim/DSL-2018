usb = [Step("F:")]
downloads = [Step("C:"),Step("users"),Step("maskim"),Step("Downloads")]
personal = [Step("D:"),Step("Maksim")]
usb2 = [Step("F:")]
_from = [Step("F:"),Step("Books")]
def _filter(profiler):
	return ( profiler.isEmpty() 
	and
	(not profiler.isEmpty() 
	and
	 profiler.isDir
	and
	not profiler.isDoc
	and
	profiler.getExtension()  in ["mkv","mp4","avi"
	]
	and
	profiler.getExtension() not in ["cpp","h","java"
	]
	and
	profiler.getPureFileName() is  pera
	and
	profiler.getPureFileName() is not mika
	)
	and
	( profiler.getSize() >= 25*1048576
	and
	 profiler.getSecondsFrom("creation") > 5*86400
	and
	 profiler.getSecondsFrom("modification") < 2*604800
	)
	or
	(checkProfilerAttribute(profiler,neki,neg=False)
	and
	checkProfilerAttribute(profiler,nekiDrugi,neg=True)
	and
	checkProfilerAttribute(profiler,treci,neg=False,val="sdf")
	and
	checkProfilerAttribute(profiler,cetvrti,neg=True,val="sdf")
	)
	and
	(checkProfilerTags(profiler, extensionList=["mkv","mp3"
	], negation=False, quantity=2, noMore=True)
	and
	checkProfilerTags(profiler, extensionList=["mkv","mp3"
	], negation=True, quantity=2, noMore=False)
	or
	checkProfilerTags(profiler, extensionList=["mkv","mp3"
	], negation=False, quantity=-1, noMore=False)
	and
	checkProfilerTags(profiler, extensionList=["mkv","mp3"
	], negation=False, quantity=-1, noMore=False)
	and
	checkProfilerTags(profiler, extensionList=["mkv","mp3"
	], negation=True, quantity=1, noMore=False)
	)
	)
Selection(name="coockBooks",path=_from,where=_filter)
_from = [Step("D:"),Step("Maksim"),Step("books")]
Copy(selection_name="coockBooks",destination=_from,tactic="carefully")

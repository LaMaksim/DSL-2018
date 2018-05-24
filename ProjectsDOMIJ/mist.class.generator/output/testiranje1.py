root = [Step("C:"),Step("Users"),Step("maksim"),Step("Documents"),Step("JuPyteR"),Step("data"),Step("test")]
downloads = [Step("C:"),Step("Users"),Step("maksim"),Step("Documents"),Step("JuPyteR"),Step("data"),Step("test"),Step("Downloads")]
usb = [Step("C:"),Step("Users"),Step("maksim"),Step("Documents"),Step("JuPyteR"),Step("data"),Step("test"),Step("USB")]
personal = [Step("C:"),Step("Users"),Step("maksim"),Step("Documents"),Step("JuPyteR"),Step("data"),Step("test"),Step("Personal")]
_from = [Step("C:"),Step("Users"),Step("maksim"),Step("Documents"),Step("JuPyteR"),Step("data"),Step("test"),Step("USB"),Step("Books")]
def _filter(profiler):
	return (checkProfilerAttribute(profiler,lang,neg=False) and checkProfilerTags(profiler, extensionList=["it"], negation=False, quantity=1, noMore=False))
Selection(name="books",path=_from,where=_filter)
_from = [Step("C:"),Step("Users"),Step("maksim"),Step("Documents"),Step("JuPyteR"),Step("data"),Step("test"),Step("Downloads")]
def _filter(profiler):
	return (checkProfilerAttribute(profiler,lang,neg=False) and checkProfilerTags(profiler, extensionList=["it"], negation=False, quantity=-1, noMore=False) and profiler.getExtension()  in ["mp4","mkv","tlv","gov"])
Selection(name="videos",path=_from,where=_filter)
_destination = [Step("C:"),Step("Users"),Step("maksim"),Step("Documents"),Step("JuPyteR"),Step("data"),Step("test"),Step("Personal"),Step("IT"),Step("lang",parametrized=True),Step("Books"),Step("purename",parametrized=True)]
Copy(selection_name="books",destination=_destination,tactic="append")
_destination = [Step("C:"),Step("Users"),Step("maksim"),Step("Documents"),Step("JuPyteR"),Step("data"),Step("test"),Step("Personal"),Step("IT"),Step("lang",parametrized=True),Step("Videos"),Step("purename",parametrized=True)]
Copy(selection_name="videos",destination=_destination,tactic="append")

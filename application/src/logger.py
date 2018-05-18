import logging

global mylogger 
mylogger = logging.getLogger('libmaksim')
mylogger.setLevel(logging.DEBUG)

		# # create file handler which logs even debug messages
		# fh = logging.FileHandler('spam.log')
		# fh.setLevel(logging.DEBUG)
		# create console handler with a higher log level
ch = logging.StreamHandler()
ch.setLevel(logging.DEBUG)

		# create formatter and add it to the handlers
		# formatter = logging.Formatter('%(asctime)s - %(name)s - %(levelname)s - %(message)s')
formatter = logging.Formatter('%(levelname)s - %(message)s')
		# fh.setFormatter(formatter)
ch.setFormatter(formatter)

mylogger.propagate = False
mylogger.handlers = []
		# add the handlers to the mylogger
		# mylogger.addHandler(fh)
mylogger.addHandler(ch)

mylogger.debug('logger setuped')

def getMyLogger():
	return mylogger

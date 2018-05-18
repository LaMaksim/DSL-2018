import click

import os
from time import time
import ntpath
import re

from src.logger import Log

from src.profiler import ProFiler
from src.filter import Filter
from src.step import Step
from src.pathResolver import PathResolver
from src.select import Select

from src.delete import Delete
from src.move import Move
from src.copy import Copy

logger = getLogger()
# @click.command()
# def hello():
#     click.echo('Hello World!')


# @click.command()
# @click.option('--count', default=1, help='Number of greetings.')
# @click.option('--name', prompt='Your name',
#               help='The person to greet.')
# def hello(count, name):
#     """Simple program that greets NAME for a total of COUNT times."""
#     for x in range(count):
#         click.echo('Hello %s!' % name)

# @click.command()
# @click.argument('text')
# def hello(text):
#     click.echo(text)


@click.command()
@click.option('--count', default=1, help='number of greetings')
@click.option('--path', help='path to execute')
@click.argument('name')
def run(count, path, name):
    for x in range(count):
        click.echo('Hello %s!' % name)


    # putanja do skripte
	scriptdir = os.path.dirname(__file__)
	print "scriptdir: ", scriptdir


	# putanje do lokacije pozivanja
	print "cwd: ", os.getcwd()

	execfile(path)
	# with(path,'r') as file:
	# 	exec(file.read())

	# Expand given path to its absolute form:
	# od relativne putanje se dobija apsolutna
	# isto kao i:

	# inpath = os.path.join(os.getcwd(), args.path)
	#inpath = os.path.abspath(args.path)
	#print inpath
	#print args.path
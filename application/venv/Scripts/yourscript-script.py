#!c:\users\maksim\documents\scripts\testproj\venv\scripts\python.exe
# EASY-INSTALL-ENTRY-SCRIPT: 'yourscript234','console_scripts','yourscript'
__requires__ = 'yourscript234'
import re
import sys
from pkg_resources import load_entry_point

if __name__ == '__main__':
    sys.argv[0] = re.sub(r'(-script\.pyw?|\.exe)?$', '', sys.argv[0])
    sys.exit(
        load_entry_point('yourscript234', 'console_scripts', 'yourscript')()
    )

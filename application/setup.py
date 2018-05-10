from setuptools import setup, find_packages

# setup(
#     name='yourscript23',
#     version='0.4',
#     py_modules=['yourscript'],
#     install_requires=[
#         'Click',
#     ],
#     entry_points='''
#         [console_scripts]
#         yourscript=hi:hello
#     '''
# )


setup(
    name='fetl_library',
    version='0.1',
    packages=find_packages(),
    include_package_data=True,
    install_requires=[
        'Click',
    ],
    entry_points='''
        [console_scripts]
        fetl=starter:run
    ''',
)
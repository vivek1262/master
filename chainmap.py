from collections import ChainMap

a = {1 :"vivek",2 :"python"}
b = {3 :"master", 4 :"Developer"}

c = ChainMap(a,b)
print(c)
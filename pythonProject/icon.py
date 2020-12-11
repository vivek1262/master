import re


file = "wed dec 09 2020 15:46:55"
change = " : "
for char in change:
    file = file.replace(char , "/")
print(file)
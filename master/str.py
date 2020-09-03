import re 
phoneNumRegex = re.compile(r'\d{2}-\d{2}-\d{4}') 
mo = phoneNumRegex.search('My number is 12-06-1991.') 
print('My Date of Birth found: ' + mo.group()) 

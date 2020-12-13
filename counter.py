from collections import Counter

a = (1,2,3,2,1,3,4,6,5,6,7,4,5,7)
a1 = Counter(a)

print(a1)
print(list(a1.elements()))
print(a1.most_common())
s = {2:1,4:1}
print(a1.subtract(s))
print(a1.most_common())
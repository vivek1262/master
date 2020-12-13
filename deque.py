from collections import deque

a = ['v','i','v','e','k']

d = deque(a)
print(d)
d.append("s")
print(d)
d.appendleft("n")
print(d)
d.popleft()
print(d)
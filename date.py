def time(x):
    d = x//86400
    h = (x%86400)//3600
    m = (x%3600)//60
    s = (x%60)
    # print(f'{d:02}:{h:02}:{m:02}:{s:02}')
    print('{:03}:{:03}:{:03}:{:03}'.format(d,h,m,s))
print('d:h:m:s')
time(91000)
time(86400)
time(92000)
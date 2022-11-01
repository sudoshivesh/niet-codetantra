import sys
k=int(sys.argv[1])
n=int(sys.argv[2])
c=[int(x) for x in sys.argv[3].split(',')]
def maximumPoints(k,n,c):
    c.sort()
    s=0
    co=0
    for i in c:
        if s+i<=k:
            s+=i
            co+=1
        else:
            break
    return co
print( maximumPoints(k,n,c))

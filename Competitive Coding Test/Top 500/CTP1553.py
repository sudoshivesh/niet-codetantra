import sys
A=[int(x) for x in sys.argv[1].split(',')]
B=[int(x) for x in sys.argv[2].split(',')]
def minimumStartingPoint(A, B):
  for ii in range(0,len(A)):
    c=sum(A)
    d=sum(B)
    if (c<d):
      return -1
    for jj in range(len(A)):
      aa=0
      if A[jj]>=B[jj]:
        j=(jj+1)%len(A)
        aa=aa+A[jj]-B[jj]
        while aa+A[j]-B[j]>=0:
          aa+=A[j]-B[j]
          j=(j+1)%len(A)
          if(j==1): return jj
  return -1
print( minimumStartingPoint(A, B))

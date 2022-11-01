import sys
unverifiedRollNumbers = sys.agrv[1].split(',')
def validRollNumbers(unverifiedRollNumbers):
    l=[]
    n=unverifiedRollNumbers
    for i in range(0,len(n)):
        if(len(n[i]==4 and n[i].isalnum()):
           if n[i[.isalpha()==False:
                  l.append(n[i])
    return l
print(",".join(map(str,validRollNumbers(unverifiedRollNumbers))))

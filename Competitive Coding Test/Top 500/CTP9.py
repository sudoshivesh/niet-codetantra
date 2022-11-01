import sys
number=int(sys.argv[1])
def encryptNumber(number):
    #Write code here
    number=str(number)
    strn=""
    a=""
    if(len(number)%2==0):
        length=len(number)
    else:
        length=len(number)-1
        a=number[-1]
    for i in range(0,length,2):
        strn+=number[i+1]
        strn+=number[i]
    return int(strn+a)
print(encryptNumber(number))

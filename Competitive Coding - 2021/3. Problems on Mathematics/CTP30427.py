'''
Problem Statement:
Complete the code in the function isDivisibleBy41. A number N of Length L digits can be formed as shown below

 for all , where c is any non-negative integer
Where  is the digit at position 
 and  are first and second digits of the number N
The function should check such a number formed is divisible by 41

Output:
Return true if N is divisible by 41
Return false if N is NOT divisible by 41
Constraints:
Range of  is in between 1 and 1000, both inclusive
N is a non negative integer
Range of c in between 1 and 500
 and  are in the range of 0 to 500
Function Rules:
Fill the missing logic in function isDivisibleBy41 with return type bool and parameters as listed below:

d1 <type 'int'>
d2 <type 'int'>
c <type 'int'>
L <type 'int'>
Sample Test Cases
Test Case 1:
Command Line Arguments: 1 2 1 3
Expected Output:
true
'''
import sys

d1 = int(sys.argv[1])
d2 = int(sys.argv[2])
c = int(sys.argv[3])
L = int(sys.argv[4])

def isDivisibleBy41(d1, d2, c, L):
	digits = [d1,d2]+[0]*(L-2)
	for i in range(2,L):
		digits[i] = (digits[i-1]*c+digits[i-2])%10
	num = 0
	for i in range(L):
		num += digits[i]*10**(L-i-1)
	return num%41==0

print("true" if isDivisibleBy41(d1, d2, c, L) else "false");

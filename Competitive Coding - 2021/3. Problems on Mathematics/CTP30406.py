'''
Problem Statement:
Complete the code in the function getProductSign. It should figure out the sign of the product of all the integers between a and b, both inclusive.

Return Value:

If it is a minus sign, it should return the string "negative"
If it is a plus sign, it should return the string "positive"
If the product is zero, it should return the string "zero"
Constraints:

a and b are any 2 integers between -1000000000 and 1000000000
Test cases that don't complete inside 4 seconds will fail
Function Rules:
Fill the missing logic in function getProductSign with return type str and parameters as listed below:

a <type 'int'>
b <type 'int'>
Sample Test Cases
Test Case 1:
Command Line Arguments: 0 5
Expected Output:
zero
'''
import sys

a = int(sys.argv[1])
b = int(sys.argv[2])

def getProductSign(a, b):
	# Write code here
	if a>0 and b>0: return 'positive'
	if a<=0<=b:
		return 'zero'
	negatives = a-b+1
	if negatives%2==0:
		return 'positive'
	return 'negative'

print(getProductSign(a, b))

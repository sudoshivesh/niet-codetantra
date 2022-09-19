'''
Problem Statement:
Complete the code in the function consecutiveString. Given a string . This function should return a new string  with no three identical consecutive letters, which can be obtained by deleting a minimum number of possible characters from .

Constraints:
 will contains only lower case alphabates a-z
Length of  is in between 1 and 100000, both inclusive.
Function Rules:
Fill the missing logic in function consecutiveString with return type str and parameters as listed below:

S <type 'str'>
Sample Test Cases
Test Case 1:
Command Line Arguments: uuuuuuuuuuuuxaaaaxuuuuu
Expected Output:
uuxaaxuu
'''
import sys

S = sys.argv[1]

def consecutiveString(S):
	# Write code here
	ans = ''
	stack = S[0]
	for i in range(len(S)-1):
		if S[i+1]!=stack[-1]:
			ans += stack
			stack = S[i+1]
		else:
			stack += S[i+1]
			if len(stack)>2:
				stack = stack[:2]
	
	return ans+stack

print(consecutiveString(S))
#This code is contributed by Shivesh

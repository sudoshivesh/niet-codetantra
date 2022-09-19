'''
Problem Statement:
The function should return a string that is made by reversing all alpha characters in S, without changing the position of the non-alpha characters. In the returned string, the non-alpha characters should appear in the same position as they are in S.

As an example, for S value Abc$c, the function should return ccb$A, retaining the non-alpha space character exactly where it originally was.
Constrains:

The length of S is always between 1 and 10000, both inclusive
Alpha characters are letters of English alphabet a to z, in both upper and lower cases
Any character which is not an alpha character is a non-alpha character
Function Rules:
Fill the missing logic in function reverseAlphas with return type str and parameters as listed below:

S <type 'str'>
Sample Test Cases
Test Case 1:
Command Line Arguments: SGH@DG$VDEG#YUK7SDF
Expected Output:
FDS@KU$YGED#VGD7HGS
'''
import sys

S = sys.argv[1]

arr = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz"

def reverseAlphas(S):
	arr1 = []
	for i in S:
		if i in arr:
			arr1.append(i)
	ans = ''
	for i in S:
		if i in arr:
			ans += arr1.pop()
		else:
			ans += i
	return ans
	
print(reverseAlphas(S))

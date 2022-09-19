'''
Problem Statement:
The function should return a boolean indicating whether s is a Super string or not. A string s is said to be Super if the count of each character in s is equal to the position of that character in alphabetical order starting with 1 for a, 2 for b and so on until 26 for z.

Constraints:
Length of s is in between 1 and 400, both inclusive.
s will contains only lower case alphabets a-z.
Function Rules:
Fill the missing logic in function isSuper with return type bool and parameters as listed below:

s <type 'str'>
Sample Test Cases
Test Case 1:
Command Line Arguments: bba
Expected Output:
true
'''
import sys

s = sys.argv[1]

ls = list('abcdefghijklmnopqrstuvwxyz')

def isSuper(s):
	for i in set(s):
		if s.count(i) != ls.index(i)+1:
			return False
	return True
	
	

print("true" if isSuper(s) else "false");
#This code is contributed by Shivesh Shivam

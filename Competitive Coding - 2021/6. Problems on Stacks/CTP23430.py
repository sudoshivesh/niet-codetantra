'''Problem Statement:
expr is a string representing a post-fix arithmetic expression containing only natural numbers and the 4 basic binary operators (+, -, *, /). Each token in the expression is separated by a space character. The function should evaluate expr and return its value.

Constraints:

expr is a string of length between 1 and 100, both inclusive
The tokens in expr are separated by space character
The number tokens in expr are all natural numbers between 1 and 1000, both inclusive
The only characters in expr are space, 0, 1, 2, 3, 4, 5, 6, 7, 8. 9, +, -, *, /
+ is addition operator, - is subtraction operator, * is multiplication operator and / is division operator
Function Rules:
Fill the missing logic in function evaluate with return type int and parameters as listed below:

expr <type 'str'>
Sample Test Cases
Test Case 1:
Command Line Arguments: 23 100 +
Expected Output:
123'''
import sys

expr = sys.argv[1]

def evaluate(expr):
	# Write code here
	s=expr.split(" ")
	lists=[]
	n=len(expr)
	while(len(lists)<1):
		for i in s:
			if i.isdigit():
				lists.append(int(i))
			elif(i=='+'):
				a=lists.pop()
				b=lists.pop()
				lists.append(int(a)+int(b))
			elif(i=='-'):
				a=lists.pop()
				b=lists.pop()
				lists.append(int(b)-int(a))
			elif(i=='*'):
				a=lists.pop()
				b=lists.pop()
				lists.append(a*b)
			elif(i=='/'):
				a=lists.pop()
				b=lists.pop()
				lists.append(int(b)/int(a))
	return lists.pop()

print(evaluate(expr))

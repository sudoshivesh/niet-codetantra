'''
Problem Statement:
The function should return the sum of all the Prime numbers between n1 and n2, both inclusive.

A Prime number is any natural number greater than 2 that is not evenly divisible by any numbers other than 1 and itself.

As an example, if n1 is 6 and n2 is 15, then the answer can be computed as 7 + 11 + 13 = 31

Constraints
n1 and n2 are any natural numbers between 1 and 10000, both inclusive
Test cases will time out if the code is inefficient and it takes longer than 4 seconds for any test case
Function Rules:
Fill the missing logic in function sumOfPrimes with return type int and parameters as listed below:

n1 <type 'int'>
n2 <type 'int'>
Sample Test Cases
Test Case 1:
Command Line Arguments: 15 6
Expected Output:
31
'''
import sys

n1 = int(sys.argv[1])
n2 = int(sys.argv[2])

def isPrime(num):
	for i in range(2, int(num**0.5)+1):
		if num%i==0:
			return False
	return True

def sumOfPrimes(n1, n2):
	sum = 0
	n1,n2 = sorted([n1,n2])
	for i in range(n1,n2+1):
		if i!=1 and isPrime(i):
			sum += i
	return sum

print(sumOfPrimes(n1, n2))

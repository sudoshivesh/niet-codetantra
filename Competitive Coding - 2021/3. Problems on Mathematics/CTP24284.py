'''
Problem Statement:
Some prime numbers can be expressed as a sum of other consecutive prime numbers.

For example
5 = 2 + 3
17 = 2 + 3 + 5 + 7
41 = 2 + 3 + 5 + 7 + 11 + 1
The function shoud return the total number of all such prime numbers which are less than or equal to n, that satisfy the above mentioned property.

Constraints:
n is an integer between 3 and 1000, both inclusive
Note that 1 is not a prime number
Test cases will fail if the code is inefficient and takes longer than the configured time-out duration
Function Rules:
Fill the missing logic in function primeSum with return type int and parameters as listed below:

n <type 'int'>
Sample Test Cases
Test Case 1:
Command Line Arguments: 20
Expected Output:
2
'''
import sys

n = int(sys.argv[1])

def isPrime(n):
	for i in range(2, int(n**0.5)+1):
		if n%i==0:
			return False
	return True

def primeSum(n):
	primes = []
	for i in range(2,n+1):
		if isPrime(i):
			primes.append(i)
	sum = primes[0]
	counter = 0
	for i in range(1,len(primes)):
		sum += primes[i]
		if sum <= n and isPrime(sum):
			counter +=1
		if sum > n:
			break
	return counter
	
	
print(primeSum(n))


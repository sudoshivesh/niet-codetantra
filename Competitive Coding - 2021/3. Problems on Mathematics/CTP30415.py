'''
Problem Statement:
Complete the code in the function sumBetween. Given , the function should return the sum of all elements between  &  indices of an array of size  constructed such that:

the first half of the array is the list of all even numbers between  and , both inclusive, in increasing order
the second half of the array is the list of all odd numbers between  and , both inclusive, in increasing order
Constraints:
, ,  are all integers in the range  and , both inclusive
If  is odd, then the first half of the constructed array contains 
 
 elements and the second half contains 
 
 elements
Function Rules:
Fill the missing logic in function sumBetween with return type int and parameters as listed below:

N <type 'int'>
L <type 'int'>
R <type 'int'>
Sample Test Cases
Test Case 1:
Command Line Arguments: 6 3 5
Expected Output:
10
'''
import sys

N = int(sys.argv[1])
L = int(sys.argv[2])
R = int(sys.argv[3])

def sumBetween(N, L, R):
	arr=[i for i in range(0,N+1,2)]+[i for i in range(1,N+1,2)]
	return sum(arr[L:R+1])

print(sumBetween(N, L, R))

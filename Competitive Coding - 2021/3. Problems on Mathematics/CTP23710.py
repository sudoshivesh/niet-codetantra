'''
Problem Statement:
The total resistance R of three resistors  r1, r2  and r3 connected in parallel is given by the formula: (1/R)=(1/r1)+(1/r2)+(1/r3)
 
The function should compute R using this formula and return it.

When it is not possible to compute R using this formula, the function should return -1. Hidden test cases have been set up to check this particular situation.

Function Rules:
Fill the missing logic in function combinedResistanceParallel with return type float and parameters as listed below:

r1 <type 'float'>
r2 <type 'float'>
r3 <type 'float'>
Sample Test Cases
Test Case 1:
Command Line Arguments: 2 1 3
Expected Output:
5.454550e-01
'''
import sys

r1 = float(sys.argv[1])
r2 = float(sys.argv[2])
r3 = float(sys.argv[3])

def combinedResistanceParallel(r1, r2, r3):
	try:
		return round((r1*r2*r3)/(r1*r2+r2*r3+r3*r1),6)
	except:
		return -1 #Given the function should return -1 when it is not possible to compute R	

print("%1.6e" % combinedResistanceParallel(r1, r2, r3))

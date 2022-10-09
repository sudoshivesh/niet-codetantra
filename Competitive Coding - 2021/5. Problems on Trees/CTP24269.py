'''
Test Case 3:
Command Line Arguments: 1 2 3 4 5
Expected Output:
3
'''
import sys

treeStr = sys.argv[1]

from math import floor,ceil,log

def levelCount(treeStr):
	# Write code here
	ls = treeStr.split()
	n = len(ls)
	return ceil(log(n+1,2))

print(levelCount(treeStr))

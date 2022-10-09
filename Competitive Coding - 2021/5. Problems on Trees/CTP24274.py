'''
Test Case 3:
Command Line Arguments: 1 2 3 4 5 1
Expected Output:
4
'''
import sys

treeStr = sys.argv[1]
n = int(sys.argv[2])

ans = []

class newNode:
	 def __init__(self,data):
	 	self.data = data
	 	self.left =self.right = None
def insertLevelOrder(arr,i,n):
	root=None
	if i<n:
		root=newNode(arr[i])
		root.left=insertLevelOrder(arr, 2*i+1,n)
		root.right=insertLevelOrder(arr,2*i+2,n)
	return root
def inOrder(root):
	if root!=None and root.data!='-':
		inOrder(root.left)
		ans.append(root.data)
		inOrder(root.right)
		
def infixElement(treeStr, n):
	# Write code here
	nodes=treeStr.split()
	num=len(nodes)
	root=None
	root=insertLevelOrder(nodes,0,num)
	inOrder(root)
	return ans[n-1]

print(infixElement(treeStr, n))

'''
Test Case 2:
Command Line Arguments: 20 10 40 5 15 25 50 - - - - - 30 5
Expected Output:
25
'''
import sys

treeStr = sys.argv[1]
n = int(sys.argv[2])
ans=[]
class newNode:
	def __init__(self,data):
		self.data=data
		self.left=self.right=None
def insertLevelOrder(arr,i,n):
	root=None
	if i<n:
		root=newNode(arr[i])
		root.left=insertLevelOrder(arr,2*i+1,n)
		root.right=insertLevelOrder(arr,2*i+2,n)
	return root
def inOrder(root):
	if root!=None and root.data!='-':
		inOrder(root.left)
		ans.append(root.data)
		inOrder(root.right)
def binarySearchTreeTraversal(treeStr, n):
	# Write code here
	nodes=treeStr.split()
	length=len(nodes)
	root=None
	root=insertLevelOrder(nodes,0,length)
	inOrder(root)
	return ans[n-1]

print(binarySearchTreeTraversal(treeStr, n))

'''
Test Case 3:
Command Line Arguments: 1 2 3 4 5 3
Expected Output:
2
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
def postOrder(root):
	if root!=None and root.data!='-':
		postOrder(root.left)
		postOrder(root.right)
		ans.append(root.data)
		

def postOrderElement(treeStr, n):
	# Write code here
	nodes=treeStr.split()
	num=len(nodes)
	root=None
	root=insertLevelOrder(nodes,0,num)
	postOrder(root)
	return ans[n-1]

print(postOrderElement(treeStr, n))

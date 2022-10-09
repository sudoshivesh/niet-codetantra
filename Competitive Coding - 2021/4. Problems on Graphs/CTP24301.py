'''
Problem Statement:
Raj is a senior software engineer in CodeTantra. As part of his current work, he is building a calculator to find the shortest distance between any 
two given locations in his city. As an experienced programmer, he understands that this is not a trivial problem. Fortunately, after investigating the city 
map he figured that the roads system has a special topology which can make his problem easier to deal with.
There are  locations in the city and  bidirectional roads connecting them. Each road  has the length of . The road system is designed in such a way that from a 
specific location one can travel to all other locations.
The graph can be represented as  adjacency matrix containing a series of integers. The first row contains  elements, 
each representing the distance between the first location and location  such that , assuming there is a direct road connecting the first location and location . 
This continues for all locations in the city with row  representing the distances to all locations. In total, there are  integers in the string. 0 represents no road between two locations. Any number other than 0 represents the distance of the road that connects two locations in the city. Distance between a location and itself is also represented by 0.
A string representation of this adjacency matrix is a space-separated sequence of distances, where the first N distances are of the first row and the next N of the 
second row and so on.
For example, the string 0 6 0 1 0 6 0 5 0 2 0 5 0 0 5 1 0 0 0 1 0 2 5 1 0  can be visualized as follows.
In the above example, the shortest distance between locations 3 to 1 is 7 going through locations 3, 5, 4, 1.

The function should return the shortest distance between the two given locations.
Constraints:
Length of each road is any non-negative integer
Number of total locations (N) is always between 1 and 100, both inclusive
start is the starting location, and is always between 1 and N , both inclusive
end is the destination location, and is always between 1 and N, both inclusive
 
Test Case 1:
Command Line Arguments: 0 6 0 1 0 6 0 5 0 2 0 5 0 0 5 1 0 0 0 1 0 2 5 1 0 3 1
Expected Output:
7
 '''
import sys

s = sys.argv[1]
start = int(sys.argv[2])
end = int(sys.argv[3])

def shortestDistance(s, start, end):
	# Write code here
	s = s.split()
	n = int(len(s)**0.5)
	costs = [float('inf') for i in range(n)]
	stack = [start-1]
	s =list(map(int,s))
	graph = []
	for i in range(n):
		temp = []
		for j in range(n):
			temp.append(s.pop(0))
		graph.append(temp)
	costs[start-1] = 0
	while(stack):
		current = stack[0]
		for i in range(n):
			if graph[current][i]!=0:
				newcost = graph[current][i]+costs[current]
				if newcost<costs[i]:
					costs[i]=newcost
					stack.append(i)
		stack.pop(0)
	return costs[end-1]
	
				
	

print(shortestDistance(s, start, end))

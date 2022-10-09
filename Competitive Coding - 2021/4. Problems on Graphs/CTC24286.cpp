/*
Problem Statement:
Assume that there is a mouse that has to navigate through a maze to cheese from its starting 
point in the shortest possible path.
Given the maze represented in a string called m, the size of the maze as r rows, c columns, 
the start position of the mouse and the position of cheese, the function should return the 
length of the shortest path if such a path is found. Otherwise, it should return -1.
The maze is a 2-dimensional grid of size r rows and c columns represented as a series of 1s and 0s. 
The first c 0s and 1s represent the first row and the next c represent the second row and so on until all r rows. 
In total, there are r*c 0s and 1s in the string. A 0 represents a position where the mouse cannot go whereas a 1 
represents a position where the mouse can go.

Test Case 1:
Command Line Arguments: 3 3 111101111 0,0 1,2
Expected Output:
3
**/
#include <iostream>
using namespace std;
#include <string>
#include <vector>
void solve(int i, int j, int m, int n, int r, int c, vector<vector<int>> &maze, vector<vector<int>> &vis, vector<string> &ans,string move){
	if(i==m and j==n){
		ans.push_back(move);
		return;
	}
	if(i+1<r and !vis[i+1][j] and maze[i+1][j]==1){
		vis[i][j]=1;
		solve(i+1,j,m,n,r,c,maze,vis,ans,move+'D');
		vis[i][j]=0;
	}
	if(j-1>=0 and !vis[i][j-1] and maze[i][j-1]==1){
		vis[i][j]=1;
		solve(i,j-1,m,n,r,c,maze,vis,ans,move+'L');
		vis[i][j]=0;
	}
	if(j+1>=0 and !vis[i][j+1] and maze[i][j+1]==1){
		vis[i][j]=1;
		solve(i,j+1,m,n,r,c,maze,vis,ans,move+'R');
		vis[i][j]=0;
	}
	if(i-1>=0 and !vis[i-1][j] and maze[i-1][j]==1){
		vis[i][j]=1;
		solve(i-1,j,m,n,r,c,maze,vis,ans,move+'U');
		vis[i][j]=0;
	}
}


int lengthOfShortestPath(int r, int c, string m, string start, string cheese) {
	// Write code here
	vector<vector<int>> maze(r,vector<int>(c,0));
	int i=0,j=0,k=0;
	while(k<m.size()){
		maze[i][j++]=m[k++]-'0';
		if(j==c)j=0,i++;
	}
	int x = cheese[0]-'0', z = cheese[2]-'0';
	int a=start[0]-'0',b=start[start.size()-1]-'0';
	vector<vector<int>> vis(r+1,vector<int> (c+1,0));
	vector<string> ans;
	int temp = 100000;
	solve(a,b,x,z,r,c,maze,vis,ans,"");
	for(int i=0;i<ans.size();i++){
		int p=ans[i].size();
		temp = min(temp,p);
	}
	return(temp==100000?-1:temp);

}

int main(int argc, char *argv[]) {
	int r = atoi(argv[1]);
	int c = atoi(argv[2]);
	string m(argv[3]);
	string start(argv[4]);
	string cheese(argv[5]);
	cout << lengthOfShortestPath(r, c, m, start, cheese) << "\n";
	return 0;
}

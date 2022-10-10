#include<stdio.h>
int recursive(int a[],int item,int p,int r){
	if(r<p)
		return 1;
	else if(a[p]==item)
		return p;
	else
		recursive(a,item,p+1,r);
}
int main(){
	int val,i,item,p,r,n,m;
	printf("enter the no of elements: ");
	scanf("%d",&n);
	int a[n];
	printf("Enter %d integer(s)\n",n);
	for(i=0;i<n;i++)
		scanf("%d",&a[i]);
	printf("enter the item to be search: ");
	scanf("%d",&m);
	p=0,r=n;
	val=recursive(a,m,p,r);
	if(val==1)
		printf("no item found");
	else
		printf("item location = %d  item = %d",val+1,m);
	return 0;
}

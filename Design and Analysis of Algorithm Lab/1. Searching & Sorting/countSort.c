#include<stdio.h>

void countSort(int arr[],int n){
	int k=arr[0];
	for(int i=0;i<n;i++)
		k=k<arr[i]?arr[i]:k;
		int count[123]={0};
	for(int i=0;i<n;i++)
		count[arr[i]]++;
	for(int i=1;i<=k;i++)
	    count[i]+=count[i-1];
	    int output[n];
	for(int i=n-1;i>=0;i--)
	    output[--count[arr[i]]]=arr[i];
	for(int i=0;i<n;i++)
	    arr[i]=output[i];
}

int main(){
	int n;
	printf("enter the no. of arry element: ");
	scanf("%d",&n);
	int arr[n];
	printf("enter the element: ");
	for(int i=0;i<n;i++)
		scanf("%d",&arr[i]);
		countSort(arr,n);
	for(int i=0;i<n;i++)
		printf("%d ",arr[i]);
	return 0;
}

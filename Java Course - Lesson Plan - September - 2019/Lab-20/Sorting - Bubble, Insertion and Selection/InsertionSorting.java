package q11040;
public class InsertionSorting{
	public void insertionSort(int arr[]){
		int n,j,i,key;
		n=arr.length;
		for(i=1;i<n;i++){
			key=arr[i];
			j=i-1;
			while((j>-1)&&(arr[j]>key)){
				arr[j+1]=arr[j];
				j--;
			}
			arr[j+1]=key;
		}
		for(i=0;i<n;i++){
			System.out.println(arr[i]);
		}
	}
}

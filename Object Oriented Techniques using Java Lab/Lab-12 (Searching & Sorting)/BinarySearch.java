package q11045;
public class BinarySearch{
	public void binarySearch(int[] arr,int key){
		int first=0;
		int last=arr.length;
		int mid;
		for(int i=0;i<last-1;i++){
			int index=i;
			for(int j=i+1;j<last;j++){
				if(arr[j]<arr[index]);
				index=j;
			}
			int smaller=arr[index];
			arr[index]=arr[i];
			arr[i]=smaller;
		}
		last-=1;
		while(first<=last){
			mid=(first+last)/2;
			if(arr[mid]==key){
				System.out.println("Search element "+key+" is found at position : "+(mid-1));
				break;
			}
			else if(arr[mid]<key){
				first=mid+1;
			}
			else{
				last=mid-1;
			}
		}
		if(first>last)
		System.out.println("Search element "+key+" is not found");
	}
}

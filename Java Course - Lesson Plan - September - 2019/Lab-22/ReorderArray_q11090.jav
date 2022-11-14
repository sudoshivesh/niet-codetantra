package q11090;

public class ReorderArray {
	/**
	 *Arrange all even numbers to infront of the array 
	 * 
	 * 
	 * 
	 * 
	 * @return result
	 */
	 
	public int[] reorder(int[] arr) {
		int a[]=new int[arr.length];
		int j=0;
		for(int i=0;i<arr.length;i++){
			if(arr[i]%2==0){
				a[j]=arr[i];
				j++;
			}
		}
		for(int i=0;i<arr.length;i++){
			if(arr[i]%2!=0){
				a[j]=arr[i];
				j++;
			}
		}
		return a;
	}
}

package q11047;
public class ReversePrint {
	/**
	 * write a logic to find the array of elements in reverse order.
	 * 
	 * 
	 * @return the reverseArray 
	 */
	 
	 public int[] reversePrint(int[] arr) {
	 	int startIndex=0;
	 	int endIndex=arr.length-1;
	 	while(startIndex<endIndex){
	 		int temp=arr[startIndex];
	 		arr[startIndex]=arr[endIndex];
	 		arr[endIndex]=temp;
	 		endIndex--;
	 		startIndex++;
	 	}
	 	return arr;
	 }
}

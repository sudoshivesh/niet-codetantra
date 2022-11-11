package q10944;

public class ArrayReverser {
	/**
	 * Compute the reverse order of the given array
	 * 
	 * 
	 * @return resultant array
	 */ 
	public int[] reverseArray(int[] arr) {
		//Write your code here
		int endIndex=arr.length-1;
		int startIndex=0;
		while(startIndex<endIndex){
			int temp=arr[startIndex];
			arr[startIndex]=arr[endIndex];
			arr[endIndex]=temp;
			startIndex++;
			endIndex--;
		}
		return arr;
	}	
}

package q10943;

public class ArrayElementCounter {
	/**
	 * Find number of times the element present in the given array
	 * 
	 * 
	 * 
	 * @retrun count
	 */
	 
	public int countElement(int[] arr, int element) {
		int count=0;
		for(int i=0;i<arr.length;i++){
			if(arr[i]==element)
			count++;
		}
		return count;
	}
}

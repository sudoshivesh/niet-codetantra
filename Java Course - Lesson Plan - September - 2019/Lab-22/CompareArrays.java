package q11087;

public class CompareArrays {
	/**
	 * Compute the difference between two arrays
	 * 
	 * Find the count of elements which have difference less than 2 and greater than -2
	 * 
	 * 
	 * 
	 * @return count
	 */ 
	
	public int compare(int[] arr1, int[] arr2) {
		//Write your code here
		int count=0;
		for(int i=0;i<arr1.length;i++){
			if(arr1[i]-arr2[i]>-2 && arr1[i]-arr2[i]<2)
			count++;
		}
		return count;
	}
}

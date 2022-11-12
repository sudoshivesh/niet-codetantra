package q11046;
public class SumOfElements {
	
	/**
	 * Computes the sum of all the elements in the given array
	 * 
	 * 
	 * @return the sum 
	 */
	long add = 0;
	public long sum(int[] arr) {
		// Write the code
		for(int i=0;i<arr.length;i++){
			add+=arr[i];
		}
		return add;
	}
}

package q11072;

public class FindAverage {
	/**
	 * Compute the average of elements in the given array
	 * 
	 * 
	 * @return result
	 */ 
	
	public int findAverage(int[] arr) {
		int sum=0;
		for(int i=0;i<arr.length;i++){
			sum=sum+arr[i];
		}
		return (sum/(arr.length));
	}
}

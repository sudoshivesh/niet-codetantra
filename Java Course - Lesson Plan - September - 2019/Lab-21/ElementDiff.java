package q11071;

public class ElementDiff {
	/**
	 * Compute the difference between large and small elements in the given arry
	 * 
	 * 
	 * @return result
	 */ 
	
	public int findDiff(int[] arr) {
		int largest=arr[0];
		int smallest=arr[0];
		for(int i=1;i<arr.length;i++){
			if(largest>arr[i]){
				largest=arr[i];
			}
		}
		for(int i=1;i<arr.length;i++){
			if(smallest<arr[i]){
				smallest=arr[i];
			}
		}
		int result=Math.abs(largest-smallest);
		return result;
	}
}

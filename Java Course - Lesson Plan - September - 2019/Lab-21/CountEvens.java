package q11069;


public class CountEvens {
	/**
	 * Find the count of even numbers in the given array
	 * 
	 * 
	 * 
	 * @return count
	 * 
	 */ 
	
	
	public int countEvens(int[] arr) {
		int count=0;
		for(int i=0;i<arr.length;i++){
			if(arr[i]%2==0){
				count++;
			}
		}
		return count;
	}
}

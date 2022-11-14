package q11097;

public class SequenceCheck {
	/**
	 * Find three consecutive elements in the array are in incremental order or not
	 * 
	 * 
	 * 
	 * @return result
	 */
	
	public boolean checkSequence(int[] arr) {
		//Write your code here
		for(int i=0;i<arr.length-2;i++){
			if(arr[i]+1==arr[i+1] && arr[i+1]+1==arr[i+2]){
				return true;
			}
		}
		return false;
	}
}

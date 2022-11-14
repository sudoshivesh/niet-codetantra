package q11096;

public class SymmetricalArrayCheck {
	/**
	 * Find if the first n numbers or equal to the last n numbers or not
	 * 
	 * 
	 * @return result
	 */ 
	
	public boolean checkSymmetry(int[] arr, int n) {
		//Write your code here
		for(int i=0;i<n;i++){
			if(arr[i]==arr[arr.length-n+i]){
				return true;
			}
		}
		return false;
	}
}

package q11082;

public class ElementCheckInEveryPair {
	/**
	 * Find every pair of array contains atleast one arg
	 * 
	 * 
	 * 
	 * 
	 *@return result 
	 */ 
	
	public boolean checkElement(int[] arr, int arg) {
		//Write your code here
		int count=0;
		for(int i=0;i<arr.length-1;i++){
			if(arr[i]==arg||arr[i+1]==arg){
				count++;
			}
		}
		if(count==arr.length-1)
		return true;
		else
		return false;
	}
}

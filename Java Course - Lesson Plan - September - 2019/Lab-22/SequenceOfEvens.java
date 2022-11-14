package q11095;

public class SequenceOfEvens {
	/**
	 * Find three consecutive even numbers are present in the array or not
	 * 
	 * 
	 * 
	 * @return result
	 */ 
	
	public boolean checkEvenSequence(int[] arr) {
		//Write your code here
		for(int i=0;i<arr.length;i++){
			if(arr[i]%2==0 && arr[i+1]%2==0 && arr[i+2]%2==0){
				return true;
			}
		}
		return false;
	}
}

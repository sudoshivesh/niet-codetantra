package q11075;

public class CountOfTwoNumbers {
	/**
	 * Find the count of arg1 is more than arg2 in the arr or not 
	 * 
	 * 
	 * 
	 * @return result
	 */ 
	
	public boolean compareCountOf(int[] arr, int arg1, int arg2) {
		int count=0,counter=0;
		for(int i=0;i<arr.length;i++){
			if(arr[i]==arg1){
				count++;
			}
			if(arr[i]==arg2){
				counter++;
			}
		}
		if(count>counter){
			return true;
		}
	return false;
	}
}

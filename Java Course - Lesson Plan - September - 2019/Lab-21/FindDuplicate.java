package q11073;

public class FindDuplicate {
	/**
	 * Find the arg element occures in the arr more than once
	 * 
	 * 
	 * @return result
	 */ 
	
	public boolean findDuplicate(int[] arr, int arg) {
		//Write your code here
		int count=0;
		for(int i=0;i<arr.length;i++){
			if(arr[i]==arg){
				count++;
			}
		}
		if(count>1)
		return true;
		else
		return false;
	}
}

package q11056;

public class ElementCheck {
	
	/**
	 * Find if the first four elements in the array contains number 4 or not
	 * 
	 * 
	 * @return result
	 */
	 
	public boolean elementFinder(int[] arr) {
		//Write your code here
		boolean result=false;
		int high=arr.length;
		int num=4;
		for(int i=0;i<high;i++){
			if(arr[i]!=num){
				result =false;
			}
			else if(high>num){
				result= false;
			}
			else{
				return true;
			}
		}
		return result;	
	}
}

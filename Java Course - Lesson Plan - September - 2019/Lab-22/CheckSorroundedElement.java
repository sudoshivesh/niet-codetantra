package q11088;

public class CheckSurroundedElement {
	/**
	 * Find the elements in the array surrounded by left and right and not equal to the left and right elements
	 * 
	 * 
	 * 
	 * @print the result
	 */ 
	
	public void checkElement(int[] arr) {
		//Write your code here
		for(int i=1;i<arr.length;i++){
			if(arr[i]!=arr[i-1] && arr[i]!=arr[i+1]){
				System.out.println(arr[i]);
			}
		}
	}
}

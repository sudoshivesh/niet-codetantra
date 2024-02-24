package q11089;

public class ReorderArray {
	/**
	 *Arrange all the zeros should come infront of the array
	 * 
	 * 
	 * 
	 *@return array
	 * 
	 */
	 
	public int[] reorder(int[] arr) {
		//Write your code here
		int[] a = new int[arr.length];
		
		int j=0;
		
		for(int i=0; i<arr.length; i++) {
			
			if(arr[i] ==0){
				
				a[j]=0;
				
				j++;
				
			}
		}
			
			for (int t=0; t<arr.length; t++){
				
				if(arr[t] !=0){
					
					a[j] = arr[t];
					
					j++;
					
				}
				
			}
			
			return a;
		
	}
}

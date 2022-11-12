package q11063;

public class InitializeArray {
	/**
	 * Set all the elemets in the array to given element and set to length of array to given length
	 * 
	 * 
	 * 
	 * @return arry 
	 */
	 
	public int[] initialize(int len, int ele) {
		int arr[] =new int[len];
		for(int i=0;i<len;i++){
			arr[i]=ele;
		}
	return arr;	
	}
}

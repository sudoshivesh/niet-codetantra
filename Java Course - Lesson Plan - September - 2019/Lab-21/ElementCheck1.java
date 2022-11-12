package q11054;

public class ElementCheck {
	/**
	 * Compute if the given elemetn is present in the array only one time
	 * 
	 * 
	 * @return true if it is present else return false
	 */
	
	public boolean elementFinder(int[] arr, int element) {
		int count=0;
		for(int i=0;i<arr.length;i++){
			if(arr[i]==element)
			count++;
		}
		if(count==1)
		return true;
		else
		return false;
	}
}

package q11067;

public class CompareArrays {
	/** Compare lengths and elements of the arr1 and arr2 are equal or not
	 * 
	 * 
	 * 
	 * @return result
	 */ 
	
	public boolean compareArrays(int[] arr1, int[] arr2) {
		if(arr1.length!=arr2.length){
			return false;
		}
		for(int i=0;i<arr1.length;i++){
			if(arr1[i]!=arr2[i]){
					return false;
			}
		}
		return true;
	}
}

package q10941;

public class IndexFinder {
	/**
	 * Find the first index match of the element in the array
	 * 
	 * 
	 * @return index
	 */ 
	
	public int printIndex(int[] intArr, int element) {
		int i;
		for(i=0; i<=intArr.length; i++){
			if(intArr[i]==element){
				break;
			}
		}
		return i;
	}
}

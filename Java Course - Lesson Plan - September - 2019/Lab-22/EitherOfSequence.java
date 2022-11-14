package q11094;

public class EitherOfASequence {
	/**
	 * Find the given sequences are present in the arry or not 
	 * 
	 * 
	 * 
	 * @return result
	 */ 
	
	public boolean checkSequences(int[] arr) {
		//Write your code here
		for(int i=0;i<arr.length;i++){
			if(arr[i]==18 && arr[i+1]==28){
				for(int j=0;j<arr.length;j++){
					if(arr[j]==33 && arr[j+1]==36){
						return false;
					}
				}
				return true;
			}
			if(arr[i]==33 && arr[i+2]==36){
				return true;
			}
		}
		return false;
	}
}

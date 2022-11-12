package q11059;

public class SequenceCheck {
	/**
	 * Find the given elements present consecutively in the array or not
	 * 
	 * 
	 * @return result
	 */ 
	
	public boolean sequenceCheck(int[] arr) {
		int count=0;
		for(int i=0;i<arr.length;i++){
			if(arr[i]==6 && arr[i+1]==9 && arr[i+2]==12){
				count+=1;
			}
		}
		if(count==1)
		return true;
		else
		return false;
	}
}

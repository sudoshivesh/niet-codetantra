package q11064;

public class SequenceCount {
	public int sequenceCount(int[] arr) {
		int count=0,i=0;
		for(i=0;i<arr.length-2;i++){
			if((arr[i+1]==2*arr[i]) && (arr[i+2]==3*arr[i])){
				count++;
			}
		}
		return count;
	}
}

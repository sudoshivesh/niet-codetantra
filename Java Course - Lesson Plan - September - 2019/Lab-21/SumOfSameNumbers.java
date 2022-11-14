package q11074;

public class SumOfSameNumber {
	/**
	 * Compute the sum of all arg elments in the arr is greater than 10 or not
	 * 
	 * 
	 * 
	 * @return result
	 */ 
	
	public boolean findSumOf(int[] arr, int arg) {
		int sum=0;
		for(int i=0;i<arr.length;i++){
			if(arr[i]==arg){
				sum=sum+arr[i];
			}
		}
		if(sum>=10){
			return true;
		}else{
			return false;
		}
	}
}

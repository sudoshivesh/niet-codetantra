package q11057;

public class SumOfElements {
	/**
	 * Compute sum of all +ve elements in the array excluding -ve numbers
	 * 
	 * 
	 * @return sum
	 */ 
		int sum=0;
		public int sum(int[] arr) {
			for(int i=0;i<arr.length;i++){
				if(arr[i]>=0){
					sum+=arr[i];
				}
			}
			return sum;
	}
}

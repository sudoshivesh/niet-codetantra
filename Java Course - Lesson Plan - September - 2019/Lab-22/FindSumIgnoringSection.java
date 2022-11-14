package q11093;
public class FindSumIgnoringSection {
	/**
	 * Compute the sum of all the elements in the array ignoring the elements between two ignore1 and ignore2 elements
	 * 
	 * 
	 * @return sum
	 * 
	 */ 
	public int findSum(int[] arr, int ignore1, int ignore2) {
		int sum=0,a=0,b=0;
		for(int i=0;i<arr.length;i++){
			if(arr[i]==ignore1){
				a=i;
			}
			if(arr[i]==ignore2){
				b=i;
			}
		}
		for(int i=0;i<arr.length;i++){
			if(i>=a && i<=b){
				continue;
			}else{
				sum+=arr[i];
			}
		}
		return sum;
	}
}

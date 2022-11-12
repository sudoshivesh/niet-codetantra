package q11061;

public class FindMiddle {
	/**
	 * Find the middle element in the given array
	 * 
	 * 
	 * 
	 * @ return element
	 */ 
	public void findMiddle(int[] arr) {
		int size=arr.length;
		if((arr.length)%2==0){
			System.out.println(arr[(size/2)-1]);
			System.out.println(arr[(size/2)]);
		}else{
			System.out.println(arr[size/2]);
		}
	}
}

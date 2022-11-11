package q10942;
public class ArrayElementCounter {
	public int countElement(int[] arr, int element) {
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == element) {
				count++;
			}
		}
		return count;
	}
}

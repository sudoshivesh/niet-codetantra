package q10940;
public class IndexFinder {
	public void printIndex(int[] intArr, int element) {
		for (int i = 0; i < intArr.length; i++) {
			if (intArr[i] == element) {
				System.out.println(i);
			}
		}
	}
}

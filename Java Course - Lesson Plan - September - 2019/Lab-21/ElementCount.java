package q11049;
public class ElementCount {
	public static void main(String[] args) {
		int[] arr = {1, 12, 9, 3, 5, 3, 78, 4, 3, 9, 18, 56, 1, 5};
		int element = Integer.parseInt(args[0]);
		int count=0;
		for(int i=0;i<arr.length;i++){
			if(arr[i]==element)
			count++;
		}
		System.out.println(count);
	}
}

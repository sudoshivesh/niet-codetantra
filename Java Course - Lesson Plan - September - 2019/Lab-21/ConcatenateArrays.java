package q11070;
public class ConcatenateArrays{
	public void concatenate(int arr1[],int arr2[]){
		int[] arr3=new int[arr1.length+arr2.length];
		for(int i=0;i<arr1.length;i++){
			arr3[i]=arr1[i];
		}
		for(int i=0;i<arr2.length;i++){
			arr3[arr1.length+i]=arr2[i];
		}
		for(int i=0;i<arr3.length;i++){
			System.out.println(arr3[i]);
		}
		
	}
}

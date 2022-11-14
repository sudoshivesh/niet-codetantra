package q11091;
public class MultiplesInArray{
	public static void findMultiples(int[] arr, int m1, int m2){
		int size=arr.length;
		for(int i=0;i<size;i++){
			if(arr[i]%m1==0 && arr[i]%m2==0){
				System.out.println(arr[i]+" is multiple of "+m1+" and "+m2);
			}else if(arr[i]%m2==0){
				System.out.println(arr[i]+" is multiple of "+m2);
			}else if(arr[i]%m1==0){
				System.out.println(arr[i]+" is multiple of "+m1);
			}else{
				System.out.println(arr[i]);
			}
		}
	}
}

package q11039;
public class BubbleSorting{
	public void bubbleSort(int[] array){
		int length=array.length;
		int i,j,dup=0;
		for(i=0;i<length;i++){
			for(j=0;j<(length-i-1);j++){
				if(array[j]>array[j+1]){
					dup=array[j+1];
					array[j+1]=array[j];
					array[j]=dup;
				}
			}
		}
		for(i=0;i<length;i++)
		System.out.println(array[i]);
	}
}

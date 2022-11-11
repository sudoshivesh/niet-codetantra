package q11041;
public class SelectionSortingLargestElement{
	public void selectionSortLargestEle(int[] array){
		int len=array.length;
		int i,j,dup=0,lar=0;
		for(i=len-1;i>=0;i--){
			lar=i;
			for(j=i-1;j>=0;j--){
				if(array[j]>array[lar])
				lar=j;
			}
			dup=array[lar];
			array[lar]=array[i];
			array[i]=dup;
		}
		for(i=0;i<len;i++)
		System.out.println(array[i]);
	}
}

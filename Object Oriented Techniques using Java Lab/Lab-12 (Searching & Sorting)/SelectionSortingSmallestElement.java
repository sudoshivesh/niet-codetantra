package q11042;
public class SelectionSortingSmallestElement{
	public void selectionSortSmallestEle(int[] array){
		int len=array.length;
		int i,j,dup=0,small=0;
		for(i=0;i<=(len-1);i++){
			small=i;
			for(j=i+1;j<=(len-1);j++){
				if(array[j]<array[small])
				small=j;
			}
			dup=array[small];
			array[small]=array[i];
			array[i]=dup;
		}
		for(i=0;i<len;i++)
		System.out.println(array[i]);
	}
}

package q11044;
public class LinearSearch{
	public void linearSearch(int[] array,int key){
		int flag=-1;
		int len=array.length;
		for(int i=0;i<len;i++){
			if(key==array[i]){
				flag=i;
				break;
			}
		}
		if(flag!=-1)
		System.out.println("Search element "+key+" is found at position : "+flag);
		else
		System.out.println("Search element "+key+" is not found");
	}
}

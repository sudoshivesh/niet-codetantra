package q11092;
import java.util.*;
public class FindCenteredAverage{
	public static int findCenteredAverage(int[] arr){
		int sum=0,avg=0;
		for(int i=0;i<arr.length-1;i++){
			for(int j=0;j<arr.length-i-1;j++){
				if(arr[j]>arr[j+1]){
					int t=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=t;
				}
			}
		}
		for(int i=1;i<arr.length-1;i++){
			sum+=arr[i];
		}
		avg=sum/(arr.length-2);
	return avg;
	}
}
//This program has been done by sudoshivesh

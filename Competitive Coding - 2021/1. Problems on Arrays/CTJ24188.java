/** Problem Statement:
The function should return the middle element in arr. If the length of arr is even then return the first middle element, otherwise return the middle one.

Constraint(s):
The number of elements in arr is between 1 and 500, both inclusive.
Function Rules:
Fill the missing logic in function middleElementOfArray with return type int and parameters as listed below:

List<Integer> arr
Sample Test Cases
Test Case 1:
Command Line Arguments: 2,4,6,8,5
Expected Output:
6 */

package q24188;
import java.util.*;
import java.util.stream.*;

public class CTJ24188 {

	public static int middleElementOfArray(List<Integer> arr) {
		// Write your code here
		
		int size = arr.size();
		int start = 0;
		int end = arr.size()-1;
		int mid = 0;
		
		if (size%2 != 0){
			
			mid = start + (end-start)/2;
		}
		else{
			
			mid = size/2-1;
		}
		
		return arr.get(mid);

	}

	public static void main(String[] args) {
		List<Integer> arr = Arrays.stream(args[0].split(",")).map(s -> Integer.parseInt(s)).collect(Collectors.toList());
		System.out.println(middleElementOfArray(arr));
	}
}

//The code is contributed by Shivesh Shivam (https://linktr.ee/sudoshivesh)

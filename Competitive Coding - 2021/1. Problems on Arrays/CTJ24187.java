/** Problem Statement:
The function should return the sum of the highest and lowest elements in arr

Constraint(s):
The number of elements in arr is between 1 and 10000, both inclusive.
Function Rules:
Fill the missing logic in function sumOfHighestAndLowestElements with return type int and parameters as listed below:

List<Integer> arr
Sample Test Cases
Test Case 1:
Command Line Arguments: 4,7,9,11,45,3
Expected Output:
48 */

package q24187;
import java.util.*;
import java.util.stream.*;

public class CTJ24187 {

	public static int sumOfHighestAndLowestElements(List<Integer> arr) {
		// Write your code here
		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;
		
		for (int i : arr){
			
			if (i > max){
				
				max = i;
			}
			if ( i < min){
				
				min = i;
			}
		}
		return min+max;
		

	}

	public static void main(String[] args) {
		List<Integer> arr = Arrays.stream(args[0].split(",")).map(s -> Integer.parseInt(s)).collect(Collectors.toList());
		System.out.println(sumOfHighestAndLowestElements(arr));
	}
}
//The code is contributed by Shivesh Shivam (https://linktr.ee/sudoshivesh)

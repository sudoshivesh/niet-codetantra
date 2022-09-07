/** Problem Statement:
The function should return the largest possible sum among all its contiguous sub-arrays.

Constraint(s):
The number of elements in arr is between 1 and 10000, both inclusive.
Test cases will time out if the code is inefficient and takes longer than configured time-out.
Function Rules:
Fill the missing logic in function maxSumContiguousSubArray with return type int and parameters as listed below:

List<Integer> arr
Sample Test Cases
Test Case 1:
Command Line Arguments: 2,4,6,8,5
Expected Output:
25 */

package q24189;
import java.util.*;
import java.util.stream.*;

public class CTJ24189 {

	public static int maxSumContiguousSubArray(List<Integer> arr) {
		
		int sum = Integer.MIN_VALUE;
		int size = arr.size();
		int end = 0;
		
		for (int i = 0; i<arr.size();i++){
			
			end += arr.get(i);
			if (sum < end){
				sum = end;
			}
			if(end < 0){
				end = 0;
			}
		}
		return sum;


	}

	public static void main(String[] args) {
		List<Integer> arr = Arrays.stream(args[0].split(",")).map(s -> Integer.parseInt(s)).collect(Collectors.toList());
		System.out.println(maxSumContiguousSubArray(arr));
	}
}

//The code is contributed by Shivesh Shivam (https://linktr.ee/sudoshivesh)

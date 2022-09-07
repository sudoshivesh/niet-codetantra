/**Problem Statement:
The function should return the sum of the elements of arr

Constraint(s):
The number of elements in arr is between 1 and 500, both inclusive.
Function Rules:
Fill the missing logic in function sumOfArray with return type int and parameters as listed below:

List<Integer> arr
Sample Test Cases
Test Case 1:
Command Line Arguments: 1,2,3,4,5
Expected Output:
15*/

package q24186;
import java.util.*;
import java.util.stream.*;

public class CTJ24186 {

	public static int sumOfArray(List<Integer> arr) {
		int sum = 0;
		
		for (int i = 0; i<arr.size();i++){
			 
			 sum +=arr.get(i);
		}
		return sum;
		

	}

	public static void main(String[] args) {
		List<Integer> arr = Arrays.stream(args[0].split(",")).map(s -> Integer.parseInt(s)).collect(Collectors.toList());
		System.out.println(sumOfArray(arr));
	}
}

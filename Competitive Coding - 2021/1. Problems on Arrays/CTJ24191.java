/** Problem Statement:
The function should return the concatenation of all the elements in arr whose lengths are equal to the corresponding positional indices in arr, assuming that the indices begin with 0 (in other words, the first element is at index 0).

Constraint(s):
The length of arr is between 1 and 500, both inclusive.
The matching elements should be concatenated in the order found in arr, scanning from left to right.
If there is no such match the function should return no match found
 arr may contain duplicates.
Function Rules:
Fill the missing logic in function lengthIndexMatch with return type String and parameters as listed below:

List<String> arr
Sample Test Cases
Test Case 1:
Command Line Arguments: aaa,a,ab,adcd,1234
Expected Output:
aab1234 */

package q24191;
import java.util.*;
import java.util.stream.*;

public class CTJ24191 {

	public static String lengthIndexMatch(List<String> arr) {
		// Write your code here
		
		StringJoiner str = new StringJoiner("");
		boolean ans = false; 
		for (int i = 0; i<arr.size();i++){
			if (arr.get(i).length() == i){
				
				str.add(arr.get(i));
				ans = true;
				
			}
			
		}
		if(!ans){
			return "no match found";
		}
		
		return str.toString();

	}

	public static void main(String[] args) {
		List<String> arr = Arrays.stream(args[0].split(",")).map(s -> s).collect(Collectors.toList());
		System.out.println(lengthIndexMatch(arr));
	}
}

//The code is contributed by Shivesh Shivam (https://linktr.ee/sudoshivesh)

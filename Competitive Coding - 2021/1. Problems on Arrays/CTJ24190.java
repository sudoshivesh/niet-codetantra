/** Problem Statement:
The function should return all the pairs of indices of arr, the elements at which position add up to s, formatted as a string.

Constraint(s):
The return string should be formed by concatenation of all such pairs separated by commas. Each pair should be of the form <element 1 index,element 2 index>, where element 1 index is always less than element 2 index
If more than one such pair exists, they have to be concatenated using comma as the separator and the pairs should be in sorted order, sorted first by element 1 index and then by element 2 index
If no such pairs exist in the array, the function should return the string no such pairs
arr may contain duplicates.
The number of elements in arr is between 1 and 5000, both inclusive.
Index position of the array should start from 0. In other words, the position of the first element of the array is 0.
s is any integer
Function Rules:
Fill the missing logic in function pairsOfSum with return type String and parameters as listed below:

List<Integer> arr
int s
Sample Test Cases
Test Case 1:
Command Line Arguments: 3,5,6,7,1,8 11
Expected Output:
<0,5>,<1,2>  */

package q24190;
import java.util.*;
import java.util.stream.*;

public class CTJ24190 {

	public static String pairsOfSum(List<Integer> arr, int s) {
		
		StringJoiner str = new StringJoiner(",");
		boolean ans = false;
		for (int i = 0; i<arr.size();i++){
			for (int j = i+1; j<arr.size();j++){
				if(arr.get(i)+arr.get(j) == s){
					str.add("<"+i +","+j+">");
					ans = true;
				}
			}
		}
		if (!ans){
			return "no such pairs";
		}
		return str.toString();
		
		
		// Write your code here

	}

	public static void main(String[] args) {
		List<Integer> arr = Arrays.stream(args[0].split(",")).map(s -> Integer.parseInt(s)).collect(Collectors.toList());
		int s = Integer.parseInt(args[1]);
		System.out.println(pairsOfSum(arr, s));
	}
}
//This code is contributed by Shivesh Shivam (https://linktr.ee/sudoshivesh)

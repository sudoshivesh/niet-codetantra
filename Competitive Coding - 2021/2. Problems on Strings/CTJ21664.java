/** Problem Statement:
The function should return a boolean indicating whether the first n characters of the string are same as the last n characters of the string s in reverse.

Constraints:
s is a string of length between 1 and 100 inclusive.
n is an integer of length in between 0 and the length of the string s.
Test cases will time out if the code is inefficient and takes longer than 4 seconds for any test case
.
Function Rules:
Fill the missing logic in function isEqualCharacters with return type boolean and parameters as listed below:

String s
int l
Sample Test Cases
Test Case 1:
Command Line Arguments: redivider 4
Expected Output:
true */

package q21664;

public class CTJ21664 {

	public static boolean isEqualCharacters(String s, int l) {
		
		for (int i =0; i<s.length();i++){
			char start = s.charAt(i);
			char end = s.charAt(s.length()-1-i);
			
			if (start != end){
				return false;
			}
		}
		return true;
		// Write your code here

	}

	public static void main(String[] args) {
		String s = args[0];
		int l = Integer.parseInt(args[1]);
		System.out.println(isEqualCharacters(s, l));
	}
}

//This code is contributed by Shivesh Shivam (https://linktr.ee/sudoshivesh)

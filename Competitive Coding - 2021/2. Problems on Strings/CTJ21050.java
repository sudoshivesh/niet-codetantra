/** Problem Statement:
The function should return the first string of length l, made of characters in the string s such that:

All the characters in the return value are unique
Consecutive characters in the return value should not be present consecutively in s
The return value should have characters in the same order as they appear in s
The returned string should be the first such string possible while looking at characters in s left to right
The number of characters in s is between 1 and 20, both inclusive
Duplicate characters do not exist in s
Value of l is always between 1 and length of s, both inclusive
If a sub-string of length l cannot be formed from s, with the above conditions, then the function should return the string NotFound
Function Rules:
Fill the missing logic in function getFirstSubString with return type String and parameters as listed below:

String s
int l
Sample Test Cases
Test Case 1:
Command Line Arguments: CodeTa 4
Expected Output:
NotFound

Test Case 2:
Command Line Arguments: CodeTan 4
Expected Output:
CdTn */

package q21050;

public class CTJ21050 {

	public static String getFirstSubString(String s, int l) {
		
		
		String ans = "";
		int start = 0;
		
		while(start < s.length()){
			
			ans += s.charAt(start);
			start += 2;
			
			if (ans.length() == l){
				return ans;
			}
			
		}
		return "NotFound";


	}

	public static void main(String[] args) {
		String s = args[0];
		int l = Integer.parseInt(args[1]);
		System.out.println(getFirstSubString(s, l));
	}
}

//The code is contributed by Shivesh Shivam (https://linkedin.com/in/sudoshivesh)

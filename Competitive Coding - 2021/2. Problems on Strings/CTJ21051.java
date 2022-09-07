/** Problem Statement:
The function should return a boolean indicating whether s is a palindrome of prime length, given that s is a string of length between 1 and 100 inclusive

Function Rules:
Fill the missing logic in function isPrimeLengthPalindrome with return type boolean and parameters as listed below:

String s
Sample Test Cases
Test Case 1:
Command Line Arguments: madam
Expected Output:
true

Test Case 2:
Command Line Arguments: abccba
Expected Output:
false  */

package q21051;

public class CTJ21051 {

	public static boolean isPrimeLengthPalindrome(String s) {
		
		int num = s.length();
		String temp = "";
		for (int i= num-1; i>=0; i--){
			
			temp += s.charAt(i);
		}
		for (int j = 2; j<num;j++) {
			
			if (num%j == 0){
				return false;
			}
		
	}
	
	return (s.equals(temp));
	// return false;

	}

	public static void main(String[] args) {
		String s = args[0];
		System.out.println(isPrimeLengthPalindrome(s));
	}
}

//The code is contributed by Shivesh Raazzput (https://instagram.com/mr_raazzput)

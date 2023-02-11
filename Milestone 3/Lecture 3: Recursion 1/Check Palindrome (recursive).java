/*
Check Palindrome (recursive)
Check whether a given String S is a palindrome using recursion. Return true or false.
Input Format :
String S
Output Format :
'true' or 'false'
Constraints :
0 <= |S| <= 1000
where |S| represents length of string S.
Sample Input 1 :
racecar
Sample Output 1:
true
Sample Input 2 :
ninja
Sample Output 2:
false
*/

public class solution {
	
	public static boolean isStringPalindrome(String input) {
		boolean ans= isStringPalindrome(input,0, input.length() - 1);
		return ans;
	}
	public static boolean isStringPalindrome(String input,int start,int end) {
		// Write your code here
		if(start>=end){
			return true;
		}
		boolean ans=true;
		if(input.charAt(start)!=input.charAt(end)){
			return false;
		}
		ans=isStringPalindrome(input,start+1,end-1);
		return ans;
	}
}

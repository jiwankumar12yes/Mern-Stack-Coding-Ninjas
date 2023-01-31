/*
Reverse String Wordwise
Reverse the given string word wise. That is, the last word in given string should come at 1st place, last second word at 2nd place and so on. Individual words should remain as it is.
Input format :
String in a single line
Output format :
Word wise reversed string in a single line
Constraints :
0 <= |S| <= 10^7
where |S| represents the length of string, S.
Sample Input 1:
Welcome to Coding Ninjas
Sample Output 1:
Ninjas Coding to Welcome
Sample Input 2:
Always indent your code
Sample Output 2:
code your indent Always
*/
public class Solution {
	// public static String reverseWordWise(String input) {
	// 	// Write your code here
	// 	String ans="";
    //     int Start=0;
    //     int i=0;
    //     for(;i<input.length();i++){
    //         if(input.charAt(i)==' '){
    //             int end=i-1;
    //             String reverseWord="";
    //             for(int j=Start;j<end;j++){
    //                 reverseWord=input.charAt(j)+reverseWord;
    //             }
    //             ans=ans+reverseWord+" ";
    //             Start=i+1;
    //         }
    //     }
    //     int end=i-1;
    //                 String reverseWord="";
    //                 for(int j=Start;j<end;j++){
    //                     reverseWord=input.charAt(j)+reverseWord;
    //                 }
    //                 ans=ans+reverseWord+" ";
    //                 return ans;
	// }
    public static String reverseWordWise(String input) {
        int end = input.length();
        int i = input.length() - 1;
        String output = "";
        while (i >= 0) {
            if (input.charAt(i) == ' ') {
                output = output + input.substring(i + 1, end) + " ";
                end = i;
            }
            i--;
        }
        output += input.substring(i + 1, end);
        return output;
    }
}

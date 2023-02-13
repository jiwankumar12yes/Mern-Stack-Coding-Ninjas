/*
Return all codes - String
Assume that the value of a = 1, b = 2, c = 3, ... , z = 26. You are given a numeric string S. Write a program to return the list of all possible codes that can be generated from the given string.
Note : The order of codes are not important. And input string does not contain 0s.
Input format :
A numeric string
Constraints :
1 <= Length of String S <= 10
Sample Input:
1123
Sample Output:
aabc
kbc
alc
aaw
kw
*/
public class solution {

 // Return a string array that contains all possible codes
 public static  String[] getCode(String input, int sI){
  // Write your code here
        // Can you see?
        int d=0;
        if(sI==input.length())
        {
            String ans[] = {""};
            return ans;
        }
        String[] ans1 = null;
        String[] ans2 = null;
        int c = 0;
        int a= input.charAt(sI) -'0';
        ans1 = getCode(input, sI + 1);
        if((input.length() - sI) >= 2){
            int b=input.charAt(sI + 1)-'0';
            c = a*10 + b;
            if(c > 9 && c < 27){
                ans2 = getCode(input, sI + 2);
                d=ans2.length;
            }
        }
            String ans[] = new String[ans1.length + d];
        int k=0;
        for(int i=0; i< ans1.length;i++)
        {
            ans[k]=returnCodes(a) + ans1[i];
            k++;
        }
        for(int i=0; i<d; i++ )
        {
            ans[k]=returnCodes(c) + ans2[i];
            k++;
        }
        return ans;
  
 }
    
    public static String[] getCode(String input)
    {
        return getCode(input, 0);
    }
    
    
    public static char returnCodes(int n){
        return  (char)(n + 'a' - 1);
    }

}

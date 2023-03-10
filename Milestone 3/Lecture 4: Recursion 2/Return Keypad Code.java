/*
Return Keypad Code
Given an integer n, using phone keypad find out all the possible strings that can be made using digits of input n.
Return empty string for numbers 0 and 1.
Note : 1. The order of strings are not important.
2. Input and output has already been managed for you. You just have to populate the output array and return the count of elements populated in the output array.
Input Format :
Integer n
Output Format :
All possible strings in different lines
Constraints :
1 <= n <= 10^6
Sample Input:
23
Sample Output:
ad
ae
af
bd
be
bf
cd
ce
cf
*/
public class solution {

	// Return a string array that contains all the possible strings
	public static String[] keypad(int n){
		// Write your code here
		if(n<=0)
        {
            String []str = {""};
            return str;
        }
        
        String small[] = keypad(n/10);
        String value = keys(n%10);
        String output[] = new String[small.length*value.length()];
        int k = 0;
        for(int i = 0; i<small.length; i++)
        {
            for(int j = 0; j<value.length(); j++)
            {
            	output[k] = small[i]+value.charAt(j);    
                k++;
            }
        
        }
        
        return output;
        

	}
    
    public static String keys(int n)
    {
        String str[] ={"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
        return str[n];
    }
	
}

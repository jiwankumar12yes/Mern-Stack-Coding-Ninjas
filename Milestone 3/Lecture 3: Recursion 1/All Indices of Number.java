/*
All Indices of Number
Given an array of length N and an integer x, you need to find all the indexes where x is present in the input array. Save all the indexes in an array (in increasing order).
Do this recursively. Indexing in the array starts from 0.
Input Format :
Line 1 : An Integer N i.e. size of array
Line 2 : N integers which are elements of the array, separated by spaces
Line 3 : Integer x
Output Format :
indexes where x is present in the array (separated by space)
Constraints :
1 <= N <= 10^3
Sample Input :
5
9 8 10 8 8
8
Sample Output :
1 3 4
*/

public class Solution {

	public static int[] allIndexes(int input[], int x) {
		/* Your class should be named Solution
		 * Don't write main().
		 * Don't read input, it is passed as function argument.
		 * Return output and don't print it.
	 	 * Taking input and printing output is handled automatically.
		*/
		return allIndexes(input, x,0);
	}
	public static int[] allIndexes(int[] input,int x,int startIndex){
		if(startIndex==input.length)
        {
            int output[]=new int[0];
            return output;
        }
        int smallAns[]=allIndexes(input,x,startIndex+1);
        if(input[startIndex]==x)
        {
            int answer[]=new int[smallAns.length+1];
            answer[0]=startIndex;
            for(int i=0;i<smallAns.length;i++){
              answer[i+1]=smallAns[i];
            }
             return answer;
        }
       else
           return smallAns;
		
	}
}

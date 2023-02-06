/*
Sum of Array
Given an array of length N, you need to find and return the sum of all elements of the array.
Do this recursively.
Input Format :
Line 1 : An Integer N i.e. size of array
Line 2 : N integers which are elements of the array, separated by spaces
Output Format :
Sum
Constraints :
1 <= N <= 10^3
Sample Input 1 :
3
9 8 9
Sample Output 1 :
26
Sample Input 2 :
3
4 2 1
Sample Output 2 :
7    
*/
public class Solution {

	public static int sum(int input[]) {
		/* Your class should be named Solution
		 * Don't write main().
		 * Don't read input, it is passed as function argument.
		 * Return output and don't print it.
	 	 * Taking input and printing output is handled automatically.
		*/
		int ans=0;
		if(input.length<=1){
			ans=ans+input[0];
			return ans;
		}
		int temp[]=new int[input.length-1];
		for(int i=1;i<input.length;i++){
			temp[i-1]=input[i];
		}
		ans = sum(temp) + input[0];
		// sum(temp);
		
		return ans;
	}
}

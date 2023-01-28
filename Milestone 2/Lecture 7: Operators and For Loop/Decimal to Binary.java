/*
Decimal to Binary
Given a decimal number (integer N), convert it into binary and print.
The binary number should be in the form of an integer.
Note: The given input number could be large, so the corresponding binary number can exceed the integer range. So you may want to take the answer as long for CPP and Java.


Note for C++ coders: Do not use the inbuilt implementation of "pow" function. The implementation of that function is done for 'double's and it may fail when used for 'int's, 'long's, or 'long long's. Implement your own "pow" function to work for non-float data types.


Input format :
Integer N
Output format :
Corresponding Binary number (long)
Constraints :
0 <= N <= 10^5
Sample Input 1 :
12
Sample Output 1 :
1100
Sample Input 2 :
7
Sample Output 2 :
111
*/
import java.util.*;
public class Main {
	
	public static void main(String[] args) {
		// Write your code here
    Scanner s=new Scanner(System.in);
		  int num=s.nextInt();
        // long ans=0;
        // long pv = 0;
        // while(num>0){
        //     int rem=num%2;
        //    ans=ans+(rem*(long)Math.pow(10,pv++));
        //     num=num/2;
        // }
        // System.out.println(ans);
		String ans=Integer.toString(num,2);
		System.out.println(ans);
	}
}

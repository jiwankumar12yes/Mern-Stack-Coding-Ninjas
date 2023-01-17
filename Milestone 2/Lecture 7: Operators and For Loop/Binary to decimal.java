/*
Binary to decimal
Given a binary number as an integer N, convert it into decimal and print.
Input format :
An integer N in the Binary Format
Output format :
Corresponding Decimal number (as integer)
Constraints :
0 <= N <= 10^9
Sample Input 1 :
1100
Sample Output 1 :
12
Sample Input 2 :
111
Sample Output 2 :
7
*/
import java.util.*;
public class Main {
	
	public static void main(String[] args) {
		// Write your code here
	Scanner s=new Scanner(System.in);
        int num=s.nextInt();
        int pv=0;
        int ans=0;
        while(num!=0){
            int temp=num%10;
            ans=ans+temp*(int)Math.pow(2,pv);
            num=num/10;
            pv++;
        }
        System.out.print(ans);
	}
}

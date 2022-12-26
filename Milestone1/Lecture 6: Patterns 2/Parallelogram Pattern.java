/*
Parallelogram Pattern
Write a program to print parallelogram pattern for the given N number of rows.
For N = 4



The dots represent spaces.
Input Format :
 A single integer : N
Output Format :
Required Pattern
Constraints :
0 <= N <= 50
*/
import java.util.*;
public class Main {
	
	public static void main(String[] args) {
		// Write your code here
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int i = 1;
		while (i <= n) {
			int j = 1;
			while (j <= i - 1) {
				System.out.print(" ");
				j++;
			}
			j = 1;
			while (j <= n) {
				System.out.print("*");
				j++;
			}
			System.out.println();
			i++;
		}

	}
}

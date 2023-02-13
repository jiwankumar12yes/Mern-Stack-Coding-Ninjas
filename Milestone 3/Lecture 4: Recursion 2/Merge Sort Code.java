/*
Merge Sort Code
Sort an array A using Merge Sort.
Change in the input array itself. So no need to return or print anything.
Input format :
Line 1 : Integer n i.e. Array size
Line 2 : Array elements (separated by space)
Output format :
Array elements in increasing order (separated by space)
Constraints :
1 <= n <= 10^3
Sample Input 1 :
6 
2 6 8 5 4 3
Sample Output 1 :
2 3 4 5 6 8
Sample Input 2 :
5
2 1 5 2 3
Sample Output 2 :
1 2 2 3 5 
*/
public class solution {

	public static void mergeSort(int[] input){
		// Write your code here
		if(input.length<=1){
			return;
		}
		int arr1[]=new int[input.length/2];
		int arr2[]=new int[input.length-arr1.length];
		for(int i=0;i<arr1.length;i++){
			arr1[i]=input[i];
		}
		int k=0;
		for(int i=arr1.length;i<input.length;i++){
			arr2[k++]=input[i];
		}
		mergeSort(arr1);
		mergeSort(arr2);
		merge(arr1,arr2,input);
		
	}
	public static void merge(int arr1[],int arr2[],int result[]){
		int i=0,j=0,k=0;
		while(i<arr1.length && j<arr2.length){
			if(arr1[i]<=arr2[j]){
				result[k]=arr1[i];
				i++;
				k++;
			}
			else{
				result[k]=arr2[j];
				j++;
				k++;
			}

		}
		  while (i<arr1.length)
        {
            result[k]=arr1[i];
            i++;
            k++;
        }
        while(j<arr2.length)
        {
            result[k]=arr2[j];
            j++;
            k++;
        }
	}
}

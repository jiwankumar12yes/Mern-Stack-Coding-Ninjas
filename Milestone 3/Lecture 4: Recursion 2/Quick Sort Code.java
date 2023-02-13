/*
Sort an array A using Quick Sort.
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
1 5 2 7 3
Sample Output 2 :
1 2 3 5 7 
*/
/*
	To apply the method explained in the hint video, we have to add two more parameters in the function call. This can be done by calling input helper function from given function. The helper function can have three parameters: array, start index, end index.  
	
	Skeleton code to achieve this:
	public class Solution {
		public static void quickSort(int[] input, int startIndex, int endInedx) {
			// your code goes here
		}
	
		public static void quickSort(int[] input) {
			quickSort(input, 0, input.length - 1);
		}
	
	}
	
*/

public class Solution {
    
    
    public static int partition(int[] arr, int si, int ei){
        
        int pivot_ele = arr[si];
        int count = 0;
        
        // find index of pivot_ele
        for(int i = si + 1; i <= ei; i++){
            if(pivot_ele > arr[i]){
                count ++;
            }
        }
        
        // put pivot_ele at its correct position
        int temp = arr[si + count];
        arr[si + count] = pivot_ele;
        arr[si] = temp;
        
        // now do pivot_ele right ele is greater and equal to pivot
        // left of pivot_ele is ess then pivot_ele
        int i = si;
        int j = ei;
        
        while(i < j){
            if(arr[i] < pivot_ele){
                i ++;
            }else if(arr[j] >= pivot_ele){
                j --;
            }else{
                temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i ++;
                j --;
            }
        }
        
        return si + count;
        
    }
    
        
    public static void quickSorthelper(int[] input, int start, int end) {
       

        if(start >= end){
            return;
        }

        int pivot_index = partition(input, start, end);
        quickSorthelper(input, start, pivot_index - 1);
        quickSorthelper(input, pivot_index + 1, end);

    }
    
    
    public static void quickSort(int input[]){
        
        quickSorthelper(input, 0, input.length - 1);
        
    }

	
}

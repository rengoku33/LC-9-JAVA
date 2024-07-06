import java.util.*;
/*
take the last element as pivot,
while l<=r
    iterate l till l val bigger than pivot and vice verca,
    swap l and r,
now l has crossed r, swap pivot with l and return l
*/
public class Main
{
	public static void main(String[] args) {
	    int[] arr = {33,77,55,1,11,44,63};
	    qss(arr, 0, arr.length-1);
	    System.out.println(Arrays.toString(arr));
	    }
	
	// helper method
	public static void qss(int[] arr, int left, int right){
	    if(left<=right){
	        int partition_pos = partitioner(arr, left, right);
	        qss(arr, left, partition_pos-1);
	        qss(arr, partition_pos+1, right);    
	    }
	    
	}
	public static int partitioner(int[] arr, int left, int right){
	    int pivot = right;
	    int i = left;
	    int j = right-1;
	    while(i<=j){
	        while(arr[i]<=arr[pivot] && i<right){
	            i++;
	        }
	        while(arr[j]>=arr[pivot] && j>left){
	            j--;
	        }
	        // found swap elements
	        if(i<j){
	            int temp = arr[i];
	            arr[i] = arr[j];
	            arr[j] = temp;
	            
	            i++;j--;
	        }
	    }
	    // l has crossed r
            int temp = arr[i];
	    arr[i] = arr[pivot];
	    arr[pivot] = temp;	    
	    return i;
	}

	
}

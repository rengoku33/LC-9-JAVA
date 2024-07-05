import java.util.*;
public class Main
/*
take the last element as pivot, two pointers l and r,
while l<r
    iterate l till arr[l]>pivot and vice verca for r,
    swap val of l and r
now swap l with pivot
*/
{
	public static void main(String[] args) {
    int[] arr = {77,33,63,5,16,55,11,1,44};
    qss(arr, 0, arr.length-1);
	System.out.println(Arrays.toString(arr));
	}
	
	public static void qss(int[] arr, int start, int end){
	    if(start<end){
	        int partition_pos = partitioner(arr, start, end);
	        qss(arr, start, partition_pos-1);
	        qss(arr, partition_pos+1, end);
	        
	    }
	}
	
	public static int partitioner(int[] arr, int start, int end){
	    int pivot = arr[end], l=start, r=end-1;
	    while(l<=r){
	        if(arr[l]<pivot){
	            l++;
	            continue;
	        }
	        if(arr[r]>pivot){
	            r--;
	            continue;
	        }
	        // now we reach a point where l is bigger than pivot and r is smaller
	        int temp = arr[l];
	        arr[l] = arr[r];
	        arr[r] = temp;
	        l++;r--;
	    }
	    // now l has crossed r, swap pivot with l
	    arr[end] = arr[l];
	    arr[l] = pivot;
	    return l;
	}
}

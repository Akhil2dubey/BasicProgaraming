package codingQ;

import java.util.Arrays;

public class BinarySearch {
    public static void main(String[] args) {
        
        int[] arr = {1,2,3,4,5,6,7};
        
        // If arr is not sorted than make it sorted usign Arrays.sort(arr) method.
        
        int target = 5;
        
        int left = 0;
        int right = arr.length-1;
        
        int mid = -1;
        
        while (left <=right) {
        	
        	mid = left + (right-left)/2;
        	
//        	System.out.println("mid " + mid);
//        	System.out.println("arr[mid] " + arr[mid]);
        	
        	if (arr[mid] == target) {
        		break;
        	}
        	
             if (arr[mid]<target) {
        		left = mid+1;
        	}
        	
        	else {
        		right = mid -1;
        	}
        	
        }
        
        System.out.println("position is " + mid);
     //   System.out.println("actual value is " + arr[mid]);
       
    }

} 


package TwoPointers;

import java.util.Arrays;

class Solution { 
    public void sortColors(int[] a) { 
        int low = 0; 
        int mid = 0; 
        int high = a.length - 1; 
        
        while (mid <= high) { 
            if (a[mid] == 0) { 
                int tmp = a[low]; 
                a[low] = a[mid]; 
                a[mid] = tmp; 
                low++; 
                mid++; 
            } else if (a[mid] == 1) { 
                mid++; 
            } else if (a[mid] == 2) { 
                int tmp = a[high]; 
                a[high] = a[mid]; 
                a[mid] = tmp; 
                high--; 
            } 
        } 
    } 
}

public class DutchFlag {
    public static void main(String[] args) {
        Solution solver = new Solution();

        int[] nums = {2, 0, 2, 1, 1, 0};
        solver.sortColors(nums);
        System.out.println("Sorted array:   " + Arrays.toString(nums));
    }
}

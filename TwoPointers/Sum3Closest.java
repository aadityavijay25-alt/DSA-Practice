package TwoPointers;

import java.util.Arrays;

public class Sum3Closest {
    public static void main(String[] args) {
        int[] a = {-1, 2, 1, -4};
        int target = 1;
        int n = a.length;

        Arrays.sort(a);

        int closestSum = a[0] + a[1] + a[2]; 
        int minDiff = Math.abs(closestSum - target);

        for (int i = 0; i < n - 2; i++) {        
            int l = i + 1;
            int r = n - 1;

            while (l < r) {
                int sum = a[i] + a[l] + a[r];    
                int diff = Math.abs(sum - target);

                if (diff < minDiff) {            
                    minDiff = diff;
                    closestSum = sum;
                }

                if (sum == target) {             
                    System.out.println(sum);
                    return;
                } else if (sum < target) {
                    l++;
                } else {
                    r--;
                }
            }
        }

        System.out.println(closestSum);
    }
}
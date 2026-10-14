package SlidingWindow;

public class MaxConsecutiveOnes {
    public static void main(String[] args) {
        int[] a = {1, 1, 1, 0, 0, 0, 1, 1, 1, 1, 0};
        int k = 2;
        int n = a.length;
        
        int low = 0;
        int high = 0;
        int zeros = 0;
        int maxLen = 0;

        while (high < n) {
            if (a[high] == 0) {
                zeros++;
            }
            
            // Shrink window using a while loop if zeros exceed allowed limit 'k'
            while (zeros > k) {
                if (a[low] == 0) {
                    zeros--;
                }
                low++;
            }
            
            maxLen = Math.max(maxLen, high - low + 1);
            high++;
        }
        
        System.out.println(maxLen);
    }
}

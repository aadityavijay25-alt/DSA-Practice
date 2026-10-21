package SlidingWindow;

public class findMaxAverage {
    public static void main(String[] args) {
        int[] a = {1, 12, -5, -6, 50, 3};
        int k = 4;
        
        int sum = 0;
        for(int i = 0; i < k; i++){
            sum += a[i];
        }
        
        int maxSum = sum;
        for(int i = k; i < a.length; i++){
            sum = sum - a[i-k] + a[i];
            maxSum = Math.max(maxSum, sum);
        }

        double maxAverage = (double) maxSum / k;

        System.out.println(maxAverage);
    }
}

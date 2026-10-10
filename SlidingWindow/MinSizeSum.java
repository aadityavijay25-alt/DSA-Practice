package SlidingWindow;

public class MinSizeSum {
    public static void main(String[] args) {
        int[] a = {2,3,1,2,4,3};
        int target = 7;
        int n= a.length;
        int low = 0;
        int high = 0;
        int res = Integer.MAX_VALUE;
        int sum = 0;
        while(high<n){
            sum += a[high];
            while(sum>=target){
                int len = high - low + 1;
                res = Math.min(res, len);
                sum -= a[low];
                low++;
            }
            high++;
        }
        System.out.println(res);
    }
    
}

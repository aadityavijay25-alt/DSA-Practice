package SlidingWindow;

public class MaxSumOfSubArray {
    public static void main(String[] args) {
        int[] a = {100,200,300,400};
        int n = a.length;
        int k = 2;
        int sum =0, res = 0;
        int low=0 , high=k-1;
        for(int i= low; i<=high; i++){
            sum = sum + a[i];
        }
        while(high<n){
            res = Math.max(res, sum);
            low++;
            high++;
            if(high == n){
                break;
            } else {
                sum = sum - a[low-1] + a[high];
            }
        }
        System.out.println(res);
    }
    
}

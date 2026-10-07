package TwoPointers;
import java.util.ArrayList;
import java.util.Arrays;

public class TripletSmaller {
    public static void main(String[] args) {
        int[] a = {-2, 0, 1, 3};
        int target = 2;
        // ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        int ans = 0;
        
        int n = a.length;
        Arrays.sort(a);

        for(int i=0; i<n-2; i++){
            int l = i+1;      //left
            int r = n-1;      //right
            while (l < r) {
            int sum = a[i] + a[l] + a[r];
    
            if (sum < target){
                ans += (r-l);
                l++;
            } else {
                r--;   
            }
        }
    }
    System.out.println(ans);
 }
}

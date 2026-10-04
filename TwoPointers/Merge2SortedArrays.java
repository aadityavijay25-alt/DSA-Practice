package TwoPointers;

import java.util.Arrays;

public class Merge2SortedArrays {
    public static void main(String[] args) {
        int[] a = {1,3,5};
        int[] b = {2,4,6};
        int m= a.length;
        int n = b.length;
        int i=0, j=0, id=0;
        int[] res = new int[m+n];
        while(i<n && j<m){
            if(a[i] <= b[j]){
                res[id] = a[i];
                id++;
                i++;
            } else {
                res[id] = b[j];
                id++;
                j++;
            }
        }
        // for the last which one array complete first
        while(j<m){
            res[id] = b[j];
            id++;
            j++;
        }
        while(i<n){
            res[id] = a[i];
            id++;
            i++;
        }
        System.out.println(Arrays.toString(res));

    }
    
}

package TwoPointers; 

import java.util.*; 
import java.util.List; 
import java.util.ArrayList; 

public class TripletSumZero { 
    public static void main(String[] args) { 
        int[] a = {-1,2,0,-1,1,4}; 
        int n = a.length; 
        List<List<Integer>> res = new ArrayList<>(); 
        
        Arrays.sort(a); 
        
        for(int i=0; i<n-2; i++){ 
            if(i>0 && a[i] == a[i-1]){ 
                continue; 
            } 
            
            int l = i+1; // left 
            int r = n-1; // right 
            int sum = -1 *a[i]; 
            
            while(l<r){ 
                int s = a[l] + a[r]; 
                if(s == sum){ 
                    res.add(Arrays.asList(a[i],a[l],a[r])); 
                    l++; 
                    r--; 

                    while(l<r && a[l] == a[l-1]){ 
                        l++; 
                    } 
                    while(l<r && a[r] == a[r+1]){ 
                        r--; 
                    } 
                } else if(s<sum){ 
                    l++; 
                } else{ 
                    r--; 
                } 
            } 
        } 
        System.out.println(res); 
    } 
}

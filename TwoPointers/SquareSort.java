package TwoPointers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SquareSort {
    public static void main(String[] args) {
        int[] main = {-4,-1,0,3,10};
        int n = main.length;
        List<Integer> neg = new ArrayList<>();
        List<Integer> pos = new ArrayList<>();
        for(int num : main){
            if(num<0){
                neg.add(num);
            }else{
                pos.add(num);
            }
        }
        // array contains only positive numbers
        if (neg.size() == 0){
            for(int i =0; i<n; i++){
                main[i] = main[i]*main[i];
            }
            System.out.println(Arrays.toString(main));
        }
        // array contains only negative numbers
        if(pos.size() == 0){
            for(int i =0; i<n; i++){
                main[i] = main[i]*main[i];
            }
            //reverse
            int st = 0;
            int end = n-1;
            while(st<end){
                int temp = main[st];
                main[st] = main[end];
                main[end] = temp;
                st++;
                end++;
            }
            System.out.println(Arrays.toString(main));
        }
        // array contains both
        int i=0, j=0, id=0;
        int n1 = neg.size();
        int n2 = pos.size();
        int[] res = new int[n1+n2];
        for(i=0; i<n1; i++){
            int val = neg.get(i);
            neg.set(i, val * val);
        }
        Collections.reverse(neg);
        for (i = 0; i < n2; i++) {
            int val = pos.get(i);
            pos.set(i, val * val);
        }

        // merge two sorted 
        i = 0;
        j = 0;
        while(i<n1 && j<n2){
            if(neg.get(i) <= pos.get(j)){
                res[id++] = neg.get(i++); //res[id] = neg.get(i); then id++; then i++
            } else {
                res[id++] = pos.get(j++);
            }
        }
        // for the last which one array complete first
        while(i<n1){
            res[id++] = neg.get(i++);
        }
        while(j<n2){
            res[id++] = pos.get(j++);
        }
        System.out.println(Arrays.toString(res));
    }
    
}

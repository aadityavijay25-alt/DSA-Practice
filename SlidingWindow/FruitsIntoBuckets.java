package SlidingWindow;

import java.util.HashMap;

public class FruitsIntoBuckets {
    public static void main(String[] args) {
        int[] a = {0,1,2,2};
        int k = 3;
        int n= a.length;
        int left = 0;
        int maxLen = 0;
        HashMap<Integer,Integer> freq = new HashMap<>();
        for (int right = 0; right < n; right++){
            freq.put(a[right], freq.getOrDefault(a[right], 0) + 1);
            while (freq.size() > 2) {
                int leftFruit = a[left];
                freq.put(leftFruit, freq.get(leftFruit) - 1);
                if (freq.get(leftFruit) == 0)
                    freq.remove(leftFruit);
                left++;
            }

            maxLen = Math.max(maxLen, right - left + 1);
        }

        System.out.println(maxLen);
    }


    }
    


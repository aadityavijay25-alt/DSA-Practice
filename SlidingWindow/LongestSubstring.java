package SlidingWindow;

import java.util.HashMap;

public class LongestSubstring {
    public static void main(String[] args) {
        String s = "aabacbebebe";
        int k = 3;
        int n= s.length();
        int low = 0;
        int high = 0;
        HashMap<Character, Integer> freq = new HashMap<Character, Integer>();
        int res = -1;
        int sum = 0;
        for(high =0; high<n; high++){
            char c = s.charAt(high);
            freq.put(c, freq.getOrDefault(c, 0) + 1);
            // shrink window if more than k unique
            while(freq.size()>k){
            char leftChar = s.charAt(low);
            freq.put(leftChar, freq.get(leftChar) - 1);
             if (freq.get(leftChar) == 0)
                    freq.remove(leftChar);
                low++;
            }
            if(freq.size() == k){
                int len = high - low + 1;
                res = Math.max(res, len);
            }
        }
        System.out.println(res);
    }
    
}

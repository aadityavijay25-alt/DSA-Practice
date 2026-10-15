package SlidingWindow;

public class MinWindowSubstring {
    public static void main(String[] args) {
        String s = "ADOBECODEBANC";
        String t = "ABC";
        System.out.println(minWindow(s, t));
    }

    public static String minWindow(String s, String t) {
        if (s == null || t == null || s.length() < t.length()) {
            return "";
        }

        int[] targetMap = new int[128]; 
        int required = 0;
        
        for (int i = 0; i < t.length(); i++) {
            char c = t.charAt(i);
            
            if (targetMap[c] == 0) {
                required++; 
            }
            targetMap[c]++; 
        }

        int[] windowMap = new int[128];
        int left = 0, right = 0;
        int minLen = Integer.MAX_VALUE;
        int startIdx = 0;
        int formed = 0; 

        // Expand the window using the right pointer
        while (right < s.length()) {
            char c = s.charAt(right);
            windowMap[c]++; // Increments window character count directly

            if (targetMap[c] > 0 && windowMap[c] == targetMap[c]) {
                formed++;
            }

            // Shrink the window from the left pointer when a valid window is found
            while (formed == required) {
                if (right - left + 1 < minLen) {
                    minLen = right - left + 1;
                    startIdx = left;
                }

                // Remove the character at the left pointer from the window
                char leftChar = s.charAt(left);
                windowMap[leftChar]--;

                if (targetMap[leftChar] > 0 && windowMap[leftChar] < targetMap[leftChar]) {
                    formed--;
                }
                
                left++; // Shrink the window
            }
            
            right++; // Expand the window
        }

        return minLen == Integer.MAX_VALUE ? "" : s.substring(startIdx, startIdx + minLen);
    }
}

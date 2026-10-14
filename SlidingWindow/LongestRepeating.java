package SlidingWindow;

public class LongestRepeating {
    public static void main(String[] args) {
        String s = "ABAB";
        int k = 2;
        System.out.println(characterReplacement(s, k)); 
    }

    public static int characterReplacement(String s, int k) {
        int[] f = new int[26];
        int n = s.length();
        int low = 0;
        int res = 0;
        int maxCount = 0; 

        for (int high = 0; high < n; high++) {
            f[s.charAt(high) - 'A']++;
            maxCount = Math.max(maxCount, f[s.charAt(high) - 'A']);
            int len = high - low + 1;
            if (len - maxCount > k) {
                f[s.charAt(low) - 'A']--;
                low++;
            }
            res = Math.max(res, high - low + 1);
        }
        return res;
    }
}

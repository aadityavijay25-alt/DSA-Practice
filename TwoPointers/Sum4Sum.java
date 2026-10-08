package TwoPointers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Sum4Sum {
    public static void main(String[] args) {
        int[] a = {-2, -1, -1, 1, 2, 1};
        List<List<Integer>> ans = new ArrayList<>();
        int n = a.length;
        int target = 0;

        // 1. Sort the array first
        Arrays.sort(a);

        for (int i = 0; i < n; i++) {
            // Skip duplicates for 'i'
            if (i > 0 && a[i] == a[i - 1]) continue;

            for (int j = i + 1; j < n; j++) {
                // Skip duplicates for 'j'
                if (j > i + 1 && a[j] == a[j - 1]) continue;

                int p = j + 1;
                int q = n - 1;

                while (p < q) {
                    long sum = (long) a[i] + (long) a[j] + (long) a[p] + (long) a[q];

                    if (sum < target) {
                        p++;
                    } else if (sum > target) {
                        q--;
                    } else {
                        ans.add(Arrays.asList(a[i], a[j], a[p], a[q]));
                        p++;
                        q--;

                        // Skip duplicates for 'p' and 'q'
                        while (p < q && a[p] == a[p - 1]) p++;
                        while (p < q && a[q] == a[q + 1]) q--;
                    }
                }
            }
        }
        System.out.println(ans);
    }
}

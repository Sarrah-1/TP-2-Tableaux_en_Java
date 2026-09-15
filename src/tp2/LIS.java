package tp2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LIS {
    public static int longueurLIS(int[] t) {
        if (t == null || t.length == 0) {
            return 0;
        }
        int n = t.length;
        int[] dp = new int[n];
        for (int i = 0; i < n; i++) {
            dp[i] = 1;
        }
        int maxGlobal = 1;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                if (t[j] < t[i]) {
                    dp[i] = Math.max(dp[i], dp[j] + 1);
                }
            }
            maxGlobal = Math.max(maxGlobal, dp[i]);
        }

        return maxGlobal;
    }

    public static void afficherLIS(int[] t) {
        if (t == null || t.length == 0) {
            System.out.println("Séquence vide");
            return;
        }

        int n = t.length;
        int[] dp = new int[n];
        int[] prev = new int[n];

        int maxLen = 0;
        int maxIndex = -1;

        for (int i = 0; i < n; i++) {
            dp[i] = 1;
            prev[i] = -1;
            for (int j = 0; j < i; j++) {
                if (t[j] < t[i] && dp[j] + 1 > dp[i]) {
                    dp[i] = dp[j] + 1;
                    prev[i] = j;
                }
            }
            if (dp[i] > maxLen) {
                maxLen = dp[i];
                maxIndex = i;
            }
        }
        List<Integer> seq = new ArrayList<>();
        int curr = maxIndex;
        while (curr != -1) {
            seq.add(t[curr]);
            curr = prev[curr];
        }

        Collections.reverse(seq);
        System.out.println("Longueur LIS =" + maxLen + "Séquence :" + seq);
    }

    public static void main(String[] args) {
        int[][] tests = {
            {},
            {5},
            {5, 4, 3, 2, 1},
            {1, 2, 3, 4, 5},
            {2, 1, 4, 2, 3, 5, 1, 7},
            {3, 3, 3, 3},
            {10, 9, 2, 5, 3, 7, 101, 18}
        };

        for (int i = 0; i < tests.length; i++) {
            System.out.println("Test " + (i + 1) + " : LIS =" + longueurLIS(tests[i]));
        }

        System.out.println();
        afficherLIS(new int[]{2, 1, 4, 2, 3, 5, 1, 7});
    }
}
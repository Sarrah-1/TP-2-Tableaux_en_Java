package tp2;

import java.util.ArrayList;
import java.util.List;

public class Pivots {

    public static void afficherPivots(int[] t) {
        if (t == null || t.length < 3) {
            System.out.println("Aucun pivot");
            return;
        }

        int n = t.length;
        int[] prefixMax = new int[n];
        int[] suffixMin = new int[n];

        prefixMax[0] = t[0];
        for (int i = 1; i < n; i++) {
            prefixMax[i] = Math.max(prefixMax[i - 1], t[i]);
        }

        suffixMin[n - 1] = t[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            suffixMin[i] = Math.min(suffixMin[i + 1], t[i]);
        }

        List<String> pivots = new ArrayList<>();
        for (int i = 1; i <= n - 2; i++) {
            if (prefixMax[i - 1] <= t[i] && suffixMin[i + 1] >= t[i]) {
                pivots.add(t[i] + " (index " + i + ")");
            }
        }

        if (pivots.isEmpty()) {
            System.out.println("Aucun pivot");
        } else {
            System.out.println("Pivots : " + String.join(", ", pivots));
        }
    }

    public static void main(String[] args) {
        int[] t1 = {2, 4, 3, 5, 6};
        int[] t2 = {1, 2, 3, 4, 5};
        int[] t3 = {5, 4, 3, 2, 1};
        int[] t4 = {3, 3, 3, 3};
        int[] t5 = {7, 1, 5, 2, 6, 3, 4};

        System.out.println("Tests"); 
        System.out.print("Test 1 [2, 4, 3, 5, 6]       -> ");
        afficherPivots(t1);
        System.out.print("Test 2 [1, 2, 3, 4, 5]       -> ");
        afficherPivots(t2);
        System.out.print("Test 3 [5, 4, 3, 2, 1]       -> ");
        afficherPivots(t3);
        System.out.print("Test 4 [3, 3, 3, 3]          -> ");
        afficherPivots(t4);
        System.out.print("Test 5 [7, 1, 5, 2, 6, 3, 4] -> ");
        afficherPivots(t5);
    }
}
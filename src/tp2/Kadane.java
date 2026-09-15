package tp2;

public class Kadane {

    public static int maxSubarraySum(int[] t) {
        if (t == null || t.length == 0) {
            return 0;
        }
        int currentSum = t[0];
        int maxSum = t[0];
        for (int i = 1; i < t.length; i++) {
            currentSum = Math.max(t[i], currentSum + t[i]);
            maxSum = Math.max(maxSum, currentSum);
        }
        return maxSum;
    }

    public static void maxSubarraySumAvecBornes(int[] t) {
        if (t == null || t.length == 0) {
            System.out.println("Somme maximale = 0 (Tableau vide)");
            return;
        }
        int currentSum = t[0];
        int maxSum = t[0];
        int tempStart = 0;
        int bestStart = 0;
        int bestEnd = 0;

        for (int i = 1; i < t.length; i++) {
            if (t[i] > currentSum + t[i]) {
                currentSum = t[i];
                tempStart = i;
            } else {
                currentSum = currentSum + t[i];
            }
            if (currentSum > maxSum) {
                maxSum = currentSum;
                bestStart = tempStart;
                bestEnd = i;
            }
        }
        System.out.println("Somme maximale = " + maxSum);
        System.out.print("Sous-suite : ");
        for (int i = bestStart; i <= bestEnd; i++) {
            System.out.print(t[i] + (i == bestEnd ? "" : ", "));
        }
        System.out.println();
    }

    public static void afficherTest(int testNum, int[] t) {
        System.out.println("Test " + testNum + " :");
        maxSubarraySumAvecBornes(t);
        System.out.println();
    }

    public static void main(String[] args) {
        int[] t1 = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        int[] t2 = {1, 2, 3, 4};
        int[] t3 = {-1, -2, -3};
        int[] t4 = {5};
        int[] t5 = {-7};
        int[] t6 = {-2, -1, 3, 4, -5};
        int[] t7 = {1, -1, 1, -1, 1};

        afficherTest(1, t1);
        afficherTest(2, t2);
        afficherTest(3, t3);
        afficherTest(4, t4);
        afficherTest(5, t5);
        afficherTest(6, t6);
        afficherTest(7, t7);
    }
}
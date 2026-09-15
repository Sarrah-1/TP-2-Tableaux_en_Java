package tp2;

public class PermutationCirculaire {

    public static boolean estPermutationCirculaire(int[] t) {
        if (t == null || t.length == 0) {
            return false;
        }
        int n = t.length;
        boolean[] vu = new boolean[n + 1];
        int pos = -1;
        for (int i = 0; i < n; i++) {
            int val = t[i];
            if (val < 1 || val > n || vu[val]) {
                return false;
            }
            vu[val] = true;
            if (val == 1) {
                pos = i;
            }
        }
        if (pos == -1) {
            return false;
        }
        for (int k = 0; k < n; k++) {
            int idx = (pos + k) % n;
            int v = k + 1;
            if (t[idx] != v) {
                return false;
            }
        }
        return true;
    }
    public static void afficherTest(int testNum, int[] t) {
        System.out.println("Test " + testNum + " : " + estPermutationCirculaire(t));
    }
    public static void main(String[] args) {
        int[] t1 = {1};
        int[] t2 = {1, 2, 3, 4, 5};
        int[] t3 = {4, 5, 1, 2, 3};
        int[] t4 = {3, 1, 2, 4, 5};
        int[] t5 = {0, 1, 2, 3, 4};
        int[] t6 = {1, 2, 2, 3, 4};
        int[] t7 = {4, 5, 1, 2, 3};
        int[] t8 = {3, 1, 2, 4, 5};

        afficherTest(1, t1);
        afficherTest(2, t2);
        afficherTest(3, t3);
        afficherTest(4, t4);
        afficherTest(5, t5);
        afficherTest(6, t6);
        afficherTest(7, t7);
        afficherTest(8, t8);
    }
}
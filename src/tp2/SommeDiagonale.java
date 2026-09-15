package tp2;

public class SommeDiagonale {

    public static int differenceDiagonales(int[][] m) {
        if (m == null || m.length == 0 || m.length != m[0].length) {
            return 0;
        }
        int n = m.length;
        int sommePrincipale = 0;
        int sommeSecondaire = 0;
        for (int i = 0; i < n; i++) {
            sommePrincipale += m[i][i];
            sommeSecondaire += m[i][n - 1 - i];
        }
        int diff = Math.abs(sommePrincipale - sommeSecondaire);
        System.out.println("Diagonale principale = " + sommePrincipale);
        System.out.println("Diagonale secondaire = " + sommeSecondaire);
        System.out.println("Difference absolue = " + diff);
        return diff;
    }
    public static void afficherTest(int testNum, int[][] m) {
        System.out.println("Test " + testNum + " :");
        differenceDiagonales(m);
        System.out.println();
    }
    public static void main(String[] args) {
        int[][] m1 = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        int[][] m2 = {
            {1, 3, 5},
            {2, 4, 6},
            {7, 8, 9}
        };
        int[][] m3 = {
            {5}
        };
        int[][] m4 = {
            {-1, 2},
            {3, -4}
        };
        afficherTest(1, m1);
        afficherTest(2, m2);
        afficherTest(3, m3);
        afficherTest(4, m4);
    }
}
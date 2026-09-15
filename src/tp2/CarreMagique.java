package tp2;

public class CarreMagique {

    public static boolean estCarreMagique(int[][] m) {
        if (m == null || m.length != 3 || m[0].length != 3) {
            return false;
        }
        int ref = m[0][0] + m[0][1] + m[0][2];
        if (m[1][0] + m[1][1] + m[1][2] != ref) return false;
        if (m[2][0] + m[2][1] + m[2][2] != ref) return false;
        if (m[0][0] + m[1][0] + m[2][0] != ref) return false;
        if (m[0][1] + m[1][1] + m[2][1] != ref) return false;
        if (m[0][2] + m[1][2] + m[2][2] != ref) return false;
        if (m[0][0] + m[1][1] + m[2][2] != ref) return false;
        if (m[0][2] + m[1][1] + m[2][0] != ref) return false;
        return true;
    }
    public static void afficherTest(int testNum, int[][] m) {
        System.out.println("Test " + testNum + " : " + (estCarreMagique(m) ? "Carre magique" : "Pas un carre magique"));
    }
    public static void main(String[] args) {
        int[][] m1 = {
            {8, 1, 6},
            {3, 5, 7},
            {4, 9, 2}
        };
        int[][] m2 = {
            {2, 7, 6},
            {9, 5, 1},
            {4, 3, 7}
        };
        int[][] m3 = {
            {1, 1, 1},
            {1, 1, 1},
            {1, 1, 1}
        };
        int[][] m4 = {
            {4, 3, 8},
            {9, 5, 1},
            {2, 7, 6}
        };
        afficherTest(1, m1);
        afficherTest(2, m2);
        afficherTest(3, m3);
        afficherTest(4, m4);
    }
}
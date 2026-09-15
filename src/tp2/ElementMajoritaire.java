package tp2;

public class ElementMajoritaire {

    public static int elementMajoritaire(int[] t) {
        if (t == null || t.length == 0) {
            return -1;
        }

        int candidat = 0;
        int compteur = 0;
        for (int x : t) {
            if (compteur == 0) {
                candidat = x;
                compteur = 1;
            } else if (x == candidat) {
                compteur++;
            } else {
                compteur--;
            }
        }
        int count = 0;
        for (int x : t) {
            if (x == candidat) {
                count++;
            }
        }
        if (count > t.length / 2) {
            return candidat;
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] t1 = {3, 3, 4, 3, 5};
        int[] t2 = {2, 2, 1, 2, 3, 2, 2};
        int[] t3 = {1, 1, 1, 1};
        int[] t4 = {7};
        int[] t5 = {1, 2, 3, 4};
        int[] t6 = {1, 2, 2, 3};
        int[] t7 = {1, 1, 2, 2};
        int[] t8 = {-1, -1, -1, 2, 3};
        int[] t9 = {-2, -2, -2, -2, 1, 3};

        System.out.println("t1 -> " + elementMajoritaire(t1));
        System.out.println("t2 -> " + elementMajoritaire(t2));
        System.out.println("t3 -> " + elementMajoritaire(t3));
        System.out.println("t4 -> " + elementMajoritaire(t4));
        System.out.println("t5 -> " + elementMajoritaire(t5));
        System.out.println("t6 -> " + elementMajoritaire(t6));
        System.out.println("t7 -> " + elementMajoritaire(t7));
        System.out.println("t8 -> " + elementMajoritaire(t8));
        System.out.println("t9 -> " + elementMajoritaire(t9));
    }
}
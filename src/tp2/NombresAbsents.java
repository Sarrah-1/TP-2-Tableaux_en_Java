package tp2;

import java.util.ArrayList;
import java.util.List;

public class NombresAbsents {

    public static void afficherElementsManquants(int[] t) {
        if (t == null || t.length == 0) {
            System.out.println("Aucun element manquant");
            return;
        }
        int n = t.length;
        boolean[] vu = new boolean[n + 1];

        for (int x : t) {
            if (x >= 1 && x <= n) {
                vu[x] = true;
            }
        }
        List<String> manquants = new ArrayList<>();
        for (int k = 1; k <= n; k++) {
            if (!vu[k]) {
                manquants.add(String.valueOf(k));
            }
        }
        if (manquants.isEmpty()) {
            System.out.println("Aucun element manquant");
        } else {
            System.out.println(String.join(" ", manquants));
        }
    }
    
    public static void main(String[] args) {
        int[] t1 = {1, 3, 3, 5};
        int[] t2 = {1, 2, 3, 4};
        int[] t3 = {3, 3, 3};
        int[] t4 = {1, 1, 1, 1};
        int[] t5 = {4, 2, 2, 1, 5};
        int[] t6 = {1};

        System.out.print("t1 -> ");
        afficherElementsManquants(t1);
        System.out.print("t2 -> ");
        afficherElementsManquants(t2);
        System.out.print("t3 -> ");
        afficherElementsManquants(t3);
        System.out.print("t4 -> ");
        afficherElementsManquants(t4);
        System.out.print("t5 -> ");
        afficherElementsManquants(t5);
        System.out.print("t6 -> ");
        afficherElementsManquants(t6);
    }
}
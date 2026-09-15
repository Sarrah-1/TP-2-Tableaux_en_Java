TP 2 - Tableaux en Java

Cours : Fondamentaux et Concepts Avancés de la Programmation Java
Ce TP contient 10 exercices sur la manipulation de tableaux (1D et 2D) : sous-séquences, sommes, parcours de matrices, et algorithmes classiques (Kadane, Boyer-Moore).

Objectifs

- Manipuler des tableaux d'entiers à une et deux dimensions
- Concevoir des algorithmes en programmation dynamique
- Appliquer des techniques de parcours et de cumul de sommes
- Comprendre et implémenter des algorithmes classiques (Kadane, Boyer-Moore)
- Analyser la complexité temporelle et spatiale de chaque solution

Prérequis

- JDK installé (version 8 ou supérieure)
- Un IDE (Eclipse, IntelliJ, VS Code) ou un terminal avec javac et java

Compilation et exécution

Chaque exercice est une classe indépendante avec son propre main, regroupée dans le package tp2.

Exercice 1 : Plus longue sous-séquence strictly croissante (LIS)

Trouver la longueur de la plus longue sous-séquence strictement croissante d'un tableau, et reconstruire une séquence atteignant cette longueur, en utilisant la programmation dynamique.

public static int longueurLIS(int[] t) {
    // à compléter
}
public static int[] reconstruireLIS(int[] t) {
    // à compléter
}

Classe : LIS.java
Exemple : t = [10, 9, 2, 5, 3, 7, 101, 18] → longueur 4

Exercice 2 : Tableau pivot

Trouver l'indice où la somme des éléments à gauche est égale à la somme des éléments à droite.

public static int trouverPivot(int[] t) {
    // à compléter
}

Classe : Pivots.java
Exemple : t = [1, 7, 3, 6, 5, 6] → pivot à l'indice 3

Exercice 3 : Matrice spirale

Parcourir et afficher tous les éléments d'une matrice en suivant une spirale, dans le sens des aiguilles d'une montre.

public static void afficherSpirale(int[][] m) {
    // à compléter
}

Classe : Spirale.java
Exemple : [[1,2,3],[4,5,6],[7,8,9]] → 1 2 3 6 9 8 7 4 5

Exercice 4 : Recherche d'un rectangle de 1 dans une matrice binaire

Trouver l'aire maximale d'un sous-rectangle ne contenant que des 1 dans une matrice binaire, en réduisant le problème à des histogrammes ligne par ligne.

public static int maxRectangle(int[][] M) {
    // à compléter
}

Classe : MaxRectangle.java
Exemple : aire maximale = 6 pour la matrice donnée dans l'énoncé

Exercice 5 : Permutation circulaire

Vérifier si un tableau correspond à une rotation circulaire de la suite [1, 2, ..., n].

public static boolean estPermutationCirculaire(int[] t) {
    // à compléter
}

Classe : PermutationCirculaire.java
Exemple : t = [3, 4, 5, 1, 2] → vrai

Exercice 6 : Sous-tableau de somme maximale (Kadane)

Trouver la somme maximale d'un sous-tableau contigu non vide à l'aide de l'algorithme de Kadane.

public static int maxSubarraySum(int[] t) {
    // à compléter
}

Classe : Kadane.java
Exemple : t = [-2, 1, -3, 4, -1, 2, 1, -5, 4] → somme maximale 6

Exercice 7 : Fréquence majoritaire (Boyer-Moore)

Trouver l'élément qui apparaît strictly plus de n/2 fois dans un tableau, avec l'algorithme de vote de Boyer-Moore.

public static int elementMajoritaire(int[] t) {
    // à compléter
}

Classe : ElementMajoritaire.java
Exemple : t = [3, 3, 4, 3, 5] → élément majoritaire 3

Exercice 8 : Nombres absents

Afficher tous les entiers entre 1 et n absents d'un tableau censé contenir des valeurs dans cet intervalle.

public static void afficherElementsManquants(int[] t) {
    // à compléter
}

Classe : NombresAbsents.java
Exemple : t = [1, 3, 3, 5] → entiers manquants 2 et 4

Exercice 9 : Somme diagonale dans une matrice carrée

Calculer la somme de la diagonale principale et de la diagonale secondaire d'une matrice carrée, puis afficher la valeur absolue de leur différence.

public static int differenceDiagonales(int[][] m) {
    // à compléter
}

Classe : SommeDiagonale.java
Exemple : [[1,2,3],[4,5,6],[7,8,9]] → différence absolue 0

Exercice 10 : Matrice magique 3×3

Vérifier si une matrice 3×3 est un carré magique : toutes les lignes, toutes les colonnes et les deux diagonales doivent avoir exactement la même somme.

public static boolean estCarreMagique(int[][] m) {
    // à compléter
}

Classe : CarreMagique.java
Exemple : [[8,1,6],[3,5,7],[4,9,2]] → Carré magique

Structure du projet

TP2_Tableaux_en_Java/
├── src/
│   └── tp2/
│       ├── LIS.java
│       ├── Pivots.java
│       ├── Spirale.java
│       ├── MaxRectangle.java
│       ├── PermutationCirculaire.java
│       ├── Kadane.java
│       ├── ElementMajoritaire.java
│       ├── NombresAbsents.java
│       ├── SommeDiagonale.java
│       └── CarreMagique.java
├── README.md

Concepts mobilisés

- Programmation dynamique (LIS)
- Cumul de sommes (tableau pivot)
- Parcours de matrices sous contraintes géométriques (spirale)
- Réduction 2D vers 1D via histogrammes (rectangle binaire)
- Algorithmes linéaires en temps et mémoire constante (permutation circulaire, Kadane, Boyer-Moore)
- Tableaux de marquage (nombres absents)
- Parcours de diagonales dans une matrice carrée (somme diagonale, carré magique)

Auteur

OUADAY Sara— TP2 Java

package tp2;

import java.util.ArrayDeque;
import java.util.Deque;

public class MaxRectangle {

    static class Rectangle {
        int top;
        int left;
        int bottom;
        int right;
        int area;
    }
    public static Rectangle trouverMaxRectangle(int[][] m) {
        Rectangle maxRect = new Rectangle();
        if (m == null || m.length == 0 || m[0].length == 0) {
            return maxRect;
        }
        int R = m.length;
        int C = m[0].length;
        int[] heights = new int[C];
        for (int i = 0; i < R; i++) {
            for (int j = 0; j < C; j++) {
                if (m[i][j] == 1) {
                    heights[j]++;
                } else {
                    heights[j] = 0;
                }
            }
            Rectangle lineMax = maxRectangleInHistogram(heights, i, C);
            if (lineMax.area > maxRect.area) {
                maxRect = lineMax;
            }
        }
        return maxRect;
    }
    private static Rectangle maxRectangleInHistogram(int[] heights, int lineIndex, int C) {
        Deque<Integer> stack = new ArrayDeque<>();
        Rectangle maxRect = new Rectangle();

        for (int j = 0; j <= C; j++) {
            int currentHeight = (j == C) ? 0 : heights[j];

            while (!stack.isEmpty() && currentHeight < heights[stack.peek()]) {
                int height = heights[stack.pop()];
                int left = stack.isEmpty() ? 0 : stack.peek() + 1;
                int right = j - 1;
                int area = height * (right - left + 1);

                if (area > maxRect.area) {
                    maxRect.area = area;
                    maxRect.bottom = lineIndex;
                    maxRect.top = lineIndex - height + 1;
                    maxRect.left = left;
                    maxRect.right = right;
                }
            }
            stack.push(j);
        }

        return maxRect;
    }
    public static void afficherResultat(int testNum, Rectangle r) {
        System.out.println("Test " + testNum + " :");
        if (r.area == 0) {
            System.out.println("Aire maximale = 0, aucun rectangle de 1.");
        } else {
            System.out.println("Aire maximale = " + r.area);
            System.out.println("Coordonnees : top = " + r.top + ", left = " + r.left + ", bottom = " + r.bottom + ", right = " + r.right);
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int[][] t1 = {
            {0, 1, 1, 0, 1},
            {1, 1, 1, 1, 0},
            {1, 1, 1, 1, 0},
            {1, 1, 0, 0, 1}
        };
        int[][] t2 = {
            {0, 0, 0},
            {0, 0, 0}
        };
        int[][] t3 = {
            {1}
        };
        int[][] t4 = {
            {0}
        };
        afficherResultat(1, trouverMaxRectangle(t1));
        afficherResultat(2, trouverMaxRectangle(t2));
        afficherResultat(3, trouverMaxRectangle(t3));
        afficherResultat(4, trouverMaxRectangle(t4));
    }
}
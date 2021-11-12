package Lab1.task5;

import java.util.Random;
public class task5 {
    public static void main(final String[] args) {
        final int n = 3;
        final int m = 5;
        int[][] Matrix = new int[n][m];
        int[][] tMatrix = new int[m][n];

        final Random rdn = new Random();
        System.out.println("Matrix:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                Matrix[i][j] = rdn.nextInt(10);
                System.out.print(Matrix[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("tMatr:");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                tMatrix[i][j] = Matrix[j][i];
                System.out.print(tMatrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}

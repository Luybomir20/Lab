package Lab1.task6;
import java.util.Random;
public class task6 {
    public static void main( final String[] args) {
        final int[][] onematrix = new int[2][2];
        final int[][] twomatrix = new int[2][2];

        System.out.println("First matrix: ");
        Output(onematrix);
        System.out.println("Second matrix: ");
        Output(twomatrix);
        System.out.println("========");
        System.out.println("Multiplication of matrices:");
        matrixMulti(onematrix, twomatrix);
    }

    static void Output(final int[][] mas) {//Метод для заповнення масива значеннями
        final Random  rnd = new Random();
        for (int i = 0; i < mas.length; i++) {
            for (int j = 0; j < mas[i].length; j++) {
                mas[i][j] = rnd.nextInt(10);//Присвоюємо рандомні значення вказаного діапазону
                System.out.print(mas[i][j] +" ");
            }
            System.out.println();
        }
    }

    public static void matrixMulti(final int[][] mas, final int[][] arr) {//Метод множення матриць
        final int[][] result = new int[2][2];
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                for (int k = 0; k < 2; k++) {
                    result[i][j] += mas[i][k] * arr[k][j];
                }
            }
        }
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
    }
}


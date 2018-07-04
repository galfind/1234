package greenfield;
/**
 * Created by Admin on 09.06.2018.
 */
//1
public class Matrica {
    private static int[][] Initmatrix(int d, int f) {
        int[][] matrixChecked = new int[d][f];

        int y = matrixChecked.length;
        for (int i=0; i<y; i++) {
            for (int x=0; x<y; x++) {
                matrixChecked[i][x] = (int) Math.ceil(Math.random() * 10);
                if (matrixChecked.length == 0) {
                    System.out.print("Cant work");
                } else{
                    System.out.print(matrixChecked[i][x] + " ");
            }
            }
            System.out.println();// первая матрица рот её шагал
        }

        return matrixChecked;
    }

    public static void main(String[] args) {
        System.out.println("Матрица1: ");
            int matrixFirst[][] = Initmatrix(3, 3);
        System.out.println("Матрица2: ");;
            int matrixSecond[][] = Initmatrix(3,3);
        int m = matrixFirst.length;
        int n = matrixSecond[0].length;
        int d = matrixSecond.length;
        int res[][] = new int[3][3];
        System.out.println("Результат: ");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                for (int k = 0; k < d; k++) {
                    res[i][j] += matrixFirst[i][k] * matrixSecond[k][j];
                }
            }
        }
        for (int i = 0; i < res.length; i++) {
            for (int j = 0; j < res[0].length; j++) {
                System.out.format("%6d", res[i][j]);
            }
            System.out.println();
        }
    }
}

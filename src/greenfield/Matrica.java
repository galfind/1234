package greenfield;
/**
 * Created by Admin on 09.06.2018.
 */
//1
public class Matrica {
    private static int[][] matrix(int d, int f) {
        int[][] matrixFirst = new int[d][f];

        int y = matrixFirst.length;
        for (int i=0; i<y; i++) {
            for (int x=0; x<y; x++) {
                matrixFirst[i][x] = (int) Math.ceil(Math.random()*10);
                System.out.print(matrixFirst[i][x] + " ");
            }
            System.out.println();// первая матрица рот её шагал
        }

        return matrixFirst;
    }

    private static int matrixCheck(){
        int matrixChecked[][] = matrix(3,3);
        if (matrixChecked.length == 0)
        {
             int a = 1;
            return a;
        }
        else {
            int a = 0;
            return a;
        }
}
    public static void main(String[] args) {
        System.out.println("Матрица1: ");
        if (matrixCheck == 1){
            System.out.print("cant work");
        }
        else {
            int matrixFirst[][] = matrix(3, 3);
        }
        System.out.println("Матрица2: ");
        if (matrixCheck == 1){
            System.out.print("cant work");
        }
        else {
            int matrixSecond[][] = matrix(3,3);
        }
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

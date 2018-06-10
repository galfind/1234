package greenfield;
/**
 * Created by Admin on 09.06.2018.
 */
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
  //public static void result();
  //for (int i = 0; i < y; i++) {
  //     for (int x = 0; x < u; x++) {
  //         for (int k = 0; k < t; k++) {
  //             res[i][x] += matrica1[i][k] * matrica2[k][x];
  //         }
  //         System.out.format("%6d ", res[i][x]);
  //     }
  //     System.out.println();
  // }

    public static void main(String[] args) {
        int matrix[][] = new int[3][3];
        System.out.println("Матрица1: ");
        matrix(3,3);
        System.out.println("Матрица2: ");
        matrix(3,3);


    }
}

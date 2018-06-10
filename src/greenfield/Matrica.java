package greenfield;
/**
 * Created by Admin on 09.06.2018.
 */
public class Matrica {
    public static void main(String[] args) {
        int[][]matrica1 = new int [3][3];
        int[][]matrica2 = new int [3][3];

        int y = matrica1.length;
        int u = matrica2[0].length;
        int t = matrica2.length;
        int[][]res = new int [y][u];
        System.out.println("Матрица1: ");
        for (int i=0; i<y; i++) {
            for (int x=0; x<u; x++) {
                matrica1[i][x] = (int) Math.ceil(Math.random()*10);
                System.out.print(matrica1[i][x] + " ");
            }
            System.out.println();// первая матрица рот её шагал
        }
        System.out.println("Матрица2: ");

        for (int i=0; i<y; i++) {
            for (int x=0;x<u; x++) {
                matrica2[i][x] = (int) Math.ceil(Math.random()*10);
                System.out.print(matrica2[i][x] + " ");
            }
            System.out.println();
        }
        System.out.println("Результат:");
        for (int i = 0; i < y; i++) {
            for (int x = 0; x < u; x++) {
                for (int k = 0; k < t; k++) {
                    res[i][x] += matrica1[i][k] * matrica2[k][x];
                }
                System.out.format("%6d ", res[i][x]);
            }
            System.out.println();
        }

    //    for (int i = 0; i<5; i++){
    //        for (int x = 0; x<3; x++){
     //           System.out.print(matrica1[i][x] + " ");
        //    }
   //         System.out.println();
    //    } //первая матрица рот её топтал

   }
}

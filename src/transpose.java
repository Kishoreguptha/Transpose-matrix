import java.util.Arrays;
import java.util.Scanner;

public class transpose {

    public static int[][] TRanspose(int[][] matrix,int n,int m) {
        int temp = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (i < j) {
                    temp = matrix[i][j];
                    matrix[i][j] = matrix[j][i];
                    matrix[j][i] = temp;
                }
            }
        }
        return matrix;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int A[][] = new int[m][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                A[i][j] = sc.nextInt();
            }
            int[][] transpose = TRanspose(A, n, m);
            for (int[] values : transpose) {
                System.out.println(Arrays.toString(values));
            }
        }
}}

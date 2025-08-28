import java.util.Random;

public class MatrixOps {
    static int[][] createMatrix(int r, int c) {
        Random rand = new Random();
        int[][] mat = new int[r][c];
        for (int i = 0; i < r; i++)
            for (int j = 0; j < c; j++)
                mat[i][j] = rand.nextInt(10);
        return mat;
    }

    static int[][] add(int[][] A, int[][] B) {
        int[][] res = new int[A.length][A[0].length];
        for (int i = 0; i < A.length; i++)
            for (int j = 0; j < A[0].length; j++)
                res[i][j] = A[i][j] + B[i][j];
        return res;
    }

    static int[][] subtract(int[][] A, int[][] B) {
        int[][] res = new int[A.length][A[0].length];
        for (int i = 0; i < A.length; i++)
            for (int j = 0; j < A[0].length; j++)
                res[i][j] = A[i][j] - B[i][j];
        return res;
    }

    static int[][] multiply(int[][] A, int[][] B) {
        int[][] res = new int[A.length][B[0].length];
        for (int i = 0; i < A.length; i++)
            for (int j = 0; j < B[0].length; j++)
                for (int k = 0; k < A[0].length; k++)
                    res[i][j] += A[i][k] * B[k][j];
        return res;
    }

    static void display(int[][] mat) {
        for (int[] row : mat) {
            for (int val : row)
                System.out.print(val + " ");
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[][] A = createMatrix(2, 3);
        int[][] B = createMatrix(2, 3);
        int[][] C = createMatrix(3, 2);
        display(add(A, B));
        display(subtract(A, B));
        display(multiply(A, C));
    }
}

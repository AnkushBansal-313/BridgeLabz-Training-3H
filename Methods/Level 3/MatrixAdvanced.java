public class MatrixAdvanced {

    static int[][] transpose(int[][] mat) {
        int[][] t = new int[mat[0].length][mat.length];
        for (int i = 0; i < mat.length; i++)
            for (int j = 0; j < mat[0].length; j++)
                t[j][i] = mat[i][j];
        return t;
    }

    static int determinant2x2(int[][] m) {
        return m[0][0] * m[1][1] - m[0][1] * m[1][0];
    }

    static int determinant3x3(int[][] m) {
        return m[0][0] * (m[1][1] * m[2][2] - m[1][2] * m[2][1])
             - m[0][1] * (m[1][0] * m[2][2] - m[1][2] * m[2][0])
             + m[0][2] * (m[1][0] * m[2][1] - m[1][1] * m[2][0]);
    }

    static double[][] inverse2x2(int[][] m) {
        int det = determinant2x2(m);
        if (det == 0) return null;
        double[][] inv = new double[2][2];
        inv[0][0] = m[1][1] / (double)det;
        inv[0][1] = -m[0][1] / (double)det;
        inv[1][0] = -m[1][0] / (double)det;
        inv[1][1] = m[0][0] / (double)det;
        return inv;
    }

    static double[][] inverse3x3(int[][] m) {
        int det = determinant3x3(m);
        if (det == 0) return null;
        double[][] inv = new double[3][3];
        for (int i = 0; i < 3; i++)
            for (int j = 0; j < 3; j++) {
                int[][] minor = new int[2][2];
                int r = 0, c = 0;
                for (int ii = 0; ii < 3; ii++) {
                    if (ii == i) continue;
                    c = 0;
                    for (int jj = 0; jj < 3; jj++) {
                        if (jj == j) continue;
                        minor[r][c] = m[ii][jj];
                        c++;
                    }
                    r++;
                }
                int cofactor = determinant2x2(minor);
                inv[j][i] = Math.pow(-1, i + j) * cofactor / det;
            }
        return inv;
    }

    static void display(int[][] mat) {
        for (int[] row : mat) {
            for (int val : row)
                System.out.print(val + " ");
            System.out.println();
        }
    }

    static void displayDouble(double[][] mat) {
        for (double[] row : mat) {
            for (double val : row)
                System.out.printf("%.2f ", val);
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[][] mat2x2 = { {4, 7}, {2, 6} };
        int[][] mat3x3 = { {1, 0, 5}, {2, 1, 6}, {3, 4, 0} };

        int[][] trans2 = transpose(mat2x2);
        int[][] trans3 = transpose(mat3x3);
        int det2 = determinant2x2(mat2x2);
        int det3 = determinant3x3(mat3x3);
        double[][] inv2 = inverse2x2(mat2x2);
        double[][] inv3 = inverse3x3(mat3x3);

        System.out.println("Transpose 2x2:");
        display(trans2);
        System.out.println("Determinant 2x2: " + det2);
        System.out.println("Inverse 2x2:");
        displayDouble(inv2);

        System.out.println("Transpose 3x3:");
        display(trans3);
        System.out.println("Determinant 3x3: " + det3);
        System.out.println("Inverse 3x3:");
        displayDouble(inv3);
    }
}

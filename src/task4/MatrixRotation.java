package task4;

public class MatrixRotation {

    public static void transpose(int[][] m) {
        for (int i = 0; i < m.length; i++) {
            for (int j = i; j < m[0].length; j++) {
                int x = m[i][j];
                m[i][j] = m[j][i];
                m[j][i] = x;
            }
        }
    }


    public static int[][] rotateByNinetyToLeft(int[][] m) {
        transpose(m);

        for (int  i = 0; i < m.length/2; i++) {
            for (int j = 0; j < m[0].length; j++) {
                int x = m[i][j];
                m[i][j] = m[m.length -1 -i][j];
                m[m.length -1 -i][j] = x;
            }
        }
        return m;
    }

}

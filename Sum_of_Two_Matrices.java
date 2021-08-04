import java.util.Scanner;

class Sum_of_Two_Matrices {

    public static void main(String args[]) {
        int m, n;
        Scanner cin = new Scanner(System.in);

        System.out.println("Enter order of matrix: ");

        m = cin.nextInt();
        n = cin.nextInt();

        Array ref = new Array();

        int[][] a = new Array().getArray(m, n, cin);
        int[][] b = new Array().getArray(m, n, cin);

        int[][] c = ref.sum(a, b);

        ref.show(c);

    }

}

class Array {
    int[][] getArray(int m, int n, Scanner cin) {
        int ary[][] = new int[m][n];

        for (int r = 0; r < ary.length; r++) {
            for (int c = 0; c < ary[r].length; c++) {
                ary[r][c] = cin.nextInt();
            }
        }
        return ary;
    }

    int[][] sum(int[][] m, int[][] n) {
        int[][] ary = new int[m.length][m[0].length];

        for (int r = 0; r < m.length; r++) {
            for (int c = 0; c < m[0].length; c++) {
                ary[r][c] = m[r][c] + n[r][c];
            }
        }

        return ary;
    }

    void show(int[][] m) {
        int i, j;

        for (i = 0; i < m.length; i++) {
            for (j = 0; j < m[0].length; j++) {
                System.out.print(m[i][j] + " ");
            }
            System.out.println();
        }
    }
}

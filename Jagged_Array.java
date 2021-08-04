import java.util.Scanner;

class Jagged_Array {
    public static void main(String args[]) {
        int m;
        Scanner cin = new Scanner(System.in);

        System.out.println("Enter the no. of rows: ");
        m = cin.nextInt();

        AryMagic ref = new AryMagic();
        int a[][] = ref.getarray(m, cin);

        ref.show(a);

    }
}

class AryMagic {
    int[][] getarray(int m, Scanner cin) {
        int ary[][] = new int[m][];
        for (int r = 0; r < ary.length; r++) {
            int a[] = array(cin);
            ary[r] = a;
            for (int c = 0; c < a.length; c++) {
                ary[r][c] = cin.nextInt();
            }
        }
        return ary;
    }

    void show(int a[][]) {
        for (int r = 0; r < a.length; r++) {
            for (int c = 0; c < a[r].length; c++) {
                System.out.print(a[r][c] + " ");
            }
            System.out.println();
        }
    }

    static int[] array(Scanner cin) {
        System.out.println("Enter the no. of colums want: ");
        int c = cin.nextInt();

        int p[] = new int[c];

        return p;
    }
}

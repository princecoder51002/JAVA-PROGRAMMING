import java.util.Scanner;

class Sum_Of_Two_Arrays_Alternate {

    public static void main(String args[]) {
        int[] a, b;
        int n, i;
        Scanner cin = new Scanner(System.in);

        System.out.println("Enter the No. of elements:");
        n = cin.nextInt();

        a = new int[n];
        b = new int[n];

        System.out.println("Enter elements of A: ");

        // for (i = 0; i < a.length; i++) {
        // a[i] = cin.nextInt();
        // }

        a = getArray(n, cin);

        System.out.println("Enter elements of B: ");

        // for (i = 0; i < b.length; i++) {
        // b[i] = cin.nextInt();
        // }

        b = getArray(n, cin);

        System.out.println("The Sum of Two Arrays: ");

        int d[] = sum(a, b); // Cannot make a static reference to the non-static method sum(int[], int[])

        for (i = 0; i < d.length; i++) {
            System.out.println(d[i]);
        }

    }

    static int[] sum(int[] m, int[] n) {
        int[] c = new int[m.length];

        for (int i = 0; i < c.length; i++) {
            c[i] = m[i] + n[i];
        }

        return c;

    }

    static int[] getArray(int n, Scanner cin) {
        int ary[] = new int[n];
        for (int i = 0; i < ary.length; i++) {
            System.out.println("Enter the elements of array at : " + i + " pos:");
            ary[i] = cin.nextInt();

        }
        return ary;

    }

}

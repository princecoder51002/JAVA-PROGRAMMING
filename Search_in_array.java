import java.util.Scanner;

class Search_in_array {

    public static void main(String args[]) {
        int[] a;
        int n;
        Scanner cin = new Scanner(System.in);

        System.out.println("Enter the No. of elements:");
        n = cin.nextInt();

        a = new int[n];

        System.out.println("Enter elements of A: ");

        // for (i = 0; i < a.length; i++) {
        // a[i] = cin.nextInt();
        // }

        a = new Search().getArray(n, cin);// creating anonymous object. one time use
        // obect created ,used and becomes unreachable immediately

        System.out.println("Enter the value of key you want to search: ");
        int key = cin.nextInt();

        Search ref = new Search();

        ref.search(a, key);
    }

}

class Search {
    void search(int[] m, int key) {
        int i;
        for (i = 0; i < m.length; i++) {
            if (m[i] == key)
                System.out.println("Element is found");
        }
    }

    int[] getArray(int n, Scanner cin) {
        int ary[] = new int[n];
        for (int i = 0; i < ary.length; i++) {
            System.out.println("Enter element at " + (i + 1) + " Position");
            ary[i] = cin.nextInt();
        }

        return ary;

    }
}

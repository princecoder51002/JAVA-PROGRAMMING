import java.util.Scanner;

class Command_Line_arguement_And_Array_Of_Objects {
    public static void main(String args[]) {
        Scanner cin = new Scanner(System.in);
        Students ary[] = new Students().getarray(args.length, cin);

        Result ref = new Result();

        ref.display(ary);

        int max = ref.max(ary);

        int min = ref.min(ary);

        System.out.println("Maximum Marks: " + max);
        System.out.println("Minimum Marks: " + min);

    }
}

class Students {
    int maths, science, biology, total;

    Students[] getarray(int m, Scanner cin) {
        int i;
        Students s[] = new Students[m];
        for (i = 0; i < m; i++) {
            s[i] = new Students(); // creation of object
            s[i].maths = (i + 1) * 20;
            s[i].science = (i + 1) * 15;
            s[i].biology = (i + 1) * 10;

            s[i].total = s[i].maths + s[i].science + s[i].biology;
        }

        return s;
    }

}

class Result {
    void display(Students ref[]) {
        int i;
        for (i = 0; i < ref.length; i++) {
            System.out.println("Total marks of " + (i + 1) + " Student: " + ref[i].total);
        }
    }

    int max(Students ref[]) {
        int i;
        int m = ref[0].total;
        for (i = 0; i < ref.length; i++) {
            if (ref[i].total > m) {
                m = ref[i].total;
            }
        }

        return m;
    }

    int min(Students ref[]) {
        int i;
        int m = ref[0].total;
        for (i = 0; i < ref.length; i++) {
            if (ref[i].total < m) {
                m = ref[i].total;
            }
        }

        return m;
    }
}
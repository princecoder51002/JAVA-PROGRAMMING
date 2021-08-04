class JSG2 {
    public static void main(String args[]) {
        int a = 5, b = 10, sum;
        sum = a + b;
        System.out.println(sum);
        System.out.println("sum=" + sum);
        System.out.println(sum + " is sum");
        System.out.println("sum=" + a + b);
        System.out.println("sum=" + (a + b));
        System.out.println("sum=" + a * b);

        // int x, y;
        // x=2, y=3; // error bcz comma initialization is not allowed
        // System.out.println(x*y);

        float r = 10, ar;
        ar = 3.14f * r * r;

        System.out.println(ar);

        // int z;
        // System.out.println(z); //The local variable z may not have been initialized

        int rate, unit = 100;
        // if(unit<=200)
        // rate = 5;
        // System.out.println(rate); //The local variable z may not have been
        // initialized

        if (unit <= 200) {
            rate = 5;
            System.out.println(rate);
        }

        int m, u = 100;
        if (u == 100)
            m = 2;
        else
            m = 3;
        System.out.println(m);

    }
}

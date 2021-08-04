class TCBlock {

    public static void main(String args[]) {
        System.out.println("Start");

        int l = 0;

        try {
            int d = 5 / l;

            System.out.println("div = " + d);
        } catch (ArithmeticException exp) {
            System.out.println("Division by zero is not allowed");
            System.out.println(exp.getMessage());
        }

        System.out.println("End");
    }

}

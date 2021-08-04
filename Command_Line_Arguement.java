class Command_Line_Arguement {
    public static void main(String args[]) {
        System.out.println(args.length);

        double sum = 0;

        for (int i = 0; i < args.length; i++) {
            sum = sum + Double.parseDouble(args[i]);
        }

        System.out.println(sum);
    }
}

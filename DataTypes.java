class DataTypes {
    public static void main(String args[]) {
        System.out.println(Float.MAX_VALUE);
        System.out.println(Short.MAX_VALUE);
        System.out.println(Integer.MAX_VALUE);
        System.out.println((int) Character.MAX_VALUE);

        System.out.println(Float.MIN_VALUE);
        System.out.println(Short.MIN_VALUE);
        System.out.println(Integer.MIN_VALUE);
        System.out.println((int) Character.MIN_VALUE);

        DataTypes ref; // decelaration of ref variable
        ref = new DataTypes(); // creation of object dynamically

        ref.fun();

    }

    void fun() // instance method
    {
        System.out.println("hellooo");
    }
}

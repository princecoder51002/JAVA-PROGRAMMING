class Final_Primitive_Variables {

    public static void main(String args[]) {
        salary ref = new salary(2000);

        ref.fun();
    }

}

class salary {
    final int sal; // final instance primitive variables

    salary(final int s) // final local primitive variables
    {
        // s = s-1000; // this will work if s is not declared as final
        sal = s;
    }

    void fun() {
        System.out.println(sal);
        // sal = 3000; // invalid
    }
}

class A {

    final void fun() // final method
    {
        System.out.println("prince");
    }

}

class B extends A {
    // void fun() // Cannot override the final method from A
    // {
    // System.out.println("wadhwa ji");
    // }
}

class Final_Method {
    public static void main(String args[]) {
        A ref = new A();
        B ref1 = new B();

        ref.fun();
        ref1.fun();
    }
}
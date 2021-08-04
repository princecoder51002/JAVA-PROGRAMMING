class Abstract_Method_And_Class {

    public static void main(String args[]) {
        // Shape sref = new Shape(); Cannot instantiate the type Shape
        // Shape sref; // valid

        Sqaure rct = new Sqaure();
        rct.area(5);
        rct.line();

        Shape ref = new Sqaure(); // polymorphism
        ref.area(4);
        // ref.line(); The method line() is undefined for the type Shape

        ((Sqaure) ref).line(); // Downcasting

        // Downcasting can also be done in this way

        Sqaure spl = (Sqaure) ref;
        spl.line();
    }

}

abstract class Shape {
    abstract void area(int s); // abstract mehtod
}

class Sqaure extends Shape {
    void area(int s) {
        System.out.println("Area of Square " + s * s);
    }

    void line() {
        System.out.println("========");
    }
}

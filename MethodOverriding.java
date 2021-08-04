// Method over-riding : - when a base class and derived class duo contains methods having same name and prototype is known as method over-riding
//overriding is used when the behaviour of base class method does not suit derived class
//No Multiple inheritance in JAVA-so no ambiguity

class Rect // super class
{
    void area() // over-ridden method
    {
        System.out.println("area of rect");
    }
}

class Circle extends Rect 
{
    void area() // over - riding method
    {
        System.out.println("area of circle");
    }

    void rarea()
    {
        super.area(); // super represents base class always
    }
}

class MethodOverriding {
    
    public static void main(String args[])
    {
        Circle cir = new Circle();
        cir.area(); // area of circle

        cir.rarea();
    }

}



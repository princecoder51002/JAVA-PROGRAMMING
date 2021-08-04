class LIB
{
    float pi;
    LIB()
    {
        System.out.println("default of base contructor");
    }

    LIB(float p) // parameterized constructor
    {
        this(); // used to call its default construtor
        pi=p;
        System.out.println("parametrized constructor of base class: "+pi);
    }
}

class CIRCLE extends LIB
{
    CIRCLE()
    {
        super(); // used to call LIB class default constructor
        System.out.println("Default of derived class");
    }

    CIRCLE(int s, float pi) // parameterized constructor
    {
        super(pi);
        System.out.println("area = "+(s*s));
    }

    void fun() 
    {

    }
}



class Constructor_and_Destructor {
    
    public static void main(String args[])
    {
        CIRCLE ref = new CIRCLE(9,3.14f);
        ref.fun(); // i used this bcz vs code always giving me error that ref is not used thats why i call a function contains nothing
    }

}

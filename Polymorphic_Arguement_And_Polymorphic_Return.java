class Polymorphic_Arguement_And_Polymorphic_Return 
{
    public static void main(String args[])
    {
        Rect rref = new Rect();
        Circle cref = new Circle();

        Factory fact = new Factory();

        fact.doDraw(rref);
        fact.doDraw(cref);

        Shape S1 = fact.getobject(1);

        S1.area();

        Circle s2 = (Circle)fact.getobject(2);

        s2.area();
        s2.line();
    }
        

}

interface Shape 
{
    void area();
}

class Rect implements Shape 
{
       public void area() 
       {
           System.out.println("Area Of Rectangle");
       }
}

class Circle implements Shape 
{
       public void area() 
       {
           System.out.println("Area Of Circle");
       }

       void line() 
       {
           System.out.println("===========");
       }
}

class Factory 
{
    void doDraw(Shape ref)
    {
        ref.area();
    }

    Shape getobject(int what)
    {
        if(what==1)
        return new Rect();
        else if(what==2)
        return new Circle();
        else 
        return null;
    }
}
class TypeCasting
{
    public static void main(String args[])
    {
    byte b1 =50;
    byte b2 = 50*2;

    System.out.println(b1*b2);

    int x=2;

    // short s1 = x; // Type mismatch: cannot convert from int to short
    // solution:- 

    short s = (short)x; // explicit type casting
    System.out.println(s);

    }
}
class TMC 
{
    public static void main(String args[]) 
    {
        TMC mc = new TMC();
        try 
        {
            mc.dodiv(10);
        }
        catch(ArrayIndexOutOfBoundsException exp)
        {
            System.out.println("Invalid index =" +exp.getMessage());
            exp.printStackTrace();
        }
    }

    void dodiv(int d) 
    {
        int a[] = {10,20,30};
        try{
            int val = a[d];
            System.out.println(val);
            int div = val/d;
            System.out.println(div);
        }
        catch(ArithmeticException exp)
        {
            exp.printStackTrace();
        }
        System.out.println("******************");
    }
}

// class object // universal class
// {
//     tostring
// }

class ToString 
{
    public static void main(String args[]) 
    {
           Product pro = new Product();
           System.out.println(pro.tostring()); // method over-riding from object class

           System.out.println(pro); // calling tostring() Automatically
    }
}

class Product 
{
    int p=10, q=5;

    public String tostring() // over-ridden method
    {
        return "price= "+p+"qty ="+q;
    }
}

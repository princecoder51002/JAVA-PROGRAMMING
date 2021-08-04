class Interview1
{
     public static void main(String args[])
     {
         Rect r1 = new Rect();
         Rect r2 = new Rect();

         System.out.println(r1.equals(r2)); // false

         Rect r3 = r1;
         System.out.println(r1.equals(r3)); // true

         System.out.println(r1.l == r2.l); // true
         System.out.println(r1==r2); // false

         //-------------------------------------------------------------

         String s1 = new String("bce");
         String s2 = new String("bce");

         System.out.println(s1.equals(s2)); // true (bcz string class over-rides method of object class)


     }
}

class Rect 
{
    int l=5, b=6;
}
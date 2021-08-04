import java.util.Scanner;

class Two_Dimensional_array {
    public static void main(String args[])
    {
          int m, n;
          Scanner cin = new Scanner(System.in);

          System.out.println("Enter the order of matrix");
          m = cin.nextInt();
          n = cin.nextInt();

          int a[][] = new AryMagic().getarray(m,n,cin);

          AryMagic ref = new AryMagic();

          ref.show(a);

    }
}

class AryMagic 
{
     int [][] getarray(int m, int n, Scanner cin)
     {
         int ary[][] = new int [m][n];

         for(int r=0;r<ary.length;r++)
         {
             for(int c=0; c<ary[r].length;c++)
             {
                 System.out.println("enter the value: ");
                 ary[r][c] = cin.nextInt();
             }
         }
         return ary;
     }

     void show(int a[][])
     {
         for(int r=0;r<a.length;r++)
         {
             for(int c=0;c<a[r].length;c++)
             {
                 System.out.print(a[r][c] + " ");
             }
             System.out.println();
         }
     }
}

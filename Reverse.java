import java.util.Scanner;

class Reverse {
    public static void main(String args[])
    {
        Scanner cin = new Scanner(System.in);

        try{

        System.out.println("Enter the number: ");
        int num = cin.nextInt();

        NumRev ref = new NumRev();
        int RN = ref.result(num);

        System.out.println("Reversed Number is "+RN);

        }finally{
            cin.close();
        }

    }
}

class NumRev{
    int result(int num)
    {
        int r, rev=0;
        while(num!=0)
        {
            r = num%10;
            rev = rev*10+r;
            num=num/10;
        }

        return rev;
    }
}

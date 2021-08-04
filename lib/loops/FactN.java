package lib.loops;

public class FactN {
    
    public int Factorial(int n) 
    {
        int i=1,fact=1;
        for(i=1;i<=n;i++) 
        {
            fact = fact*i;
        }

        return fact;
    }
}

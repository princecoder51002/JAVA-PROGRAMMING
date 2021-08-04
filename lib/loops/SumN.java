package lib.loops;

public class SumN 
{
    public int sum(int n) 
    {
        int i=1, sum=0;
        for(i=1;i<n;i++) 
        {
            sum = sum +i;
        }

        return sum;
    }
}
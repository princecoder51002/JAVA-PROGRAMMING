package lib.decisions;

public class Max3 {
    
    public int getmax3(int x, int y, int z) 
    {
        return x>y?x>z?x:z:y>z?y:z;
    }

}

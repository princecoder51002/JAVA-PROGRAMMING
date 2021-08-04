class Resource 
{
    synchronized void printTable(int tbl)
    {
        for(int i=1;i<=5;i++)
        {
            int value = tbl*i;
            System.out.println(tbl+"*"+i+" = "+value);
            try{
                Thread.sleep(100);
            }catch(Exception exp)
            {
                exp.printStackTrace();
            }
        }
    }
}

class User implements Runnable 
{
    Resource res;
    Thread th;
    int tbl;

    User(Resource res, int tbl)
    {
        this.res = res;
        this.tbl = tbl;
        th=new Thread(this);
        th.start();
    }

    public void run()
    {
        res.printTable(tbl);
    }
}

class synchronized_Method {
    public static void main(String args[])
    {
        Resource res = new Resource();
        User thrd1 = new User(res, 5);
        User thrd2 = new User(res, 10);
    }
}
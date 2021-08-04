class Inheritance {
    
    public static void main(String args[])
    {
       Withdraw b = new Withdraw();

       System.out.println(b.bal);

       b.dodeposit(2000);

       System.out.println(b.bal);

       b.withdraw(1000);

       System.out.println(b.bal);
    }

}

class Bank 
{
    int bal = 500;
}

class Deposit extends Bank
{
    void dodeposit(int amt)
    {
        bal = bal + amt;
    }
}

class Withdraw extends Deposit 
{
    void withdraw(int amt)
    {
        bal = bal - amt;
    }
}
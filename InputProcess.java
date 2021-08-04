import java.util.Scanner;

class InputProcess {
    
    public static void main(String args[])
    {
        Scanner cin =new Scanner(System.in);
        try {
        System.out.println("Enter the price: ");
        float price = cin.nextFloat(); // enter

        cin.nextLine(); // eating the enter

        System.out.println("Enter product name: ");
        String item = cin.nextLine();

        System.out.println("Enter the quantity: ");
        int qty = cin.nextInt(); // enter

        System.out.println("your product " + item);

        Product ref = new Product();
        float bill = ref.getbill(price,qty);
        System.out.println("Bill = "+bill);
        }
        finally{
            cin.close();
        }

    }
}

class Product{
    float getbill(float price, int qty)
    {
        return price*qty;
    }
}

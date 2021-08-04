import java.util.Scanner;

class Volume {
    
    public static void main(String args[])
    {
        Scanner cin = new Scanner(System.in);

        try{

        System.out.println("Enter the radius of cone: ");
        float rco = cin.nextFloat();

        System.out.println("Enter the radius of cylinder: ");
        float rcy = cin.nextFloat();

        System.out.println("Enter the height of cone: ");
        float hco = cin.nextFloat();

        System.out.println("Enter the height of cylinder: ");
        float hcy = cin.nextFloat();

        cylinder cref = new cylinder();
        cone cref2 = new cone();

        float vcy = cref.area(hcy,rcy);
        float vco = cref2.area(hco,rco);

        System.out.println("Volume of cylinder = "+vcy);
        System.out.println("Volume of cone = "+vco);

        }finally{
            cin.close();
        }


    }
}

class cylinder{
    float area(float h, float r)
    {
        return 3.14f*r*r*h;
    }
}

class cone{
    float area(float h, float r)
    {
        return (3.14f*r*r*h)/3;
    }
}
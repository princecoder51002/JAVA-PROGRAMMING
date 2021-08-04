public class Create_Float_Arithmetic_Exception 
{
	public static void main(String args[])
	{
		int d=0;
		try{
			if(d==0)
				throw new FloatArithmeticException("Div by Zero is invalid in float also");
			else
			{
				double x=5.0/d;
				System.out.println(x);
				System.out.println("End");
			}
		}catch(FloatArithmeticException exp)
		{
			System.out.println(exp.getMessage());
		}

		System.out.println("End Again");
	}
}

class FloatArithmeticException extends Exception 
{
	FloatArithmeticException(String msg)
	{
		super(msg); // calling parameterized constructor of base class
	}
}

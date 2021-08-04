public class Singleton_Design_Pattern {

	public static void main(String[] args) {
		
		UserLibrary lib = UserLibrary.lib;
		
		//UserLibrary lib = UserLibrary.getinstance();
		
		double sq = lib.getSquare(10);
		double cylvol = lib.getCylinderVol(10, 20);
		
		System.out.println("Square = "+sq+" Cylinder = "+cylvol);
	}

}

class UserLibrary
{
	public static final UserLibrary lib = new UserLibrary();
	private UserLibrary()
	{
		
	}
	
//	public static getinstance()
//	{
//		return lib;
//	}
	
	public double getSquare(double v)
	{
		return v*v;
	}
	
	public double getPi()
	{
		return 3.14;
	}
	
	public double getCylinderVol(double r, double h)
	{
		return getPi()*getSquare(r)*h;
	}
}
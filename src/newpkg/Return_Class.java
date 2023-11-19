package newpkg;

public class Return_Class {

	public static void main(String[] args) {
		Return_Class Ny = new Return_Class();
		Ny.Sakif();
		Return_Class TX = new Return_Class();
		TX.sezan();
		Return_Class.FL();
		Return_Class CA = new Return_Class();
		CA.NJ();
		
		
		
	}
	public String Sakif() {
		
		String x = "I love you Automation";
		System.out.println(x);
		return x;
		
		
	}
	
	public int sezan() {
		
		int a  = 150;
		int b = 12;
		int c =  a*b;
		System.out.println(c);
		return c;
	}
	
	public static Double FL() {
		
		Double a  = 10.99;
		System.out.println(a);
		return a;
	}
	
	public String NJ() {
		
		String x = "Rasif";
		System.out.println(x);
		return x;
		
	}
		
}



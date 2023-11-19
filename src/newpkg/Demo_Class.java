package newpkg;

public class Demo_Class {

	public static void main(String[] args) {
		Demo_Class.T("Bushra", " Habiba");
		Demo_Class.T(10, 19, 100, 761);
		Demo_Class FL = new Demo_Class();
		FL.t(101, " Sakif ", 'S',  79.69);

	}
	static String T(String a, String b) {
		
		String c = a+b;
		System.out.println(c);
		return c;
		
	}
	static int T   (int a, int b, int c, int d) {
		
		
		System.out.println(a+b+c+d);
		return a+b+c+d;
		
		
	}
	
	public void t(int a, String b, char c, Double d) {
		
		System.out.println(a+b+c+d);
		
	}

}

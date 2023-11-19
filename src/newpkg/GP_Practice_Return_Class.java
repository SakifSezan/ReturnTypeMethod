package newpkg;

public class GP_Practice_Return_Class {

	public static void main(String[] args) {
		GP_Practice_Return_Class.T("Rasif", " Sayan");
		GP_Practice_Return_Class TX = new GP_Practice_Return_Class();
		TX.Z(101, 221);
		GP_Practice_Return_Class.R(101, 110.99, 'C', "Rishad");
		
		

	}
	public static String T(String a,String b) {
		
		String c = a+b;
		System.out.println(c);
		return c;
		
	}
	
    public int Z(int a,int b) {
    	
    	int c = a*b;
    	System.out.println(c);
    	return c;
    	
}
    static char R(int a,Double b,char c,String d) {
    	
    	System.out.println(a+b+c+d);
		return c;
    	
    	
    }
    

}

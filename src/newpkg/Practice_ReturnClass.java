package newpkg;

public class Practice_ReturnClass {

	public static void main(String[] args) {
		Practice_ReturnClass NY = new Practice_ReturnClass();
		NY.TX();
		Practice_ReturnClass.FL();

	}
	
	public String TX() {
		
		String l = "I love Bangladesh";
		System.out.println(l);
		return l;
	}

	public static Double FL() {
		
		Double x = 10.99*17.34;
		System.out.println(x);
		return x;
	}
	
	
}

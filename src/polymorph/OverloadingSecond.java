package polymorph;

/*
 * - The child class has priority on parent  
 */

public class OverloadingSecond {
	
	public void m(Object o) {
		System.out.println("Object version");
	}
	
	public void m(String ss) {
		System.out.println("String version m");
	}
	
	public void m1(String s) {
		System.out.println("String version");
	}
	
	public void m1(StringBuffer sb) {
		System.out.println("String Buffer version");
	}

	public static void main(String[] args) {
		
		OverloadingSecond os = new OverloadingSecond();
		// Child and parent
		os.m(new Object()); // the exact match Object version 
		os.m("Bye"); // the exact match is String version m
		os.m(null); // The child String has priority on Object so String version m 
		
		
		os.m1("Hello");  // String version
		os.m1(new StringBuffer());  // String Buffer version
		// os.m1(null);  // error because String and StringBuffer are not related(no parent child relation)
	}

}

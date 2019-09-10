package polymorph;
/*
 * - In Java method signature contains only:
 * 	  - method name
 *    - arguments types
 * - The compiler will use method signature while resolving method call(invoke).
 * - Within the class two methods with the same signature is not allowed.
 * 
 */

public class Basics {
	/*
	 * This method signature is m1(int, double)
	 */
	public int m1(int a, double b) {
		return 10;
	}
	
	public void a1(int s) {
		
	}
	
	/*
	 // Two methods with the same signature is not allowed.
	public int a1(int d) {
		return 10;
	}
	*/
	
	public void hello(String name, int age) {
		
	}
	
	// Valid: the order of arguments is different
	// This is method overloading
	public void hello(int age, String name) {
		
	}
	
}

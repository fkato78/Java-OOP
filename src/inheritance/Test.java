package inheritance;
/*
 * - Parent reference can be used to hold child class BUT can not call child method 
 *   on the parent reference.
 * - Child reference can NOT be used to hold a parent object  
 */

public class Test {
	public static void main(String[] args) {
		Parent p = new Parent();
		p.m1();
		// p.m2() // compile error
		
		Child c = new Child();
		c.m1();
		c.m2();
		
		// Use parent reference to hold child object
		Parent p1 = new Child();
		p1.m1();
		// p1.m2() //compile error
		
		// Use Child reference to hold parent object
		// Child c1 = new Parent();  // compile error
				
	}

}

package polymorph;
/*
 * - In method overriding the method resolution ALWAYS takes
 * 	 care by jvm based on run time object NOT by reference object(compiler)
 *   as in the method overloading.
 * - So overriding is also known as run time polymorphism or dynamic polymorphism 
 *   or late binding   
 */

public class OverridedParent {
	
	public void greet() {
		System.out.println("Greet from parent");
	}
	
	public void sayHello() {
		System.out.println("Say hello from parent");
	}

}

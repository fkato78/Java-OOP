package polymorph;
/*
 * - Method overloading is known as compile time polymorphism or static polymorphism or early binding.
 * - Method overloading: two methods with the same name but different arguments types
 * 	 OR two methods with the same name and same arguments types but in different order	
 * - Method resolution: is the process of which method has to execute.
 * - In overloading method resolution always takes care by compiler	based on reference type
 * 	 BUT NOT on run time object type
 * - Test t = new HelloClass() where:
 * 		- Test is the reference type
 * 		- HelloClass is the run time object type	
 */

public class Overloading {
	
	public void m1() {
		System.out.println("No args");
	}
	
	public void m1(int a) {
		System.out.println("int arg");
	}
	
	// same name but different arguments types
	public int m1(String name) {
		System.out.println("String arg");
		return 10;
		
	}
	
	public void again(int b, double f) {
		System.out.println("int, double args");
	}
	
	// same name and arguments but in different order
	public String again(double h, int e) {
		System.out.println("double, int args");
		return "Hello";
	}

}

class Animal{}

class Cat extends Animal{}

class Test {
	
	public void m1(Animal a) {
		System.out.println("Animal version");
	}
	
	public void m1(Cat c) {
		System.out.println("Cat version");
	}
	
	public static void main(String[] args) {
		Test t = new Test();
		Animal a = new Animal();
		t.m1(a); // Animal version
		Cat c = new Cat();
		t.m1(c); // Cat version
		Animal d = new Cat(); // Parent reference hold child object OK
		t.m1(d); // Animal version because Animal is the reference object and 
		// Cat is the run time object(has no roll)  IMPORTANT COCEPT
		
	}
	
}



package basics;
import another.Parent;
/*
 * Class members access modifiers:
 * default     => package level
 * public      => global level
 * private     => class level
 * protected   => package level + children
 * Important: protected members can access anywhere inside the same package
 *            and can access from child classes outside the package BUT
 *            should use child reference NOT parent reference
 * 
 */

public class AccessMod extends Parent {
	public static void main(String[] args) {
		// Access protected method from another package
		Parent p = new Parent();
		// p.m1();  // not accessible because we use parent reference
		
		AccessMod a = new AccessMod();
		a.m1(); // OK we use child reference
		
		Parent p1 = new AccessMod();
		// p1.m1(); // not accessible because we use parent reference
	}

}

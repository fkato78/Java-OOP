package polymorph;
/*
 * - In method overriding the method resolution ALWAYS takes
 * 	 care by jvm based on run time object NOT by reference object(compiler)
 *   as in the method overloading.
 * - So overriding is also known as run time polymorphism or dynamic polymorphism 
 *   or late binding   
 */


public class TsetOverride {

	public static void main(String[] args) {
		// Parent reference(compile time) and Parent run time(jvm)
		OverridedParent op = new OverridedParent();
		op.greet();  // Greet from parent
		
		// Child reference(compile time) and  Child run time(jvm)
		OverridingChild oc = new OverridingChild();
		oc.greet();  // Greet from child
		
		// Parent reference(compile time) and Child run time(jvm)
		OverridedParent oo = new OverridingChild();
		oo.greet();  // Greet from child

	}

}

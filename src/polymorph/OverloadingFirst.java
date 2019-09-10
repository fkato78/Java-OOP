package polymorph;

/*
 * Automatic promotion in overloading:compiler will promote the arg to the next level
 * until find the match method.
 */
public class OverloadingFirst {
	
	public void m1(int a) {
		System.out.println("int arg");
	}
	
	public void m1(float b) {
		System.out.println("float arg");
	}
	
	public void m1(int... c) {
		System.out.println("var args");
	}
	
	
	public static void main(String[] args) {
		OverloadingFirst ovf = new OverloadingFirst();
		ovf.m1(10);  // int arg
		ovf.m1(11.22F);  // float arg
		/* here the automatic promotion via compiler to the next
		   level until find the match
		*/   
		ovf.m1('a');  // pass char  => int arg
		ovf.m1(12L);  // pass long => float arg
		// ovf.m1(12.3);  // error can,t promote double to next level(there is no next level)
		
		ovf.m1(10);  // int arg because it is the exact match
		ovf.m1(); // var args
		ovf.m1(22, 33); // var args
		ovf.m1(50); // the exact match is int arg
	}

}
	
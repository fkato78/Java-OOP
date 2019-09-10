package polymorph;

public class OverloadingThree {
	
	public void m1(int a, float b) {
		System.out.println("int float version");
	}
	
	public void m1(float f, int i) {
		System.out.println("float int version");
	}

	public static void main(String[] args) {
		OverloadingThree ot = new OverloadingThree();
		ot.m1(10,  20.6f); // int float version
		ot.m1(20.6f, 10); // float int version
		// ot.m1(22, 33);  // error reference to m1 is ambiguous because id we promote 
		// arguments both version will be matched.
		// ot.m1(22.1f, 33.3f); error no method matched
	}

}

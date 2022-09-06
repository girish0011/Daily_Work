package Class_2;

public class A {
	int x = 10; // Non Static (Belongs to an Objec)
	static int y = 100; // Static
	
	public static void main(String[] args) {
		A a1 = new A ();
		System.out.println(a1.x);
		System.out.println(A.y);

	}
	

}

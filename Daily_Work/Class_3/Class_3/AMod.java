package Class_3;

public class AMod {
	int x = 10;

	public static void main(String[] args) {
		AMod a1 = new AMod();
		System.out.println(a1.x);//10

		a1.x = 100;
		System.out.println(a1.x);//100

		AMod a2 = new AMod();
		System.out.println(a2.x);//10

	}

}

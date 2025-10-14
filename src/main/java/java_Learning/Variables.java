package java_Learning;

public class Variables {

	static int a = 20;
	static int b = 10;

	public static void main(String[] args) {

		int c = a + b;
		System.out.println("The sum of Two Numbers is: " + c);

		Substraction();
		Multiplication();

	}

	public static void Substraction() {

		int c = a - b;
		System.out.println("The Substraction of Two Numbers is: " + c);

	}

	public static void Multiplication() {

		int c = a * b;
		System.out.println("The Multiplication of Two Numbers is: " + c);

	}
}

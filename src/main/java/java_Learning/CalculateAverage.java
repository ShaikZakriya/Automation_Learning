package java_Learning;

public class CalculateAverage {

	public static void main(String[] args) {
		
		average();

	}

	public static void average()
	{
		int a =15;
		int b =20;
		int c =25;
		
		int sum = a + b + c;
		
		float avg = sum / 3;
		
		System.out.println("Average of 3 Num is: " + avg);
	}
}

package java_Learning;

public class Static_Keyword {

	public static void main(String[] args) {
		
		Static_Keyword.Car();
		Static_Keyword.Bike();
		
		Static_Keyword str = new Static_Keyword();
		str.Plane();

	}
	
	public static void Car() {
		
		System.out.println("This is the Static Method Car");
	}

	public static void Bike() {
		
		System.out.println("This is the Static Method Bike");
	}
	
	public void Plane() {
		
		System.out.println("This is Non-Static - Plane");
	}
}

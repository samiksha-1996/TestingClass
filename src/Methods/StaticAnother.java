package Methods;

public class StaticAnother {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hi This is main menthod");
		//calling static method from same class
		//just call using method name in main method--> eg methodName();
		display2();
		display();
		display();
		display();
		
	}
	
public static void display() //static complete method

{
	System.out.println("Hi This is display static method");
}

public static void display2() //static complete method
{
	System.out.println("Hi this is display2 ststic method");
}
}

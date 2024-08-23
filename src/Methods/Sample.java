package Methods;

public class Sample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Main method running");
		testme();
		testme();
		
		System.out.println("Main method finished");
		
		//calling static regular method from another class
		//syntax--> classname.methodname();
		StaticAnother.display(); //calling static regular method from another class
		StaticAnother.display2(); //calling static regular method from another class
		

	}
	
public static void testme() 
{
	System.out.println("This is test me static regular method");
	StaticAnother.display();
}

}

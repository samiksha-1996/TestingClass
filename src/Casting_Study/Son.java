package Casting_Study;

public class Son extends Father{

	public void car()// overriding
	{
		System.out.println("Honda Civic");
	}
	
	public void bike() // overriding
	
	{
		System.out.println("JAWA");
	}
	
	public void Degree()//new method of Son--> not supported for casting
	{
		System.out.println("BE");
	}
	
	
}


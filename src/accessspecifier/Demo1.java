package accessspecifier;

public class Demo1 {
	
	private int a = 10;
	int b = 20;
	
	public static void main(String[] args) {
		
	Demo1 demo = new Demo1();
	
	demo.test1();// calling private method within class 
	
	System.out.println(demo.a);// calling private global variable within class
	
	demo.test2();// calling default method within class
	
	System.out.println(demo.b);// calling default global variable within class
	
	}
	
	private void test1()
	
	{
	System.out.println("This is Demo's private test1 method");
	}
	
	void test2()
	
	{
	System.out.println("This is Demos default test2 method");
	}
	
	
	}



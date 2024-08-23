package accessspecifier1;

public class Demo3 {
	
	import accessspecifier1.Demo1;
	
	public class Demo3 {
		
	}
	public static void main(String[] args) {
		
	Demo1 demo1 = new Demo1();
	// demo1.test1(); //calling private method in another package is not allowed
	//demo1.test2(); calling default method in another package is not allowed
	}

}

package Methods;

public class city {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println();
		//To call non static method we need to create a object
		//below is syntax to create a object
		
		city pune = new city(); //created pune object
		//how to call non static method
		//objectname.methodname();
		
		pune.swargate(); //calling non static method from same class
		
		katraj(); //calling static method from same calss

	}
	
	public static void katraj()
	{
		System.out.println("katraj is static method from the city class");
	}
	
	public void swargate() //non statix method
	
	{
		System.out.println("swargate is non static menthod from city class");
	}
	
	
	

}

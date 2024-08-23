package Methods;

public class calculator {

	
		// TODO Auto-generated method stub
		
		int a = 10; //variable decleration and initilization
		int b = 8;  //variable decleration and initilization
		
		public static void main(String[] args) {
			
			System.out.println("========================");
			calculator calculator = new calculator();
			calculator.addition();
			calculator.substraction();
			calculator.multiplication();
			calculator.division();
            System.out.println("========================");
			
	}
		
		public void addition() 
		{
			int sum = a+b;
			System.out.println("Äddition is "+ sum);
		}
		public void substraction() 
		{
			int sub = a-b;
			System.out.println("Substraction is "+ sub);
		}
		
		public void multiplication() 
		{
			int mul = a*b;
			System.out.println("multiplication is "+ mul);
		}
		
		public void division() 
		{
			float div = a/b;
			float rem = a%b;
			System.out.println("Division is "+ div);
			System.out.println("Reminder is "+ rem);
		}
}

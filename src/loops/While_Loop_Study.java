package loops;

public class While_Loop_Study {

	public static void main(String[] args) {
		
		//I want to print 2 10 times
		//ini-->1
		//condition-->10
		//updation-->incremental++
		
		//syntax-->initiliazation
		//while(condition)
		//{ printing statement
		// updation
		//}
		
		
		int i=1; //initilization
		while(i<=10)  //condition
		{
			System.out.println(2);
			i++;
		}
		
		//i want to print table of 3
		
		int z=3;
		while(z<=30)
		{
			System.out.println(z);
			z=z+3;
		}
		
		//I want to print table of 3 in reverse
		
		int y=30;
		while(y>=3)
		{
			System.out.println(y);
			y=y-3;
		}
		
		//i want to print velocity 5 times
		
		int x=1;
		while(x<=5)
		{
			System.out.println("Velocity");
			x++;
		}

	}

}

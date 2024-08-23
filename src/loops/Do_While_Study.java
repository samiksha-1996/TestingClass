package loops;

public class Do_While_Study {

	public static void main(String[] args) {

		//I want to print table of 10
		//ini-->10
		//condition-->100
		//updation-->incremental i=i+10
		
		//syntax--> ini--> i=1
		//do
		//{
			//priniting statement
			//updation
		//} while(i<=1);
		
		int i=10;
		do
		{
			System.out.println(i);
			i=i+10;
		}while(i<=100);
		
		//I want to print table of 10 in reverse
		
		int x=3;
		do
		{
			System.out.println(x);
		x=x-3;
		
		}while(x>=30);
		
		//I want to print India
		
		int y=1;
		do
		{
			System.out.println("India");
			y++;
		
		}while(y<=5);

}
}
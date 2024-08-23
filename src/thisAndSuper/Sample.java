package thisAndSuper;

public class Sample {
	
	int a = 90;//global variable
	int b = 10;//global variable
	static int x=88;//static global variable
	
	
	public static void main(String[] args) {
		
	Sample Sample = new Sample();
	Sample.add();
	
}
	
	public void add()
	{
		int a = 10;//local variable
		int sum = a + 100;// by default java will use local varible
		System.out.println(sum);
		int sum1 = this.a + 100;//called global variable using this keyword
		System.out.println(sum1);
		int sub = 100 - b;

		int x=10;
		int sub1=100-x;//called local variable
		System.out.println(sub1);
		int sub2=100-Sample.x;//called global static varible
		System.out.println(sub2);
	}
	

}

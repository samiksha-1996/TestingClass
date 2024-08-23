package Interface_Study;


public class Canada implements India {

	public static void main(String[] args) {

		Canada canada= new Canada();
		canada.test();
		canada.test1();
		canada.test2();
		System.out.println(ind);
		}


//@Override

	public void test() 
	{
            System.out.println("test Method from India interface completed inCanada implementation class");
}
//@Override
	

	public void test1() {
            System.out.println("test1 Method from India interface completed in Canada implementation class");
}

	public void test2()
                {
           System.out.println("Canada class own method");
}
}
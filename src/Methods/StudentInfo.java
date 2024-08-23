package Methods;

public class StudentInfo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StudentInfo info= new StudentInfo();
		
		info.displayInformation();
		info.displayInformation("Test1",10,22.2f,'A',89.7f,true);
		info.displayInformation("Test2",20,23.3f,'B',90.4f,true);

	}
	public void displayInformation()
	{
		String name = "samiksha";
		int rollNum = 50 ;
		float age = 25.07f;
		float mark = 88.90f;
		char div ='A';
	    boolean result = true;
		
		System.out.println("Student name is :" +name);
		System.out.println("Student RollNumber is :" +rollNum);
		System.out.println("Student Age is :" +age);
		System.out.println("Student Marks is :" +mark);
		System.out.println("Student Division is :" +div);
		System.out.println("Student result is :" +result);
				
	}
	 public void displayInformation(String name,int rollNum,float age,char div,float mark,boolean result)
	{
		System.out.println("Student name is :" +name);
		System.out.println("Student RollNumber is :" +rollNum);
		System.out.println("Student Age is :" +age);
		System.out.println("Student Marks is :" +mark);
		System.out.println("Student Division is :" +div);
		System.out.println("Student result is :" +result);
	}
	
	

}

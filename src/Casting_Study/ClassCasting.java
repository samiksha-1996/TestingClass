package Casting_Study;

public class ClassCasting {

	public static void main(String[] args) {
		
Mother f = new Mother();
f.car();
f.bike();
System.out.println("=================");

Daughter s = new Daughter();
s.car();
s.bike();
s.laptop();

System.out.println("=================");

Mother f1 = new Daughter();
f1.car();
f1.bike();
// f1.laptop();
}
}
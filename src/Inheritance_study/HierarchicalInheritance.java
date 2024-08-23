package Inheritance_study;

public class HierarchicalInheritance {

	public static void main(String[] args) {

		GrandFather G = new GrandFather();
		
		G.keys();
		
		Uncle U = new Uncle();
		
		U.shop();
		U.keys();
		
		Aunty A = new Aunty();
		
		A.keys();
		A.shopping();
		
	}

}

package Inheritance_study;

public class MultiLevelInheritance {

	public static void main(String[] args) {
     
		Brother B = new Brother();
		B.zumba();
		B.running();
		B.driving();
		B.music();
		B.key();
		B.recipe();
		
		Sister S = new Sister();
		
		S.driving();
		S.music();
		S.key();
		S.recipe();
		
		GrandMother G = new GrandMother();
		
		G.key();
		G.recipe();
		
	}

}

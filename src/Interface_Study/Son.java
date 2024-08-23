package Interface_Study;

public class Son implements Mother, Father {
public static void main(String[] args) {
Son son = new Son();
son.look();
son.nature();
son.love();
System.out.println("====================");
//calling using Interface reference
Mother.care();
Father.care();
}

//@Override

public void nature() {
System.out.println("fathers nature ");
}

//@Override
public void look() {
System.out.println("Mothers look");
}

//@Override
public void love() {
Mother.super.love();
Father.super.love();
}
}

// java vsion before 8
// java 8 onwards-->interface --> change
// Interface we will support few methods with body--> complete method
// default method along
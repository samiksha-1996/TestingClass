package stringStudy;

public class StringMethods {

	public static void main(String[] args) {
		
		String s = "Pune";
		
		// 1. length()
		
		System.out.println(s.length());
		int lengthOfString = s.length();// reference variable
		System.out.println(lengthOfString);
		System.out.println("====================================");
		
		// 2. touppercase()
		
		String a = "velocity";
		System.out.println(a.toUpperCase());
		String b = a.toUpperCase();
		System.out.println(b);
		
		// 3. toLowerCase()
		
		System.out.println(b.toLowerCase());
		String b1 = b.toLowerCase();
		System.out.println(b1);
		System.out.println("====================================");
		
		// 4. equals()
		
		String c1 = "Ram";
		String c2 = "Ram";
		String c3 = new String("Ram");
		String c4 = new String("Ram");
		String c5 = new String("RAM");
		System.out.println("====================================");
		
		// difference between == and equals()
		
		System.out.println(c1 == c2);
		System.out.println(c2 == c3);
		System.out.println(c3 == c4);
		System.out.println(c1.equals(c2));
		System.out.println(c2.equals(c3));
		System.out.println(c3.equals(c4));
		System.out.println(c4.equals(c5));
		System.out.println(c4.equalsIgnoreCase(c5));
		System.out.println("====================================");
		
		// contains()
		
		String d1 = "Engineering";
		System.out.println(d1.contains("z"));

		System.out.println(d1.contains("ring"));
		System.out.println(d1.contains("Eg"));
		boolean result = d1.contains("ing");
		System.out.println(result);
		System.out.println("====================================");
		
		// isEmpty()
		
		String e1 = "Testing";
		String e2 = null;
		String e3 = "";
		String e4 = " ";
		System.out.println(e1.isEmpty());
		
		// System.out.println(e2.isEmpty());
		
		System.out.println(e3.isEmpty());
		System.out.println(e4.isEmpty());
		System.out.println("====================================");
		
		// isBlank()
		
		System.out.println(e1.isBlank());
		System.out.println(e3.isBlank());
		System.out.println(e4.isBlank());
		System.out.println("====================================");
		
		// charAt()
		
		String f1 = "Testing";
		System.out.println(f1.charAt(0));
		System.out.println(f1.charAt(6));
		char myValue = f1.charAt(3);
		System.out.println(myValue);
		// System.out.println(f1.charAt(-10));
		System.out.println("====================================");
		
		// endsWith()
		
		String g1 = "Engineering";
		System.out.println(g1.endsWith("ring"));
		System.out.println(g1.endsWith("ng"));
		System.out.println(g1.endsWith("rong"));
		System.out.println(g1.endsWith("Engineering"));
		System.out.println(g1.endsWith("g"));
		System.out.println("====================================");
		
		// startsWith()
		
		System.out.println(g1.startsWith("Eng"));
		System.out.println(g1.startsWith("Engineering"));
		System.out.println(g1.startsWith("ring"));
		System.out.println(g1.startsWith("in"));
		System.out.println("====================================");
		
		// substring()
		
		String h1 = "Engineering";
		System.out.println(h1.substring(7));
		System.out.println(h1.substring(4));
		System.out.println(h1.substring(2, 5));
		System.out.println(h1.substring(4, 11));
		String subString = h1.substring(0, 3);
		System.out.println(subString);
		System.out.println("====================================");
		
		// concat()
		
		String i1 = "Software";
		String i2 = "Testing";
		System.out.println(i1.concat(i2));
		String i3 = i1.concat(i2);
		System.out.println(i3);
		System.out.println(i3.concat("Classes"));
		System.out.println("====================================");

	}

}

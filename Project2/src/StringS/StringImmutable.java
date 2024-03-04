package StringS;

public class StringImmutable {

	public static void main(String[] args) {
		
		//using String literal 
		String a="Kishor";  //literal
		System.out.println(a);
		
		String b="Kishor";
		System.out.println(b);
		
		a=a.concat("Nepal");
		System.out.println(a);
		
		//using new keyword
		String A=new String("Hari");//final //store in heap
		System.out.println(A);
		
		String B=new String("Hari");//final 
		System.out.println(B);
		
		A=A.concat("nepal");
		
		System.out.println(A);

	}

}

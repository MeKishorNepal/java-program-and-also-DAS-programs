package StringS;

public class compareStringAndStingbufferHasCode {

	public static void main(String[] args) {
		System.out.println("Hashcode test of string");
		String str="java";
		System.out.println(str.hashCode());
		str=str+"tpoint";
		System.out.println(str.hashCode());
		
		System.out.println("Hashcode test of stringBuffer");
		StringBuffer sb=new StringBuffer("java");
		System.out.println(sb.hashCode());
		sb=sb.append("tpoint");
		System.out.println(sb.hashCode());
		
		
		

	}

}

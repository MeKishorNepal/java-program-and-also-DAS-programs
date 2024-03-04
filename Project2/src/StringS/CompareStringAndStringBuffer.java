package StringS;

public class CompareStringAndStringBuffer {
	public static String concatWithString() {
		String t="java";
		for(int i=0;i<1000;i++) {
			t=t+"TPoint";
		}
		return t;
		
	}
	public static String concatWithStringBuffer() {
		StringBuffer sb=new StringBuffer("java");
		for(int i=0;i<1000;i++) {
			sb.append("Tpoint");
			
		}
		//for convert regular java string
		return sb.toString();
	}

	public static void main(String[] args) {
		long startTime=System.currentTimeMillis();
		concatWithString();
		System.out.println("Time taken by String is "+(System.currentTimeMillis()-startTime)+"ms");
		startTime=System.currentTimeMillis();
		concatWithStringBuffer();
		System.out.println("Time taken by String buffer is "+(System.currentTimeMillis()-startTime)+"ms");
		
	}

}


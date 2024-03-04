package StringBuilder;

public class countWords {

	public static void main(String[] args) {
		String count=new String("Hello i am kishor nepal");
           int countWord=count.split("\\s").length;
           System.out.println(countWord);
	}

}

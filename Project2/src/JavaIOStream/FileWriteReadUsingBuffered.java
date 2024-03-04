package JavaIOStream;
import java.io.*;
public class FileWriteReadUsingBuffered {

	public static void main(String[] args) {
		String []names= {"subash","bale","Khagendra"};
		
		//for writing a data into file
		try {
			
			BufferedWriter writer=new BufferedWriter(new FileWriter("Kishor22.txt"));
			writer.write("Hello I am Kishor Nepal");
			writer.write("\nOK");
			
			for(String name:names) {
				writer.write("\n"+name);
			}
			writer.close();
			
			System.out.println("success");
		}catch(Exception e) {System.out.println(e);
		}
		
		//for reading the data from file
		
		
		try {
		BufferedReader Reader=new BufferedReader(new FileReader("Kishor22.txt"));
		String line;
		while((line = Reader.readLine())!=null) 
		System.out.println(line);
		Reader.close();
		
		}catch(IOException e) {
			e.printStackTrace();
		}

	}

}

package JavaIOStream;
import java.io.*;
public class PushBackInputStream {

	public static void main(String[] args)throws Exception {
		String arg="1##2##3##4###123";
		byte ary[]=arg.getBytes();
		ByteArrayInputStream array=new ByteArrayInputStream(ary);
		PushbackInputStream push=new PushbackInputStream(array);
		int i;
		while((i=push.read())!=-1) {
			if(i=='#') {
				int j;
				if((j=push.read())=='#') {
					System.out.print("**");
					
					
				}
				else {
					push.unread(j);
					System.out.print((char)i);
				}
			}
				else {
					System.out.println((char)i);
				}
			}
		}

	}



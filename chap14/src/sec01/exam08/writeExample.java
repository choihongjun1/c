package sec01.exam08;

import java.io.FileWriter;
import java.io.Writer;

public class writeExample {

	public static void main(String[] args) throws Exception {
		Writer writer = new FileWriter("C:/javaLec/Temp/test5.txt");
		
		char[] array = {'A', 'B', 'C'};
		
		writer.write(array);
		
		writer.flush();
		writer.close();

	}

}

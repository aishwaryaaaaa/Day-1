import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
public class WriteFileDemo {
public static void main(String[] args) {
	demo1();
}
private static void demo1() {
	Writer out;
	try
	{
		out=new FileWriter("output.txt");
		BufferedWriter bufferedWriter =new BufferedWriter(out);
		bufferedWriter.write("Writing into a file");
		bufferedWriter.close();
	}catch(IOException e) {
	}
}
}//refresh to see output.txt file


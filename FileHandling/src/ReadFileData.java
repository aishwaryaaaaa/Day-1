import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class ReadFileData {
	//private static Reader reader;

	public static void main(String args[]) {
		try {
		
		Reader reader = new FileReader("./Input");
		BufferedReader bufferedReader=new BufferedReader(reader);
				String line=bufferedReader.readLine();
		int character=reader.read();
		while(character !=-1) {
		System.out.println(line);
		line=bufferedReader.readLine();
		
//		character=reader.read();}
//		reader.read();
		}
		}
		catch(FileNotFoundException e) {
			e.printStackTrace();
		}catch(IOException e) {
			e.printStackTrace();
		}
		
	}

}

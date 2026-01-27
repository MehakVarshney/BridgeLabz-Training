package exception;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadFileBufferedReader {
	public static void main(String args[]) {
		
		try (BufferedReader br = new BufferedReader(new FileReader("sample.txt"))){
			String line = br.readLine();
			System.out.println("Frist Line : " + line);
		}catch(IOException e) {
			System.out.println("Error reading file");
		}
	}
}

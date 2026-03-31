package exception;

import java.io.*;

public class ReadFromFile {
    public static void main(String[] args) {
        File inFile = new File("sample.txt");

        try {
            FileReader fr = new FileReader(inFile);
            int ch;

            while ((ch = fr.read()) != -1) {
                System.out.print((char) ch);
            }

            fr.close();
        } catch (IOException e) {
            System.out.println("File Not Found");
        }
    }
}

package File_Handling_Methods;

import java.io.FileWriter;
import java.io.IOException;

public class WriteFile {

    public static void main(String[] args) {

        try {

            FileWriter myWriter = new FileWriter("E:\\Files.txt");

            myWriter.write("Hello, this is my first file.\n");
            myWriter.write("I'm doing well\n");
            myWriter.write("how bout you?? everything going great?.\n");

            myWriter.close();

            System.out.println("Data written successfully.");

        } catch (IOException e) {

            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
import java.util.Scanner;
import java.io.*;

public class Test {
    public static void main(String[] args) throws IOException{
        System.out.println("Hello!");
        // Get the current working directory
        String workingDir = System.getProperty("user.dir");
        // Print the current working directory
        System.out.println("Current working directory: " + workingDir);
        FileReader fr = new FileReader("src/a.in");
        Scanner in = new Scanner(fr);
        while(in.hasNextInt()){
            System.out.println(in.nextInt());
        }
        fr.close();
    }
}
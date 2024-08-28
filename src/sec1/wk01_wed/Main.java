package sec1.wk01_wed;
import java.util.Scanner;
import java.io.*;

public class Main {
    public static void main(String [] args) throws IOException{
        Student s1 = new Student("ab1234", "John Doe", "01/02/2005", 1);
        System.out.println(s1.getName());
        Student s2 = new Student("ab4321", "Jane Doe", "03/07/2009", 2);
        System.out.println(s2.getName());

//        System.out.println(add(3, 7));
//        print_add(2, 5);
////        String fileName = "a.in";
//        String fileName = "src/sec1/wk01_wed/b.in";
//        readFile(fileName);
    }

    public static void readFile(String fileName) throws IOException{
        FileReader fr = new FileReader(fileName);
        Scanner fs = new Scanner(fr);
        while(fs.hasNextInt()){
            int a = fs.nextInt();
            System.out.print("value " + a + ", ");
            System.out.print("value double " + (2 * a) + ",");
            System.out.println("value square " + (a * a));
        }
        fr.close();
    }

    public static int add(int a, int b){
        return a + b;
    }

    public static void print_add(int a, int b){
        System.out.println(a + b);
    }
}

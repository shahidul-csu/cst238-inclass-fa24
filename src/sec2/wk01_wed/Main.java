package sec2.wk01_wed;

import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException{
        Student s1 = new Student("ab1234", "John Doe", 20);
        System.out.println(s1.getName());
        Student s2 = new Student("ba2345", "Jane Doe", 30);
        System.out.println(s2.getName());

//        System.out.println(add(5, 7));
////        String fileName = "a.in";
//        String fileName = "src/sec2/wk01_wed/b.in";
//        readFile(fileName);
    }

    public static void readFile(String fileName) throws IOException{
        FileReader fr = new FileReader(fileName);
        Scanner fs = new Scanner(fr);
        while(fs.hasNextInt()){
            int n = fs.nextInt();
            System.out.print("value: " + n + ",");
            System.out.print("value double: " + (n * 2) + ",");
            System.out.println("value square: " + (n * n));
        }
        fr.close();
    }

    public static int add(int a, int b){
        return a + b;
    }
}

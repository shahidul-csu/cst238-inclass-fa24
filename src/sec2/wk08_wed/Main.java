package sec2.wk08_wed;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String [] args) throws IOException{
        ArrayList<String> al = new ArrayList<>();
        al.add("Dog");
        al.add("Bird");
        al.add("bird");
        al.add("Cat");
        System.out.println(al);
        Collections.sort(al);
        System.out.println(al);
        System.out.println();

        ArrayList<Person> personList = loadPersonList("src/sec2/wk08_wed/person.txt");
        printList(personList);
        Collections.sort(personList);
        printList(personList);

        Person p1 = new Person("Hector", 35, 71);
        Person p2 = new Person("Ariel", 32, 68);

        System.out.println(p1.compareTo(p2));

//        System.out.println(personList);
//        Person p = new Person("Hector", 35, 71);
//        System.out.println(p);
    }

    public static void printList(ArrayList<Person> personList){
        for(Person p : personList){
            System.out.println(p);
        }
        System.out.println();
    }

    public static ArrayList<Person> loadPersonList(String filename) throws IOException {
        ArrayList<Person> people = new ArrayList<>();
        FileReader fr = new FileReader(filename);
        Scanner fs = new Scanner(fr);
        while(fs.hasNext()){
            Person p = new Person(fs.next(), fs.nextInt(), fs.nextInt());
            people.add(p);
        }
        fr.close();
        return people;
    }
}

package sec1.wk08_wed;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException{
        ArrayList<String> al = new ArrayList<>();
        al.add("Dog");
        al.add("Bird");
        al.add("bird");
        al.add("Cat");

        System.out.println(al);
        Collections.sort(al);
        System.out.println(al);
        System.out.println();

        ArrayList<Person> personList = loadPersonList("src/sec1/wk08_wed/person.txt");
        printList(personList);
        System.out.println();

        Collections.sort(personList);
        printList(personList);

        Person p1 = new Person("Hector", 35, 70);
        Person p2 = new Person("Ariel", 40, 68);
        System.out.println(p1.compareTo(p2));
    }

    public static void printList(ArrayList<Person> personList){
        for(Person p : personList){
            System.out.println(p);
        }
    }

    public static ArrayList<Person> loadPersonList(String filename) throws IOException {
        FileReader fr = new FileReader(filename);
        Scanner fs = new Scanner(fr);
        ArrayList<Person> personList = new ArrayList<>();
        while(fs.hasNext()){
            Person p = new Person(fs.next(), fs.nextInt(), fs.nextInt());
            personList.add(p);
        }
        fr.close();
        return personList;
    }
}

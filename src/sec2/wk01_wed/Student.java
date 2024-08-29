package sec2.wk01_wed;

public class Student {
    private String id;
    private String name;
    private int credit;

    Student(String i, String n, int c){
        id = i;
        name = n;
        credit = c;
    }

    public String getId(){
        return id;
    }

    public String getName(){
        return name;
    }
}

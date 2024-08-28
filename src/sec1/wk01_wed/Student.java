package sec1.wk01_wed;

public class Student {
    private String id;
    private String name;
    private String birthDay;
    private int year;

    Student(String i, String n, String dob, int y){
        id = i;
        name = n;
        birthDay = dob;
        year = y;
    }

    public String getId(){
        return id;
    }

    public String getName(){
        return name;
    }
}

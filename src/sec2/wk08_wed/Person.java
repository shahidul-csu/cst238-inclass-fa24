package sec2.wk08_wed;

public class Person implements Comparable<Person> {
    private String name;
    private int age;
    private int heightInInches;

    public Person(String name, int age, int heightInInches){
        this.name = name;
        this.age = age;
        this.heightInInches = heightInInches;
    }

    public String getName(){
        return this.name;
    }

    //Ascending order
    //return negative value if first item is smaller than the second item
    //return positive value if first item is larger than the second item
    //return 0 if they are equal
    public int compareTo(Person p){
        return this.name.compareTo(p.name);
//        return this.heightInInches - p.heightInInches;
//        return p.age - this.age;
//        return this.age - p.age;
    }

    public String toString(){
        return "Name: " + this.name + " - Age: " + this.age +
                " - Height: " + this.heightInInches + "\"";
//        StringBuilder sb = new StringBuilder();
//        sb.append("Name: ").append(this.name).append("\n");
//        sb.append("Age: ").append(this.age).append("\n");
//        sb.append("Height: ").append(this.heightInInches).append("\"");
//        return sb.toString();
    }
}

package sec1.wk08_wed;

public class Person implements Comparable<Person> {
    private String name;
    private int age;
    private int heightInInches;

    public Person(String name, int age, int heightInInches){
        this.name = name;
        this.age = age;
        this.heightInInches = heightInInches;
    }

    // return negative integer if first item is smaller
    // return positive integer if first item is larger
    // return 0 if they are same,
    public int compareTo(Person p){
        return this.name.compareTo(p.name);
//        return this.getHeight() - p.getHeight();
//        return this.getAge() - p.getAge();
//        return p.getAge() - this.getAge();
    }

    public String toString(){
        return "Name: " + this.name + " - Age: " + this.age +
                " - Height: " + this.heightInInches + "\"";
//        StringBuilder sb = new StringBuilder();
//        sb.append("Name: ").append(this.name).append("\n");
//        sb.append("Age: ").append(this.age).append("\n");
//        sb.append("Height: ").append(this.heightInInches);
//        return sb.toString();
    }

    public int getHeight(){
        return this.heightInInches;
    }

    public String getName(){
        return this.name;
    }

    public int getAge(){
        return age;
    }
}

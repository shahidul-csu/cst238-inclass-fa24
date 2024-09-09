package sec1.wk03_mon;

public class ListTest {
    public static void main(String[] args){
        List pets = new List(6);
        System.out.println(pets);
        pets.append("Dog");
        pets.append("Cat");
        System.out.println(pets);
        pets.append("Fish");
        pets.append("Turtle");
        System.out.println(pets);
        pets.insert("Snake", 1);
        System.out.println(pets);
        pets.delete(2);
        System.out.println(pets);
    }
}

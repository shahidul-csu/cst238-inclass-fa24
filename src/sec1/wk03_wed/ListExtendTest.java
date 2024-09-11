package sec1.wk03_wed;

public class ListExtendTest {
    public static void main(String[] args){
        ListExtend pets = new ListExtend(6);
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
//        System.out.println(pets.get(1));
//        System.out.println(pets.get(7));
        System.out.println(pets.charCount());
        System.out.println(pets.firstLetter());
    }
}

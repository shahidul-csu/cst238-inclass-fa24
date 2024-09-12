package sec2.wk03_wed;

public class ListExtendTest {
    public static void main(String[] args){
        ListExtend pets = new ListExtend(6);
        System.out.println(pets);
        pets.append("Dog");
        pets.append("Cat");
        System.out.println(pets);
        pets.append("Snake");
        pets.append("Bird");
        System.out.println(pets);
        pets.insert("Fish", 1);
        System.out.println(pets);
        pets.delete(0);
        System.out.println(pets);
//        System.out.println(pets.get(1));
//        System.out.println(pets.get(7));
        System.out.println(pets.charCount());
        System.out.println(pets.firstLetters());
    }
}

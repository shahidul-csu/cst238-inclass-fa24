package sec1.wk05_wed;

public class Main {
    public static void main(String[] args){
        System.out.println(Concepts.PI);
//        Concepts.PI = 5;
        Concepts c1 = new Concepts(5);
        Concepts c2 = new Concepts(7);
//        c1.state = "garbage";
        System.out.println(c1.getState());
        c1.setState("Offline");
        System.out.println(c1.getState());
        c2.setState("Online");
        System.out.println(c1.getState());
        System.out.println(Concepts.getRandom(11, 10));
        Concepts.generateRandomList();
    }
}

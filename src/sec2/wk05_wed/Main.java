package sec2.wk05_wed;

public class Main {
    public static void main(String[] args){
        System.out.println(Concepts.PI);
        Concepts c1 = new Concepts(5);
        System.out.println(c1.getState());
        System.out.println(Concepts.PI);
        System.out.println(Concepts.getRandom(11, 10));
        Concepts.generateRandomList();
        System.out.println(c1.getState());
        c1.setState("Offline");
        Concepts c2 = new Concepts(5);
        c2.populateData();
        c2.setState("Online");
        System.out.println("P1: " + c1.getState());
        System.out.println("P2: " +  c2.getState());

        Concepts.generateRandomList();

    }
}

package sec2.wk02_wed;

public class CoffeeTest {
    public static void main(String[] args){
        Coffee c1 = new Coffee(16);
        Coffee c2 = new Coffee();
        c1.addSyrup("Vanilla");
        c1.addSyrup("Orange");
        c1.addSyrup("Caramel");
        c1.addSyrup("Chocolate");
        c1.addSyrup("Lavendar");
        c1.addSyrup("Vanilla2");
        c1.printSyrup();
        c2.printSyrup();
        System.out.println(c1);
        System.out.println(c2);
    }
}

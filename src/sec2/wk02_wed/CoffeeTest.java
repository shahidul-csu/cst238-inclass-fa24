package sec2.wk02_wed;

public class CoffeeTest {
    public static void main(String[] args){
        Coffee c1 = new Coffee(18);
        Coffee c2 = new Coffee();
        c1.addSyrup("Strawberry");
        c1.addSyrup("Vanilla");
        c1.addSyrup("Orange");
        c1.addSyrup("Hazlenut");
        c1.addSyrup("Hazlenut2");
        c1.addSyrup("Hazlenut3");
//        c1.printSyrups();
//        c2.printSyrups();
        System.out.println(c1);
        System.out.println(c2);
//        System.out.println("Done");
    }
}

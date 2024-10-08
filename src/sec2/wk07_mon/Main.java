package sec2.wk07_mon;

public class Main {
    public static void main(String[] args){
        System.out.println(Foo.getFooCount());
        Foo f1 = new Foo();
        System.out.println(f1);
        Foo f2 = new Foo();
        System.out.println(f2);
        System.out.println(Foo.getFooCount());
        Foo f3 = new Foo(7);
        System.out.println(f3.getBar());
        System.out.println(Foo.getFooCount());
        Foo f4 = new Foo(3, "Hello");
        System.out.println(f4.getMe().getFooCount());
        System.out.println(f4.getItem());
//        Foo f5 = f4.getMe();
        Foo f5 = f4;
        System.out.println(f5.getItem());
        f5.setItem("World");
        System.out.println("Before Call: " +  f4.getItem());
        update(f4);
        System.out.println("After Call: " +  f4.getItem());
    }
    public static void update(Foo f){
//        f = new Foo();
        f.setItem("Updated");
    }
}

package sec1.wk07_mon;

public class Main {
    public static void updateFoo(Foo f){
//        f = new Foo();
        f.setItem("World");

    }
    public static void main(String [] args){
        Foo f1 = new Foo();
        System.out.println(f1);
        Foo f2 = new Foo();
        System.out.println(f2);
        System.out.println(Foo.getFooCount());
        Foo f3 = new Foo(7);
        System.out.println(f3.getBar());
        System.out.println(Foo.getFooCount());
        Foo f4 = new Foo(7, "Hello");
//        System.out.println(Foo.getItem());
        System.out.println(Foo.getFooCount());
        System.out.println(f4.getFooCount());
        System.out.println(f4.getMe().getFooCount());
        System.out.println(f4.getMe().getItem());
        System.out.println("Before update call: " + f4.getItem());
        updateFoo(f4);
        System.out.println("After update call: " + f4.getItem());
    }
}

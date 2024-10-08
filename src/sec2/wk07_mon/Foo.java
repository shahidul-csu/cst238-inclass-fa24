package sec2.wk07_mon;

public class Foo {
    private int bar;
    private String item;
    private static int fooCount = 0;

    public Foo(){
        fooCount++;
        System.out.println("Creating a Foo, count = " + fooCount);
        System.out.println(this);
    }

    public Foo(int bar){
//        new Foo();
        this();
        this.setBar(bar);
        System.out.println(this);
    }

    public Foo(int bar, String item){
        this(bar);
        this.setItem(item);
        System.out.println(this);
    }

    public Foo getMe(){
        return this;
    }

    public int getBar(){
        return this.bar;
    }

    public void setBar(int bar){
        this.bar = bar;
    }

    public String getItem(){
        return this.item;
    }

    public void setItem(String item){
        this.item = item;
    }

    public static int getFooCount(){
//        int c = bar + 5;
        return fooCount;
    }
}

package sec1.wk08_mon;

import java.util.Random;

public class SimpleComplexity {
    public static final int SIZE = 10000000;
    public static void main(String[] args) {
        Random r = new Random(0);
        long[] data = makeArray(SIZE, r);
        System.out.println(bar(data));
        System.out.println(foo(data));
    }

    public static long bar(long[] data){
        long sum = 0;
        long count = 0;
        for(int i = 0; i < data.length; i++){
            sum = sum + data[i];
            count++;
        }
        System.out.println("Bar iterations: " + count);
        return sum * data.length;
    }

    public static long foo(long[] data){
        long sum = 0;
        long count = 0;
        for(int i = 0; i < data.length; i++){
            for(int j = 0; j < data.length; j++){
                sum = sum + data[i];
                count++;
            }
        }
        System.out.println("Foo iterations: " + count);
        return sum;
    }

    public static long[] makeArray(int size, Random r){
        long[] a = new long[size];
        for(int i = 0; i < size; i++){
            a[i] = r.nextInt(100);
        }
        return a;
    }
}

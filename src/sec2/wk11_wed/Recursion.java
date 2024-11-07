package sec2.wk11_wed;

public class Recursion {
    public static void main(String[] args){
//        System.out.println(recur(5, 2));
//        System.out.println();
        System.out.println(GCD(5, 2));
        System.out.println(GCD(6, 15));
        System.out.println(GCD(12, 6));
    }

    //(5, 2) (6, 15)
    public static int GCD(int a, int b){
        if(b == 0)
            return a;
        return GCD(b, a % b);
    }

    //5, 2
    public static int recur(int a, int b){
        if(a <= 0){
            return 0;
        }
        int res = recur(a - 2, b + 1);
        System.out.println(a + "," + b + "," + res);
        return a + b + res;
    }
}


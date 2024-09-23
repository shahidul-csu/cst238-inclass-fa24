package sec1.wk05_mon;

public class StackApplication {
    public static boolean isBalanced(String input){
        Stack s = new Stack();
        for(int i = 0; i < input.length(); i++){
            if(input.charAt(i) == '('){
                s.push(input.charAt(i));
            } else if (input.charAt(i) == ')') {
                if(s.isEmpty()){
                    return false;
                } else{
                    s.pop();
                }
            }
            System.out.println(s);
        }

        if(!s.isEmpty()) {
            return false;
        }
        return true;
    }

    public static void main(String[] args){
        String test1 = "(())()";
        String test2 = "(())(";
        String test3 = "(()))";
        System.out.println(test1 + " is balanced? " + isBalanced(test1));
        System.out.println(test2 + " is balanced? " + isBalanced(test2));
        System.out.println(test3 + " is balanced? " + isBalanced(test3));
//        Stack s = new Stack();
//        String a = "world";
//        for(int i = 0; i < a.length(); i++){
//            s.push(a.charAt(i));
//        }
//        while (!s.isEmpty()){
//            System.out.println(s.top());
//            s.pop();
//        }
    }
}

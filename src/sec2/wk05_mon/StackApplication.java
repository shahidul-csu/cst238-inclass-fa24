package sec2.wk05_mon;

public class StackApplication {

    public static boolean isBalanced(String input){
        Stack s = new Stack();
        for(int i = 0; i < input.length(); i++){
            if(input.charAt(i) == '('){
                s.push(input.charAt(i));
            } else if(input.charAt(i) == ')'){
                if(s.isEmpty()){
                    return false;
                } else{
                    s.pop();
                }
            }
            System.out.println(s);
        }
        if(!s.isEmpty()){
            return false;
        }
        return true;
    }


    public static void main(String[] args){
        String test1 = "()(())";
        String test2= "()(()))";
        String test3 = "()((())";
        System.out.println("Is " + test1 + " balanced? " + isBalanced(test1));
        System.out.println("Is " + test2 + " balanced? " + isBalanced(test2));
        System.out.println("Is " + test3 + " balanced? " + isBalanced(test3));
//        Stack s = new Stack();
//        String test = "racecar";
//        for(int i = 0; i < test.length(); i++){
//            s.push(test.charAt(i));
//        }
//        System.out.println(s);
//        while (!s.isEmpty()){
//            System.out.println(s.top());
//            s.pop();
//        }
    }
}

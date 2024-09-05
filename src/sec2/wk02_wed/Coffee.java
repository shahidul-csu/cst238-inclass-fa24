package sec2.wk02_wed;

public class Coffee {
    private int sizeInOunces;
    private String[] syrups;
    private int syrupCount;
    public static final int MIN_SYRUP = 2;
    public static final int MAX_SYRUP = 5;

    public Coffee(){
        System.out.println("Constructor 1 called!");
        sizeInOunces = 12;
        syrups = new String[MIN_SYRUP];
        syrupCount = 0;
    }

    public Coffee(int size){
        System.out.println("Constructor 2 called!");
        sizeInOunces = size;
        if(sizeInOunces >= 16){
            syrups = new String[MAX_SYRUP];
        } else{
            syrups = new String[MIN_SYRUP];
        }
    }

    public void addSyrup(String flavor){
        if(syrupCount < syrups.length){
            syrups[syrupCount++] = flavor;
        }else {
            System.out.println("Too many syrups!");
        }
    }

    public void printSyrup(){
        if(syrupCount == 0){
            System.out.println("No syrup added!");
        }
        for(int i = 0; i < syrupCount; i++){
            System.out.println(syrups[i]);
        }
    }

    public String toString(){
        if(syrupCount == 0){
            return "No syrup added!";
        }else{
            StringBuilder sb = new StringBuilder();
            for(int i = 0; i < syrupCount; i++){
                sb.append(syrups[i]).append(",");
            }
            return sb.toString();

        }
    }
}

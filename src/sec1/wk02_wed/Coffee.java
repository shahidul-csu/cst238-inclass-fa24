package sec1.wk02_wed;

public class Coffee {
    private int sizeInOunces;
    private String[] syrups;
    private int syrupCount;
    public static final int MIN_SYRUP = 2;
    public static final int MAX_SYRUP = 5;

    public Coffee(){
        System.out.println("Constructor 1 called");
        sizeInOunces = 12;
        syrupCount = 0;
        syrups = new String[MIN_SYRUP];
    }
    public Coffee(int size){
        System.out.println("Constructor 2 called");
        sizeInOunces = size;
        syrupCount = 0;

        if(sizeInOunces >= 12){
            syrups = new String[MAX_SYRUP];
        } else{
            syrups = new String[MIN_SYRUP];
        }
    }

    public void addSyrup(String flavor){
        if(syrupCount < syrups.length){
            syrups[syrupCount++] = flavor;
        } else{
            System.out.println("Too Many Syrup!!!");
        }
    }

    public void printSyrups(){
        if(syrupCount == 0){
            System.out.println("No syrups added!");
        }
        for(int i = 0; i < syrupCount; i++){
            System.out.println(syrups[i]);
        }
    }

    public String toString(){
        if(syrupCount == 0){
            return "No Syrup Added";
        }else{
            StringBuffer sb = new StringBuffer();
            for(int i = 0; i < syrupCount; i++){
                sb.append(syrups[i] + ",");
            }
            return sb.toString();
        }
    }
}

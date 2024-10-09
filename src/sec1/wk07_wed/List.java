package sec1.wk07_wed;

public class List {
    //Attributes
    private int size;
    private int[] data;
    public static final int CAPACITY = 7;

    public List(){
        size = 0;
        data = new int[CAPACITY];
    }

    public int sum(){
        int total = 0;
        for(int i = 0; i < size; i++){
            total += data[i];
        }
        return total;
    }

    public boolean isEmpty(){
        return size == 0;
    }

    public void append(int value){
        if(size == data.length){
            System.out.println("List is full, cannot append " + value);
            return;
        }
        data[size] = value;
        size++;
    }

    public void remove(int pos){
        if(isEmpty()){
            System.out.println("Empty List");
            return;
        }
        if(pos < 0 || pos >= size){
            System.out.println("Position invalid");
            return;
        }
        //Left Shift
        for(int i = pos; i < size - 1; i++){
            data[i] = data[i + 1];
        }
        size--;
    }

    public void insert(int pos, int value){
        if(size == data.length){
            System.out.println("List is full");
            return;
        }
        if(pos < 0 || pos > size){
            System.out.println("Invalid pos");
            return;
        }
        //Right shift
        for(int i = size; i > pos; i--){
            data[i] = data[i-1];
        }
        data[pos] = value;
        size++;
    }

    public String toString(){
        if(isEmpty()){
            return "Empty List";
        } else{
            StringBuilder sb = new StringBuilder("[ ");
            for(int i = 0; i < size; i++){
                sb.append(data[i]).append(" ");
            }
            sb.append("]");
            return sb.toString();
        }
    }
}

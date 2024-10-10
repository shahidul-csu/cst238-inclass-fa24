package sec2.wk07_wed;

public class List {
    //Attributes
    private int size; // Keeps track of number of element in the list
    private int[] data;
    public static final int CAPACITY = 7;

    public List(){
        size = 0;
        data = new int[CAPACITY];
    }

    public boolean isEmpty(){
        return size == 0;
    }

    public void append(int value){
        if(size == data.length){
            System.out.println("List is full, cannot insert " + value);
            return;
        }
        data[size] = value;
        size++;
    }

    public void remove(int pos){
      if(pos < 0 || pos >= size){
            System.out.println("Position Invalid");
            return;
       }
       //Left shift
       for(int i = pos; i < size - 1; i++){
           data[i] = data[i + 1];
       }
       size--;
    }

    public void insert(int pos, int value){
        if(size == data.length){
            System.out.println("List full");
            return;
        }
        if(pos < 0 || pos > size){
            System.out.println("Invalid position");
            return;
        }
        //Right Shift
        for(int i = size; i > pos; i--){
            data[i] = data[i-1];
        }
        data[pos] = value;
        size++;
    }

    public String toString(){
        if(isEmpty()){
            return "Empty List";
        }
        else{
            StringBuilder sb = new StringBuilder("[ ");
            for(int i = 0; i < size; i++){
                sb.append(data[i]).append(" ");
            }
            sb.append("]");
            return sb.toString();
        }
    }

    public int sum(){
        int sum = 0;
        for(int i = 0; i < size; i++){
            sum += data[i];
        }
        return sum;
    }
}

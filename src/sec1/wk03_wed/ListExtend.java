package sec1.wk03_wed;

public class ListExtend {
    private String[] data;
    private int count;
    public static final int DEFAULT_CAPACITY = 20;

    public ListExtend(){
        count = 0;
        data = new String[DEFAULT_CAPACITY];
    }

    public ListExtend(int capacity){
        count = 0;
        data = new String[capacity];
    }

    public String firstLetter(){
        if(isEmpty()){
            return "Empty List";
        } else{
            StringBuilder sb = new StringBuilder();
            for(int i = 0; i < count; i++){
                sb.append(data[i].charAt(0)).append(",");
            }

            return sb.toString();
        }
    }

    public int charCount(){
        int chCount = 0;
        for(int i = 0; i < count; i++){
            chCount += data[i].length();
            System.out.println(data[i].toUpperCase() + ", len: " + data[i].length());
            System.out.println(data.length);
        }
        return chCount;
    }

    public String get(int index){
        if(index < 0 || index >= count){
            return null;
        } else{
            return data[index];
        }
    }

    public void delete(int index){
        if(isEmpty()){
            System.out.println("List Empty");
        } else if (index < 0 || index >= count) {
            System.out.println("Invalid Position");
        } else{
            for(int i = index; i < count; i++){
                data[i] = data[i+1];
            }
            data[count] = null;
            count--;
        }
    }

    public void insert(String item, int index){
        if(count == data.length){
            System.out.println("List is full");
        } else if (index < 0 || index > count) {
            System.out.println("Invalid index1");
        } else{
            for(int i = count; i > index; i--){
                data[i] = data[i-1];
            }
            data[index] = item;
            count++;
        }
    }

    public void append(String item){
        if(count == data.length){
            System.out.println("List is full");
        } else{
            data[count++] = item;
        }
    }

    public boolean isEmpty(){
        return count == 0;
    }

    public String toString(){
        if(isEmpty()){
            return "empty list";
        } else{
            StringBuilder sb = new StringBuilder();
            for(int i = 0; i < count; i++){
                sb.append(data[i] + " ");
            }
            return sb.toString();
        }
    }
}


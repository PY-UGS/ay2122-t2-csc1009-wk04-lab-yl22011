public class StackOfIntegers{

    private int elements[] = new int[0];
    private int size = 0;

    public StackOfIntegers(){

        this.elements = new int[16];


    }

    public StackOfIntegers(int capacity){
        
        this.elements = new int[capacity];

    }

    public void push(int value){
        //this.elements[elements.length - 1] = value;
        this.elements[value] = value;
    
        this.size++;
    }

    public boolean empty(){

        if(this.size == 0)
        {
            return true;
        }
        else{
            return false;
        }

    }
    
    public int peek(){

        return this.elements[size];

    }

    public int pop(){

        this.elements[size] = 0;
        size--;

        return size;

    }
    
    public int getSize(){

        return this.size;

    }
}
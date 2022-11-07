package chapter_X;

public class StackOfIntegers {

    private int[] elements;
    private int size = 0;
    public static final int DEFAULT_CAPACITY = 16;

    public StackOfIntegers(){
        this(DEFAULT_CAPACITY);
    }
    public StackOfIntegers(int capacity){
        elements = new int[capacity];
    }
    public void push(int value){
        if(size>=elements.length){
            int[] temp = new int[elements.length * 2];
            System.arraycopy(elements,0,temp,0,elements.length);
            elements = temp;
        }
        elements[size] = value;
        size++;
    }
    public void printElements(){
        for (int i=elements.length-1;i>=0;i--){
            System.out.printf(elements[i] + " ");
        }
        System.out.printf("\n");
    }
    public int pop(){
        return elements[--size];
    }
    public int peek(){
        return elements[size-1];
    }
    public boolean empty(){
        return size==0;
    }
    public int getSzie(){
        return size;
    }
}

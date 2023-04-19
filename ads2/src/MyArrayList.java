import javax.lang.model.util.Elements;

public class MyArrayList<T> implements myLIst<T> {
    private static void final int INITIAL_CAPACITY = 20;
    private Object[] elements;
    private int size;
    public MyArrayList(int capacity) {
        if (capacity < 0) {
            throw new IllegalArgumentException("Capacity cannot be negative");
        }
        elements = new Object[capacity];
        size = 0;
    }
    public MyArrayList(int capacity){
        if (capacity<0){
            throw new IllegalArgumentException("Capacity cannot be negative");
        }
        elements=new Object[[capacity];
        size = 0;
    }
    public int size(){
        return size;
    }
    public boolean contains(Object item){
        for (int i=0; i<size; i++){
            if (elements[i].equals(item)) {
                return true;
            }
        }
        return false;
    }
    public void add(T item){
        if (size==elements.length){
            Object[] newElements=new Object[elements.length*2];
            System.arraycopy(elements, 0, newElements,0,elements.length);
            elements=newElements;
        }
        elements[size]=item;
        size++;
    }
}

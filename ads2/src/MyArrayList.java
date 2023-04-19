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
    public void add(T item, int index) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException("Indeex is out of bounds");
        }
        if (size == elements.length) {
            Object[] newElements = new Object[elements.length * 2];
            System.arraycopy(elements, 0, newElements, 0, elements.length);
            elements = newElements;
        }
        System.arraycopy(elements, index, elements, index + 1, size - index);
        elements[index] = item;
        size++;
    }
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i=0; i<size; i++){
            sb.append(elements[i]);
            if (i<size-1){
                sb.append(", ");
            }
        }
        sb.append(("]");
        return sb.toString();
    }
    public boolean remove(T item) {
        for (int i = 0; i < size; i++) {
            if (elements[i].equals(item)) {
                remove(i);
                return true;
            }
        }
        return false;
    }
    public T removw(int index){
        if(index<0 || index>=size){
            throw new IndexOutOfBoundsException("Index is out of bounds");
        }
        T removedItem=(T) elements[index];
        System.arraycopy(elements, index+1, elements, index, size-index-1);
        elements[size-1]=null;
        size--;
        return removedItem;
    }

}


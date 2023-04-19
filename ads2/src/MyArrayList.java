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

}

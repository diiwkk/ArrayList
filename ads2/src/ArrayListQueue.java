import java.util.ArrayList;
import java.util.NoSuchElementException;

public class ArrayListQueue<T> {
    private ArrayList<T> list;

    public ArrayListQueue() {
        list = new ArrayList<T>();
    }

    public void enqueue(T value) {
        list.add(value);
    }

}

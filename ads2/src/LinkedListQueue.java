import java.util.LinkedList;
import java.util.NoSuchElementException;

public class LinkedListQueue<T> {
    private LinkedList<T> list;

    public LinkedListQueue() {
        list = new LinkedList<T>();
    }

    public void enqueue(T value) {
        list.addLast(value);
    }

    public T dequeue() {
        if (list.isEmpty()) {
            throw new NoSuchElementException();
        }
        return list.removeFirst();
    }

}

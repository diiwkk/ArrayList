import java.util.LinkedList;
import java.util.EmptyStackException;

public class LinkedListStack {
    private LinkedList<Integer> list;

    public LinkedListStack() {
        list = new LinkedList<>();
    }

    public void push(int value) {
        list.addFirst(value);
    }

    public int pop() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return list.removeFirst();
    }
}

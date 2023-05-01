import java.util.EmptyStackException;

public class ArrayListStack {
    private myArrayList<Integer> list;

    public ArrayListStack() {
        list = new myArrayList<>();
    }

    public void push(int value) {
        list.add(value);
    }

}


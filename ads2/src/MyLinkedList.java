public class MyLinkedList<T> implements MyList<T> {

    private static class Node<T> {
        private T element;
        private Node<T> next;
        private Node<T> previous;

        public Node(T element) {
            this.element = element;
        }
    }

    private Node<T> head;
    private Node<T> tail;
    private int size;

    public MyLinkedList() {
        head = null;
        tail = null;
        size = 0;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean contains(Object o) {
        Node<T> currentNode = head;
        while (currentNode != null) {
            if (Objects.equals(currentNode.element, o)) {
                return true;
            }
            currentNode = currentNode.next;
        }
        return false;
    }

    @Override
    public void add(T item) {
        Node<T> newNode = new Node<>(item);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            newNode.previous = tail;
            tail = newNode;
        }
        size++;
    }

    @Override
    public void add(T item, int index) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException("Index out of bounds");
        }
        if (index == size) {
            add(item);
        } else {
            Node<T> newNode = new Node<>(item);
            if (index == 0) {
                newNode.next = head;
                head.previous = newNode;
                head = newNode;
            } else {
                Node<T> currentNode;
                if (index <= size / 2) {
                    currentNode = head;
                    for (int i = 0; i < index; i++) {
                        currentNode = currentNode.next;
                    }
                } else {
                    currentNode = tail;
                    for (int i = size - 1; i > index; i--) {
                        currentNode = currentNode.previous;
                    }
                }
                newNode.previous = currentNode.previous;
                newNode.next = currentNode;
                currentNode.previous.next = newNode;
                currentNode.previous = newNode;
            }
            size++;
        }
    }

    @Override
    public boolean remove(T item) {
        Node<T> currentNode = head;
        while (currentNode != null) {
            if (Objects.equals(currentNode.element, item)) {
                if (currentNode.previous != null) {
                    currentNode.previous.next = currentNode.next;
                } else {
                    head = currentNode.next;
                }
                if (currentNode.next != null) {
                    currentNode.next.previous = currentNode.previous;
                } else {
                    tail = currentNode.previous;
                }
                size--;
                return true;
            }
            currentNode = currentNode.next;
        }
        return false;
    }
}
package DSA.DataStructures;


public class LinkedList<T> {
    Node<T> head;
    int len = 0;

    /**
     * This method adds the element at the last of the Linked List.
     * It takes an integer parameter and returns void.
     *
     * @param data Will be added at last of LinkedList
     */
    public void add(T data) {
        Node<T> node = new Node<>(data);
        if (head == null) {
            head = node;
        } else {
            Node<T> temp = head;

            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = node;
        }
        len++;
    }

    /**
     * This method adds the element at a specified position in the Linked List.
     * It takes 3 parameters and returns void.
     *
     * @param data Will be added at the Last position in LinkedList
     */
    public void addLast(T data) {
        add(data);
    }

    public void addFirst(T data) {
        Node<T> node = new Node<>(data);

        if (head == null) {
            head = node;
        }

        node.next = head;
        head = node;
        len++;
    }

    public void add(int index, T data) {
        if (index < 0 || index > size()) {
            throw new IndexOutOfBoundsException();
        }

        Node<T> node = new Node<>(data);
        Node<T> temp = head;
        Node<T> prev = null;
        while (temp.next != null && index >= 0) {
            index--;
            prev = temp;
            temp = temp.next;
        }

        prev.next = node;
        node.next = temp;

    }

    public LinkedList<T> clone() {
        LinkedList<T> clone = new LinkedList<>();

        Node<T> temp = head;
        while (temp.next != null) {
            clone.add(temp.data);
            temp = temp.next;
        }
        return clone;
    }

    public boolean contains(T data) {
        if (head == null) {
            return false;
        }

        Node<T> temp = head;
        while (temp != null) {
            if (temp.data == data) {
                return true;
            }
            temp = temp.next;
        }

        return false;
    }

    public int size() {
        return len;
    }

    public T pop() throws underflowException {

        if (head == null) {
            throw new underflowException();
        }

        T data = head.data;
        head = head.next;
        len--;
        return data;
    }

    public T removeFirst() throws underflowException {
        return pop();
    }

    public T removeLast() throws underflowException {
        if (head == null) {
            throw new underflowException();
        }

        if (head.next == null) {
            T data = head.data;
            head = null;
            len--;
            return data;
        }

        Node<T> current = head;
        Node<T> prev = null;
        while (current.next != null) {
            prev = current;
            current = current.next;
        }

        T data = current.data;
        prev.next = null;
        len--;
        return data;

    }

    public void clear() {
        head = null;
        len = 0;
    }

    public boolean equals(LinkedList<T> list) {

        if (list == this) {
            return true;
        } else if (list.size() != this.size()) {
            return false;
        }

        Node<T> thisTemp = this.head;
        Node<T> listTemp = list.head;

        while (thisTemp != null) {
            if (thisTemp.data != listTemp.data) {
                return false;
            }
            thisTemp = thisTemp.next;
            listTemp = listTemp.next;
        }

        return true;
    }

    public void display() {
        Node<T> current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

}

class Node<T> {
    T data;
    Node<T> next;

    Node(T data) {
        this.data = data;
        this.next = null;
    }

}

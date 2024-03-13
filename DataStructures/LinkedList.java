package DSA.DataStructures;

import javax.sound.midi.Track;

public class LinkedList {
    Node head;
    int len = 0;

    /**
     * This method adds the element at the last of the Linked List.
     * It takes an integer parameter and returns void.
     *
     * @param data Will be added at last of LinkedList
     */
    public void add(int data) {
        Node node = new Node(data);
        if (head == null) {
            head = node;
        } else {
            Node temp = head;

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
    public void addLast(int data) {
        add(data);
    }

    public void addFirst(int data) {
        Node node = new Node(data);

        if (head == null) {
            head = node;
        }

        node.next = head;
        head = node;
        len++;
    }

    public void add(int index, int data) {
        if (index < 0 || index > size()) {
            throw new IndexOutOfBoundsException();
        }

        Node node = new Node(data);

        Node temp = head;
        Node prev = null;
        while (temp.next != null && index >= 0) {
            index--;
            prev = temp;
            temp = temp.next;
        }

        prev.next = node;
        node.next = temp;

    }

    public LinkedList clone() {
        LinkedList clone = new LinkedList();

        Node temp = head;
        while (temp.next != null) {
            clone.add(temp.data);
            temp = temp.next;
        }
        return clone;
    }

    public boolean contains(int data) {
        if (head == null) {
            return false;
        }

        Node temp = head;
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

    public int pop() throws underflowException {

        if (head == null) {
            throw new underflowException();
        }

        int data = head.data;
        head = head.next;
        len--;
        return data;
    }

    public int removeFirst() throws underflowException {
        return pop();
    }

    public int removeLast() throws underflowException {
        if (head == null) {
            throw new underflowException();
        }

        if (head.next == null) {
            int data = head.data;
            head = null;
            len--;
            return data;
        }

        Node current = head;
        Node prev = null;
        while (current.next != null) {
            prev = current;
            current = current.next;
        }

        int data = current.data;
        prev.next = null;
        len--;
        return data;

    }

    public void clear() {
        head = null;
        len = 0;
    }

    public boolean equals(LinkedList list) {

        if (list == this) {
            return true;
        } else if (list.size() != this.size()) {
            return false;
        }

        Node thisTemp = this.head;
        Node listTemp = list.head;

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
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

}

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }

}

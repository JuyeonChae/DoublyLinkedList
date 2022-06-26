import java.io.Serializable;

public class DoublyLinkedList implements Serializable {
    private Node top;

    // as I add ID, password and website through UI/GUI the program creates a double linked list

    public DoublyLinkedList() {
        top = null;
    }

    public int size() {
        Node temp = top;
        int size = 0;
        while (temp.getNext() != null) {
            size++;
            temp = temp.getNext();
        }
        return size;
    }

    public void add(Data s) {
        Node temp = top;

        if (top == null) {

        }

    }

    public Data remove(int index) {
        Node temp = top;

        if (temp == null) {
            throw new IndexOutOfBoundsException();
        }

        if (index < 0 || index >= size()) {
            throw new IndexOutOfBoundsException();
        }

        if (temp.getNext() == null && index != 0) {
            throw new IndexOutOfBoundsException();
        }

        if (temp.getNext() == null && index == 0) {
            top = null;
            return temp.getData();
        }

        if (temp.getNext() != null) {
            if (index == 0) {
                top = temp.getNext();
                top.setPrev(null);

                return temp.getData();
            }
            if (size() < index) {
                for (int i = 0; i < index; i++) {
                    temp = temp.getNext();
                }
                temp.getNext().setPrev(temp.getPrev());
                temp.getPrev().setNext(temp.getNext());

                return temp.getData();
            }
            if (index == size() - 1) {
                for (int i = 0; i < index; i++) {
                    temp = temp.getNext();
                }
                temp.getPrev().setNext(null);

                return temp.getData();
            }
        }

        return temp.getData();
    }

    public Data get(int index) {
        Node temp = top;

        if (temp == null) {
            throw new IndexOutOfBoundsException();
        }

        if (index < 0 || index >= size()) {
            throw new IndexOutOfBoundsException();
        }

        if (temp.getNext() == null && index != 0) {
            throw new IndexOutOfBoundsException();
        }

        if (temp.getNext() == null && index == 0) {
            return temp.getData();
        }

        if (temp.getNext() != null && index > 0) {
            for (int i = 0; i < index; i++) {
                temp = temp.getNext();
            }
            return temp.getData();
        }

        return temp.getData();
    }

    public void display() {
        Node temp = top;
        while (temp != null) {
            System.out.println(temp.getData());
            temp = temp.getNext();
        }
    }
}

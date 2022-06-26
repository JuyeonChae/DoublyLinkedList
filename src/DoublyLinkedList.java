import java.io.Serializable;

public class DoublyLinkedList implements Serializable{
    private Node top;

    // as I add ID, password and website through UI/GUI the program creates a double linked list

    public DoublyLinkedList() {
        top = null;
    }

    public void add(Data s) {
        Node temp = top;

        if (top == null) {

        }

    }

    public Data remove(int index) {
    }

//    public Data get(int index) {
//
//    }

    public void display() {
        Node temp = top;
        while (temp != null) {
            System.out.println(temp.getData());
            temp = temp.getNext();
        }
    }
}

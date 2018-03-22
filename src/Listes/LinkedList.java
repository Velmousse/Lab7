package Listes;

public class LinkedList<T> implements List {
    private int nbObjects = 2;
    private Node<T> head, tail;

    public LinkedList() {
        head.setNext(tail);
    }


    public void add(T element) {
        Node<T> temp = new Node<T>(element);
        nbObjects++;
        tail.setNext(temp);
        tail = tail.getNext();
    }

    public void add(int index, T element) {
        Node<T> temp = head;
        if (index < nbObjects && nbObjects >= 0) {
            if (index != 0) {
                for (int i = 1; i < index; i++)
                    temp = temp.getNext();
                temp.setNext((Listes.Node<T>) element);
            }
            //else head
        }
    }


    public void set(int index, T element) {
        Node<T> temp = head;
        if (index < nbObjects && nbObjects >= 0) {
            if (index != 0) {
                for (int i = 0; i < index; i++)
                    temp = temp.getNext();
            }
            temp.setContenu(element);
        }
    }


    public T get(int index) {
        Node<T> temp = head;
        if (index < nbObjects && nbObjects >= 0) {
            for (int i = 0; i < index; i++)
                temp = temp.getNext();
            return temp.getContenu();
        }
        else return null;
    }


    public void remove(int index) {
        Node<T> temp = head;
        if (index < nbObjects && index >= 0) {
            for (int i = 1; i < index - 1; i++) {

            }
        }
    }


    public void clear() {
        nbObjects = 0;
    }


    public int size() {
        return nbObjects;
    }
}

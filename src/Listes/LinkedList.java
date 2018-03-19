package Listes;

public class LinkedList<T> implements List {
    private int nbObjects = 0;
    private int position = 0;
    private Node<T> head, tail;

    public LinkedList(int taille) {
        Node<T> next;
        nbObjects = taille;
        head = new Node<T>(null);
        next = head.getNext();
        for (int i = 1; i < nbObjects; i++) {
            next = new Node<T>(null);
            next = next.getNext();
            if (i == nbObjects - 1)
                tail = next;
        }
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
            for (int i = 0; i < index; i++)
                temp = temp.getNext();
            
        }
    }


    public void set(int index, T element) {
        Node<T> temp = head;
        if (index < nbObjects && nbObjects >= 0) {
            for (int i = 0; i < index; i++)
                temp = temp.getNext();
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

    }


    public void clear() {
        nbObjects = 0;
    }


    public int size() {
        return nbObjects;
    }
}

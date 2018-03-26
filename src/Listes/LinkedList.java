package Listes;

public class LinkedList<T> implements List<T> {
    private int nbObjects = 0;
    private Node<T> head = new Node<T>(null), tail = new Node<>(null);

    public LinkedList() {
        head.setNext(tail);
    }


    public void add(T element) {
        if (nbObjects == 0)
            head.setContenu(element);
        else if (nbObjects == 1)
            tail.setContenu(element);
        else {
            tail.setNext(new Node<T>(element));
            tail = tail.getNext();
        }
        nbObjects++;
    }

    public void add(int index, T element) {
       if (index >= 0 && index < nbObjects) {
           Node<T> temp = head, referenceTemp, newNode = new Node<T>(element);
           if (index == 0) {
                referenceTemp = head;
                head = newNode;
                head.setNext(referenceTemp);
           }
           else {
               for (int i = 1; i < index - 1; i++)
                   temp = temp.getNext();
               referenceTemp = temp.getNext();
               temp.setNext(newNode);
               temp.getNext().setNext(referenceTemp);
               if (index == nbObjects - 1) {
                   temp.getNext().getNext().setNext(null);
                   tail = temp.getNext().getNext();
               }
           }
           nbObjects++;
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
        Node<T> temp = head, referenceTemp;
        if (index < nbObjects && index >= 0) {
            if (index == 0)
                head = head.getNext();
            else if (index == nbObjects - 1) {
                for (int i = 1; i < nbObjects - 1; i++)
                    temp = temp.getNext();
                temp.setNext(null);
                tail = temp;
            }
            else {
                for (int i = 1; i < index; i++)
                    temp = temp.getNext();
                temp.setNext(temp.getNext().getNext());
            }
            nbObjects--;
        }

    }


    public void clear() {
        nbObjects = 0;
        head.setNext(tail);
        tail.setNext(null);
    }


    public int size() {
        return nbObjects;
    }
}

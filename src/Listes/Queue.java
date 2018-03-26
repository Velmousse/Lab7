package Listes;

public class Queue<T> {
    private LinkedList<T> liste = new LinkedList<>();

    public void add(T element) {
        liste.add(element);
    }


    public T remove() {
        T temp = liste.get(0);
        liste.remove(0);
        return temp;
    }


    public T peek() {
        return liste.get(0);
    }


    public void clear() {
        liste.clear();
    }

    public int size() {
        return liste.size();
    }
}

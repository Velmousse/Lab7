package Listes;

public class Stack<T> {
    private LinkedList<T> liste = new LinkedList<>();

    public void push(T element) {
        liste.add(element);
    }


    public T pop() {
        T tempo = liste.get(liste.size() - 1);
        liste.remove(liste.size() - 1);
        return tempo;
    }


    public T peek() {
        return liste.get(liste.size() - 1);
    }


    public void clear() {
        liste.clear();
    }


    public int size() {
        return liste.size();
    }
}

package Listes;

public class LinkedList<T> implements List {
    private static int taille, nbObjects = 0;
    private int position = 0;
    protected LinkedList<T> next = null;
    private T content;

    public LinkedList(int taille) {
        LinkedList.taille = taille;

    }


    private void add(int position) {

    }

    public void add(T element) {
        content = element;
        nbObjects++;
    }

    public void add(int index, T element) {

    }


    public void set(int index, T element) {

    }


    public T get(int index) {
        if (index == taille - 1)
            return content;
        else
            return next.get(index);
    }


    public void remove(int index) {

    }


    public void clear() {

    }


    public int size() {
        return taille;
    }
}

package Listes;

/**
 * Created by DufVi1731300 on 2018-03-19.
 */
public class Node<T> {
    private T contenu;
    private Node<T> next = null;

    public Node(T contenu) {
        this.contenu = contenu;
    }

    public T getContenu() {
        return contenu;
    }

    public void setContenu(T contenu) {
        this.contenu = contenu;
    }

    public Node<T> getNext() {
        return next;
    }

    public void setNext(Node<T> next) {
        this.next = next;
    }
}

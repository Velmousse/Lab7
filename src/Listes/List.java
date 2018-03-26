package Listes;

/**
 * Created by DufVi1731300 on 2018-03-12.
 */
public interface List<T> {
    void add(T element);
    void add(int index, T element);
    void set(int index, T element);
    T get(int index);
    void remove(int index);
    void clear();
    int size();
}

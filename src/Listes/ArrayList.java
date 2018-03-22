package Listes;

public class ArrayList<T> implements List {
    private T[] tableau;
    private int taille, nbObjets = 0;

    public ArrayList(int taille) {
        if (taille > 0) {
            this.taille = taille;
            tableau = (T[]) new Object[taille];
        }
    }


    public void add(T element) {
        if (nbObjets >= taille) {
            if (taille <= 0) taille = 1;
            else taille *= 2;
            T[] tabTemp = (T[]) new Object[taille];
            for (int i = 0; i < nbObjets; i++)
                tabTemp[i] = tableau[i];
            tableau = tabTemp;
        }

        tableau[nbObjets] = element;
        nbObjets++;
    }

    public void add(int index, T element) {
        if (taille <= 0) taille = 1;

        if (index < taille && index >= 0) {
            if (nbObjets >= taille - 2) {
                taille *= 2;
                T[] tabTemp = (T[]) new Object[taille];
                for (int i = 0; i < nbObjets; i++)
                    tabTemp[i] = tableau[i];
                tableau = tabTemp;
            }

            for (int i = nbObjets; i > index; i--)
                tableau[i] = tableau[i - 1];

            tableau[index] = element;
            nbObjets++;
            taille++;
        }
    }


    public void set(int index, T element) {
        if (index >= 0 && index < taille)
            tableau[index] = element;
    }


    public T get(int index) {
        if (index >= 0 && index < nbObjets) return tableau[index];
        else return null;
    }


    public void remove(int index) {
        if (index >= 0 && index < taille) {
            for (int i = index; i < (nbObjets - 1); i++) {
                tableau[i] = tableau[i + 1];
            }
            nbObjets--;
        }
    }


    public void clear() {
        taille = 0;
        nbObjets = 0;
    }


    public int size() {
        if (tableau != null) return nbObjets;
        else return 0;
    }
}
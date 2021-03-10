package eu.senla.task8;

import java.util.Comparator;
import java.util.ListIterator;

public interface MyList<E> {


    int size();
    void add(E obj);
    boolean isEmpty();

    void add(int index, E obj);
    boolean addAll(int index, MyList col);
    E get(int index);
    int indexOf(Object obj);
    int lastIndexOf(Object obj);
    ListIterator listIterator ();

    static <E> MyList<E> of(Object... e) {
        return null;
    }

    E remove(int index);
    E set(int index, E obj);
    void sort(Comparator comp);
    MyList<E> subList(int start, int end);

}

package eu.senla.task10;

import java.util.ListIterator;

public interface MyList<T> {
    void add (int index, T obj) throws Exception;
    boolean addAll(int index,MyList<? extends T>col) throws Exception;
    T get(int index) throws MyNegativeArraySizeException, MyStringIndexOutOfBoundsException, MyArrayIndexOutOfBoundsException;
    T set(int index, T obj) throws Exception;
    void sort(MyComparator<? super T>comp);
    ListIterator<T> listIterator ();
    T remove(int index);
    int indexOf(Object obj);
    int lastIndexOf(Object obj);
    MyList<T> subList(int start, int end) throws Exception;
    Object[] toArray();
}

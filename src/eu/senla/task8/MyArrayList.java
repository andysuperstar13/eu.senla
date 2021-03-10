package eu.senla.task8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.ListIterator;

public class MyArrayList<E> implements MyList<E> {
    private static final int DEFAULT_CAPACITY = 10;
    private Object[] myArrayList;
    private int size;

    MyArrayList() {
        this.myArrayList = new Object[DEFAULT_CAPACITY];
    }

    MyArrayList (int capacity){
        if (capacity > 0) {
            this.myArrayList = new Object[capacity];
        } else if (capacity == 0){
            new MyArrayList();
        }
    }

    MyArrayList(MyList <? extends E> col){
        this.myArrayList = new Object[col.size()+1];
        for (int i = 0; i < col.size(); i++) {
            myArrayList[i] = col.get(i);
            size++;
        }
    }

    private void ensureCapacity(int minCapacity) {
        if (minCapacity - (myArrayList.length - myArrayList.length/2) > 0)
            grow(minCapacity);
    }

    private void grow(int minCapacity) {
        int oldCapacity = myArrayList.length;
        int newCapacity = oldCapacity + (oldCapacity >> 1);
        if (newCapacity - minCapacity < 0)
            newCapacity = minCapacity;
        myArrayList = Arrays.copyOf(myArrayList, newCapacity);
    }

    @Override
    public void add(E obj) {
        ensureCapacity(size + 1);
        myArrayList[size++] = obj;
    }

    @Override
    public void add(int index, Object obj) {
        Object[] bufArrayList = clone();
        ensureCapacity(size + 1);
        for (int i = 0; i < size; i++) {
            if (i < index){
                myArrayList[i] = bufArrayList[i];
            }
            if (i == index){
                myArrayList[i] = obj;
                size++;
            }
            if (i> index){
                myArrayList[i] = bufArrayList[i-1];
            }
        }
    }

    @Override
    public boolean addAll(int index, MyList col) {
        Object[] bufArrayList = clone();
        int d = 0;
        for (int i = 0; i < bufArrayList.length; i++) {
            if (i < index){
                myArrayList[i] = bufArrayList[i];
            }
            if (i == index){
                d = i;
                int k = col.size();
                for (int j = 0; j < k; j++) {
                    if (size > DEFAULT_CAPACITY){
                        ensureCapacity(size);
                    }
                    myArrayList[i] = col.get(j);
                    i++;
                    size++;
                }
            }
            if (i> index){
                myArrayList[i] = bufArrayList[d];
                d++;
            }
        }
        return size != 0;
    }

    public Object[] clone(){
        Object[] bufArrayList = new Object[myArrayList.length];
        for (int i = 0; i < bufArrayList.length; i++) {
            bufArrayList[i] = myArrayList[i];
        }
        return bufArrayList;
    }

    @Override
    public int size() {
        return this.size;
    }
    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public E get(int index) {
        return (E) myArrayList[index];
    }

    @Override
    public int indexOf(Object obj) {
        if (obj == null){
            for (int i = 0; i < myArrayList.length; i++) {
                if (myArrayList[i] == null){
                    return i;
                }
            }
        }
        if (obj != null){
            for (int i = 0; i < myArrayList.length-1; i++) {
                if (obj.equals(myArrayList[i])){
                    return i;
                }
            }
        }
        return -1;
    }

    @Override
    public int lastIndexOf(Object obj) {
        if (obj == null){
            for (int i = myArrayList.length-1; i >= 0; i--) {
                if (myArrayList[i] == null){
                    return i;
                }
            }
        }
        if (obj !=null){
            for (int i = myArrayList.length-1; i >= 0; i--) {
                if (obj.equals(myArrayList[i])){
                    return i;
                }
            }
        }
        return -1;
    }

    @Override
    public ListIterator listIterator() {
        return null;
    }

    @Override
    public E remove(int index) {
        E removebject = null;
        for (int i = 0; i < myArrayList.length; i++) {
            if (i == index){
                removebject = (E) myArrayList[i];
                size--;
            }
            if (i>index){
                myArrayList[i-1]= myArrayList[i];
            }
            if (i == size){
                myArrayList[i] = null;
            }
        }
        return removebject;
    }

    @Override
    public void sort(Comparator comp) {

    }

    @Override
    public Object set(int index, Object obj) {
        for (int i = 0; i < myArrayList.length; i++) {
            if ( i == index){
                myArrayList[i] = obj;
            }
        }
        return myArrayList;
    }


    @Override
    public MyList<E> subList(int start, int end) {
        return null;
    }


    @Override
    public String toString() {
        StringBuilder buf = new StringBuilder();
        buf.append('[');
        for (int i = 0; i < myArrayList.length; i++) {
            buf.append(String.valueOf(myArrayList[i]));
            if (i == size-1){
                return buf.append(']').toString();
            }
            buf.append(", ");
        }
        return buf.toString() ;
    }


}

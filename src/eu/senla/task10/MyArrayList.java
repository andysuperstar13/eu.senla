package eu.senla.task10;

import java.util.Arrays;
import java.util.ListIterator;

public class MyArrayList<T> implements MyList<T> {

    private int size;
    private int capacity = 10;
    private Object[] myArray;
    private static Object[] emptyArray = {};

    public MyArrayList() {
        this.myArray = emptyArray;
    }

    public MyArrayList(int capacity) {
        this.myArray = new Object[capacity];
        this.capacity = capacity;
    }

    public MyArrayList(MyList<? extends  T> col) {
        Object[] tempCol = col.toArray();
        if (col.getClass() == MyArrayList.class) {
            myArray = tempCol;
        } else {
            for (int i = 0; i < tempCol.length; i++) {
                myArray[i] = tempCol[i];
            }
        }
    }

    public void add(int index, T obj) throws Exception{
        checkIndex(index);
        checkObject(obj);
        if (index == myArray.length-1) {
            myArray = Arrays.copyOf(myArray, index + 1);
            myArray[index] = obj;
        } else {
            myArray = Arrays.copyOf(myArray, myArray.length + 1);
            for (int i = myArray.length-1; i>index ;i--) {
                myArray[i] = myArray [i-1];
            }
            myArray[index] = obj;
        }
    }


    public boolean addAll(int index, MyList<? extends T> col) throws Exception {
        Object[] tempCol = col.toArray();
        int x = tempCol.length;
        checkIndex(index);
        for (int i = 0; i < tempCol.length; i++) {
            this.add(index,(T) tempCol[i]);
            index++;
        }
        return true;
    }

    public T get (int index) throws MyNegativeArraySizeException, MyArrayIndexOutOfBoundsException {
        checkIndex(index);
        return (T) myArray[index];
    }

    public int indexOf (Object obj) {
        for (int index = 0; index < myArray.length; index++) {
            if (myArray[index] != null && myArray[index].equals(obj)) {
                return index;
            }
        }
        return -1;
    }

    public int lastIndexOf (Object obj) {
        int index = -1;
        for (int i = 0; i < myArray.length; i++) {
            if (myArray[i] != null && myArray[i].equals(obj)) {
                index = i;
            }
        }
        return index;
    }

    public ListIterator<T> listIterator() {
        return new MyListIterator();
    }

    private class MyListIterator<T> implements ListIterator<T> {
        int size = MyArrayList.this.size;
        int currentPointer = 0;
        int lastPointer = size-1;

        @Override
        public boolean hasNext() {
            return (currentPointer<size);
        }
        @Override
        public T next() {
            if(!hasNext()){
                System.out.println("Out of bounds");
            }
            T val = (T) myArray[currentPointer];
            currentPointer +=1;
            return val;
        }
        @Override
        public boolean hasPrevious() {
            return (lastPointer>=0);
        }
        @Override
        public T previous() {
            if(!hasPrevious()){
                System.out.println("Out of bounds");
            }
            T val = (T) myArray[lastPointer];
            lastPointer-=1;
            return val;
        }
        @Override
        public int nextIndex() {
            return 0;
        }
        @Override
        public int previousIndex() {
            return 0;
        }
        @Override
        public void remove() {
        }
        @Override
        public void set(T t) {
        }
        @Override
        public void add(T t) {
        }
    }

    public T remove (int index) {
        if (index < myArray.length && index >= 0) {
            Object temp = new Object();
            temp = myArray[index];
            for (int i = index; i<myArray.length-1 ;i++) {
                myArray[i] = myArray [i+1];
            }
            myArray = Arrays.copyOf(myArray, myArray.length -1);
            return (T) temp;
        } else {
            return null;
        }
    }

    public T set (int index, T obj) throws MyNegativeArraySizeException, MyArrayIndexOutOfBoundsException, MyStringIndexOutOfBoundsException {
        checkIndex(index);
        checkObject(obj);
        myArray[index] = obj;
        return (T) myArray[index];
    }

    public void sort(MyComparator<? super T> comp) {
        Object tempObj;
        Object[] temp = new Object[size];
        for (int i = 0; i < size; i++) {
            temp[i] = myArray[i];
        }
        for (int i = 0; i < temp.length; ++i) {
            for (int j = 1; j < temp.length - i; ++j) {
                if (comp.compare((T) temp[j - 1], (T) temp[j]) > 0) {
                    tempObj = temp[j - 1];
                    temp[j - 1] = temp[j];
                    temp[j] = tempObj;
                }
            }
        }
        for (int i = 0; i < size; i++) {
            myArray[i] = temp[i];
        }
    }

    public MyList<T> subList (int start, int end) throws Exception{
        checkIndex(start);
        checkIndex(end);
        MyList temp = new MyArrayList<T>(1);
        for (int i = start, j=0; i < end; i++, j++) {
            temp.add(j, myArray[i]);
        }
        return temp;
    }

    public Object[] toArray() {
        Object[] temp = new Object[this.myArray.length];
        for (int i = 0; i < this.myArray.length; i++) {
            temp[i] = this.myArray[i];
        }
        return temp;
    }

    public int getSize () {
        int index = 0;
        for (int i = myArray.length-1; i != 0; i--) {
            if (myArray[i] != null) {
                index = i;
                break;
            }
        }
        return index;
    }

    private void checkIndex(int index) throws MyArrayIndexOutOfBoundsException,MyNegativeArraySizeException {
        if (index < 0) throw new MyNegativeArraySizeException("Индекс имеет отрицательное значение");
        if (index > myArray.length) throw new MyArrayIndexOutOfBoundsException("Индекс за пределами массива");
    }

    private void checkObject(T obj) throws MyStringIndexOutOfBoundsException {
        if (obj.toString().length() > 7) throw new MyStringIndexOutOfBoundsException("Объект превышает предусмотренное количество символов (7)");
    }

    public String toString () {
        StringBuilder str = new StringBuilder();
        str.append("MyArrayList {");
        for (Object obj : myArray) {
            str.append(String.valueOf(obj));
            str.append(", ");
        }
        if (myArray.length > 0) {
            str.delete(str.length()-2, str.length());
        }
        str.append("}");
        return str.toString();
    }
}

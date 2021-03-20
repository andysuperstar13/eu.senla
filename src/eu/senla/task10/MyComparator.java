package eu.senla.task10;

import java.util.Comparator;

public class MyComparator <T extends Comparable<T>>implements Comparator<T> {
    public int compare(T o1, T o2) {
        return o1.compareTo(o2);
    }
}

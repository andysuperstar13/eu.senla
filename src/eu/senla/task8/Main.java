package eu.senla.task8;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(5);
        list.add(3);
        list.add(8);
        list.add(6);
        list.add(9);
        list.add(1, 15);
        list.add(2, 7);
        list.add(3, 9);



        MyList<Integer> myList1 = new MyArrayList<>(5);
        myList1.add(2);
        myList1.add(8);
        myList1.add(3);
        myList1.add(7);
        myList1.add(2, 18);
        myList1.add(3, 6);
        myList1.add(1, 4);
        myList1.add(3);
        myList1.add(4);

        MyList<Integer> myList = new MyArrayList<>();
        myList.add(4);
        myList.add(9);
        myList.add(1);
        myList.addAll(2, myList1);



        MyList<Integer> myList2 = new MyArrayList<>(myList1);


        System.out.println("list = " + list);
        System.out.println("list.size = " + list.size());
        System.out.println("list.get(index) = " + list.get(3));
        System.out.println("list.indexOf(object) = " + list.indexOf(2));
        System.out.println("list.subList(indexStart, indexEdn) = " + list.subList(2, 5) + "\n");
        System.out.println("list = " + list);


        System.out.println("myList = " + myList.isEmpty());
        System.out.println("myList = " + myList);
        myList.set(3, 21);
        System.out.println("myList = " + myList);
        myList.remove(3);
        System.out.println("myList = " + myList + "\n");

        System.out.println("myList1 = " + myList1);
        System.out.println("myList1.isEmpty() = " + myList1.isEmpty());
        System.out.println("myList1.size = " + myList1.size());
        System.out.println("myList1.get(index) = " + myList1.get(1));
        System.out.println("myList1.indexOf(object) = " + myList1.indexOf(4));
        System.out.println("myList1.lastIndexOf(object) = " + myList1.lastIndexOf(4) + "\n");

        System.out.println("myList2 = " + myList2.isEmpty());
        System.out.println("myList2 = " + myList2);
        System.out.println("myList2.size = " + myList2.size());


    }

}


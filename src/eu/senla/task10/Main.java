/*      1. Написать три своих исключения.
        2. Каждое должно логически срабатывать при определенных условиях.
        3. Конструкции с исключениями должны включать try / catch / finally.
        4. Два из трех могут быть объединенные.
        5. Третье в отдельном методе и пробрасывается, т.е. ловится выше.
        * Самим придумать почему исключения срабатывает.*/
package eu.senla.task10;

public class Main {
    public static void main(String []args) throws Exception {
        MyList<String>list = new MyArrayList<>();
        list.add(0,"stringA");
        list.add(1,"stringB");
        list.add(2,"stringC");
        list.add(3,"stringD");

        try {
            list.get(111);
        }catch (MyArrayIndexOutOfBoundsException | MyNegativeArraySizeException e) {
            System.out.println(e.getMessage());
        }finally {
            System.out.println(list);
        }
        try {
            list.set(1,"stringABCD");
        }catch (MyStringIndexOutOfBoundsException ee) {
            System.out.println(ee.getMessage());
        }finally {
            System.out.println(list);
        }
    }
}

package eu.senla.task4;

public class Main {
    public static final int MATRIX_SIZE = 10;
    public static final int ELEMENT_SIZE = 6;
    public static final int FILLING_COUNTER = 3;
    public static void main(String [] args){
        Matrix matrix = new Matrix(MATRIX_SIZE, ELEMENT_SIZE, FILLING_COUNTER);
        System.out.println(matrix);

        TaskUtil.doTask(matrix, MATRIX_SIZE, FILLING_COUNTER);
    }
}

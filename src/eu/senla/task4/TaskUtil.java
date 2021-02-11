package eu.senla.task4;

public class TaskUtil {
    public static void doTask(Matrix matrix, int matrixSize, int fillingCounter){

        String[] mainDiag = matrix.getMainDiag();

        StringBuilder stringBuilder = new StringBuilder();

        Double[] doubleArray = new Double[(int)Math.ceil(matrixSize * 1.0 / fillingCounter)];
        int counter = 0;
        for (int i = 0; i < mainDiag.length; i++){
            if(StringUtil.isNumber(mainDiag[i])){
                Double value = Double.parseDouble(mainDiag[i]);
                if (value>= 1.7){
                    value = Math.ceil(value);
                }else {
                    value = Math.floor(value);
                }
                doubleArray[counter++] = value;
            }else {
                stringBuilder.append(mainDiag[i].substring(1, 4));
                stringBuilder.append(",");
            }
        }
        System.out.println(stringBuilder.toString());
        for (Double element : doubleArray){
            System.out.println(element);
        }
    }
}

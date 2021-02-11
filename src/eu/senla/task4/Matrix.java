package eu.senla.task4;

public class Matrix {
    private static String [][] matrix;
    public Matrix(int matrixSize, int elementSize, int fillingCounter){
        matrix = new String[matrixSize][matrixSize];
        int counter = 0;
        for (int i = 0; i < matrixSize; i++){
            for (int j = 0; j < matrixSize; j++){
                if(counter%fillingCounter == 0){
                    matrix[i][j] = Double.toString(Math.random()).substring(0, elementSize);
                }else {
                    matrix[i][j] = StringUtil.getRandomString(elementSize);
                }
                counter++;
            }
        }
    }

    public String[] getMainDiag(){
        String[] result = new String[matrix.length];
        for (int i = 0; i < matrix.length; i++){
                    result[i] = matrix[i][i];
        }
        return result;
    }

    public String[] getMainNotDiag(){
        String[] result = new String[matrix.length];
        for (int i = 0; i < matrix.length; i++){
            result[i] = matrix[i][matrix.length - i -1];
        }
        return result;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < matrix.length; i++){
            for (int j = 0; j < matrix[i].length; j++){
                builder.append(matrix[i][j]+ " ");
                }
            builder.append("\r\n");
            }
        return builder.toString();
    }
}

package task4;

public class DisplayedMatrix {

    public static void printMatrix(int [][] matrix){
        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[0].length; j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static int[][] generateRandomMatrix(int max){
        int[][] randomNumbers = new int[max][max];
        System.out.println();
        for(int i = 0; i < max; i++){
            for(int j = 0; j < max; j++){
                randomNumbers[i][j] = (int)(Math.random() * 100);
            }
        }
        return randomNumbers;
    }

    public static void printRotatedMatrix(int limit){
        int[][] matrix = generateRandomMatrix(limit);
        System.out.println("Matrix before rotation: ");
        DisplayedMatrix.printMatrix( matrix);
        System.out.println("Matrix after rotation: ");
        DisplayedMatrix.printMatrix( MatrixRotation.rotateByNinetyToLeft(matrix));
    }
}

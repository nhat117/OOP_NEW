package WK10;

import java.time.Duration;
import java.time.Instant;

public class Ex4 {
    public static void main(String[] args) {
        int matrixLength = 5000;

        double[][] a = initializeMatrix(matrixLength, matrixLength);
        double[][] b = initializeMatrix(matrixLength, matrixLength);

        //printMatrix(a, "Matrix a");

        Instant start = Instant.now();
        double[][] finalMatrix = addMatrix(a, b);
        Instant end = Instant.now();

        //printMatrix(finalMatrix, "Final Matrix");
        System.out.println("\nDuration is " + Duration.between(start, end).toMillis());
    }

    public static double [][] initializeMatrix(int row, int cols) {
        double[][] matrix = new double[row][cols];
        for(int i = 1; i < row; i ++) {
            for (int j = 0; j <cols; j ++) {
                matrix[i][j] = i + j;
            }
        }
        return matrix;
    }

    public static void printMatrix(double[][] matrix, String text) {
        System.out.println("\n" + text);

        for (int i = 0; i < 10 * matrix.length -3 ; i ++) {
            System.out.print("-");
        }
        System.out.println("");

        //Display matrux
        if(matrix != null) {
            for (int i = 0; i < matrix.length; i ++) {
                for (int j = 0; j <matrix[0].length; j ++) {
                    System.out.printf("%07.2f     ", matrix[i][j]);
                }
                System.out.println("");
            }
        }
    }

    public static double[][] addMatrix(double[][] a, double[][] b) {
        int matrixLength = a.length;
        double [][] finalMatrix = new double[matrixLength][matrixLength];

        int numOfThreads = Math.min(Runtime.getRuntime().availableProcessors(),
	matrixLength);

        int blockLength = matrixLength / numOfThreads;

        System.out.println("Block Length: " + blockLength);

        int blockStart = 0;
        int blockEnd = blockLength;

        for (int i = 0; i < numOfThreads; i ++) {
            new Thread().start();

            blockStart += blockLength;
            blockEnd += blockLength;
        }
        return finalMatrix;
    }

    class addMatrix implements Runnable {
        private double[][] a;
        private double[][] b;
        private double[][] finalMatrix;

        private int blockStart;
        private int blockEnd;

        public addMatrix(double[][] a, double[][] b, double[][] finalMatrix, int blockStart, int blockEnd) {
            this.a = a;
            this.b = b;
            this.finalMatrix = finalMatrix;
            this.blockStart = blockStart;
            this.blockEnd = blockEnd;
        }

        @Override
        public void run() {
            for (int i = blockStart; i < blockEnd; ++i)
                for (int j = 0; j < a[i].length; ++j)
                    finalMatrix[i][j] = a[i][j] + b[i][j];
        }
    }

}

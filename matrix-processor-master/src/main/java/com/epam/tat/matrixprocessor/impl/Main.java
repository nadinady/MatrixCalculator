package com.epam.tat.matrixprocessor.impl;

public class Main {
    public static void main(String[] args) {
        double [][] firstMatrix = {{1 , 2}, {3,4}};
        double [][] secondMatrix = {{5},{6}};
        double [][] transponMatrix;
        MatrixProcessor matrix = new MatrixProcessor();
        transponMatrix = matrix.multiplyMatrices(firstMatrix, secondMatrix);
        for (int i =0; i<transponMatrix.length; i++) {
            System.out.println(" ");
            for (int j = 0; j < transponMatrix[i].length; j++) {
                System.out.print(transponMatrix[i][j] + " ");
            }
        }

    }

}

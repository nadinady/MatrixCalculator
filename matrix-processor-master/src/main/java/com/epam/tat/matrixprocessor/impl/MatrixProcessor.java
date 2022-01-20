package com.epam.tat.matrixprocessor.impl;

import com.epam.tat.matrixprocessor.IMatrixProcessor;

/**
 * Function Description:
 * Complete the functions below. All methods must work with matrices of the double type.
 *
 * Constraints:
 * 0 < m < 10
 * 0 < n < 10
 * where m - number of rows in matrix
 * where n - number of columns in matrix
 *
 * In case of incorrect input values or inability to perform a calculation, the method should throw an appropriate
 * exception.
 *
 */
public class MatrixProcessor implements IMatrixProcessor {

	/**
	 * Matrix transpose is an operation on a matrix where its rows become columns with the same numbers.
	 * Ex.:
	 * |1 2|			|1 3 5|
	 * |3 4|   ====>	|2 4 6|
	 * |5 6|
	 *
	 * @param matrix - matrix for transposition
	 * @return the transposed matrix
	 */

	public double[][] transpose(double[][] matrix) {
		double [] [] transponMatrix = new double [matrix[0].length][matrix.length];
		for (int i=0; i < matrix.length; i++)
			for (int j=0; j < matrix[i].length; j++) {
				transponMatrix [j][i] = matrix [i][j];
			}
		return transponMatrix;
	}

	/**
	 * The method flips the matrix clockwise.
	 * Ex.:
	 * * |1 2|			|5 3 1|
	 * * |3 4|   ====>	|6 4 2|
	 * * |5 6|
	 *
	 * @param matrix - rotation matrix
	 * @return rotated matrix
	 */
	@Override
	public double[][] turnClockwise(double[][] matrix) {
		double [][] turnClockMatrix = new double[matrix[0].length][matrix.length];
		for (int i=0; i<matrix.length; i++)
			for (int j= 0; j < matrix[0].length; j++) {
				turnClockMatrix[j][matrix.length-i-1] = matrix [i][j];
			}
		return turnClockMatrix;
	}

	/**
	 * This method multiplies matrix firstMatrix by matrix secondMatrix
	 *
	 * See {https://en.wikipedia.org/wiki/Matrix_multiplication}
	 *
	 * @param firstMatrix  - first matrix to multiply
	 * @param secondMatrix - second matrix to multiply
	 * @return result matrix
	 */
	@Override
	public double[][] multiplyMatrices(double[][] firstMatrix, double[][] secondMatrix) {
		double [][] multiplyMatrix = new double[firstMatrix.length][secondMatrix[0].length];
		for (int i = 0; i < firstMatrix.length; i++)
			for (int j = 0; j < secondMatrix[0].length; j++)
				for (int k = 0;k < secondMatrix.length; k++) {
					multiplyMatrix[i][j] += firstMatrix[i][k]*secondMatrix[k][j];
				}
		return multiplyMatrix;
	}

	/**
	 * This method returns the inverse of the matrix
	 *
	 * See {https://en.wikipedia.org/wiki/Invertible_matrix}
	 *
	 * @param matrix - input matrix
	 * @return inverse matrix for input matrix
	 */
	@Override
	public double[][] getInverseMatrix(double[][] matrix) {
		throw new UnsupportedOperationException("You need to implement this method");
	}

	/**
	 * This method returns the determinant of the matrix
	 *
	 * See {https://en.wikipedia.org/wiki/Determinant}
	 *
	 * @param matrix - input matrix
	 * @return determinant of input matrix
	 */
	@Override
	public double getMatrixDeterminant(double[][] matrix) {
		throw new UnsupportedOperationException("You need to implement this method");
	}
}

package com.xisvaldo.hackerrank.easy;

/**
 * @author leonardo.borges
 */
public class DiagonalDifference {

  public static void main(String[] args) {

    int[][] arr = { {11, 2, 4}, {4, 5, 6}, {10, 8, -12} };

    System.out.println(diagonalDifference(arr));
  }

  static int diagonalDifference(int[][] arr) {
    int firstDiagonal = 0;
    int secondDiagonal = 0;

    for (int row = 0; row < arr.length; row++) {
      firstDiagonal += arr[row][row];
    }

    for (int row = arr.length - 1; row >= 0; row--) {
      secondDiagonal += arr[row][arr.length - row - 1];
    }

    return Math.abs(firstDiagonal - secondDiagonal);
  }

}

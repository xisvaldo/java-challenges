package com.xisvaldo.hackerrank.medium;

import java.util.Arrays;

/** @author leonardo.borges */
public class FormingMagicSquare {

  public static void main(String[] args) {

    // Always the middle of the square HAS to be 5 (in a 3x3 magic square)
    int[][] s = {{4, 9, 2}, {3, 5, 7}, {8, 1, 5}};
    System.out.println(formingMagicSquare(s));
  }

  static int formingMagicSquare(int[][] s) {
    int[] cost = { 0, 0, 0, 0, 0, 0, 0, 0};
    int[][] combinations = {
            {4,9,2,3,5,7,8,1,6},
            {4,3,8,9,5,1,2,7,6},
            {2,9,4,7,5,3,6,1,8},
            {2,7,6,9,5,1,4,3,8},
            {8,1,6,3,5,7,4,9,2},
            {8,3,4,1,5,9,6,7,2},
            {6,7,2,1,5,9,8,3,4},
            {6,1,8,7,5,3,2,9,4},
        };

    for(int i = 0; i < 8; i++) {
      cost[i] = Math.abs(combinations[i][0] - s[0][0]) + Math.abs(combinations[i][1] - s[0][1])
          + Math.abs(combinations[i][2]-s[0][2]);
      cost[i] = cost[i] + Math.abs(combinations[i][3] - s[1][0]) + Math.abs(combinations[i][4] - s[1][1])
          + Math.abs(combinations[i][5] - s[1][2]);
      cost[i] = cost[i] + Math.abs(combinations[i][6] - s[2][0]) + Math.abs(combinations[i][7] - s[2][1])
          + Math.abs(combinations[i][8]-s[2][2]);
    }

    Arrays.sort(cost);
    return cost[0];
  }
}

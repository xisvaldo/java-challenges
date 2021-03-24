package com.xisvaldo.codility.easy;

import java.util.Arrays;

/**
 * @author leonardo.borges
 */
public class CyclicArrayRotation {

  public static void main(String[] args) {
    System.out.println(Arrays.toString(solution(new int[]{3, 8, 9, 7, 6}, 3)));
    System.out.println(Arrays.toString(solution(new int[]{1, 2, 3, 4}, 4)));
    System.out.println(Arrays.toString(solution(new int[]{-4}, 0)));
  }

  public static int[] solution(int[] A, int K) {
    if (K == 0) return A;

    int[] shiftedArray = new int[A.length];

    for (int rotations = 0; rotations < K; rotations++) {
      for (int x = 0; x < A.length; x++) {
        if (x == 0) {
          shiftedArray[x] = A[A.length - 1];
          continue;
        }
        shiftedArray[x] = A[x - 1];
      }
      A = Arrays.copyOf(shiftedArray, shiftedArray.length);
    }

    return shiftedArray;
  }

}

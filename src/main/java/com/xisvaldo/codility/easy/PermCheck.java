package com.xisvaldo.codility.easy;

import java.util.Arrays;

/**
 * @author leonardo.borges
 */
public class PermCheck {

  public static void main(String[] args) {
    System.out.println(solution(new int[] {4, 1, 3, 2})); // 1
    System.out.println(solution(new int[] {4, 1, 3})); // 0
    System.out.println(solution(new int[] {1, 1})); // 0
  }

  public static int solution(int[] A) {
    int result = 1;
    Arrays.sort(A);

    for (int i = 0; i < A.length; i++) {
      if (A[i] != i + 1) {
        result = 0;
        break;
      }
    }
    return result;
  }
}

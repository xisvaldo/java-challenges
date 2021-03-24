package com.xisvaldo.codility.easy;

/**
 * @author leonardo.borges
 */
public class MissingInteger {

  public static void main(String[] args) {
    System.out.println(solution(new int[] { 1, 3, 6, 4, 1, 2 })); // 5
    System.out.println(solution(new int[] { 1, 2, 3 })); // 4
    System.out.println(solution(new int[] { -1, - 3})); // 1
  }

  public static int solution(int[] A) {
    boolean isPositive = false;

    for (int i = 0; i < A.length; i++) {
      if (A[i] > 0) {
        isPositive = true;
      }
    }

    return isPositive ? 0 : 1;
  }
}

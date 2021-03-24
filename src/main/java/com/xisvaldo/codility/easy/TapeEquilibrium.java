package com.xisvaldo.codility.easy;

/**
 * @author leonardo.borges
 */
public class TapeEquilibrium {

  public static void main(String[] args) {
    System.out.println(solution(new int[] {3, 1, 2, 3, 4}));
  }

  public static int solution(int[] A) {
    int sum = 0;
    int difference = Integer.MAX_VALUE;
    int previous = 0;
    int next = sum;

    for (int i = 0; i < A.length; i++) sum += A[i];

    for (int p = 1; p < A.length; p++) {
      previous += A[p -1];
      next = sum - previous;
      difference = Math.min(difference, Math.abs(previous - next));
    }

    return difference;
  }
}

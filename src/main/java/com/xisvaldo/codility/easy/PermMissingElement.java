package com.xisvaldo.codility.easy;

/**
 * @author leonardo.borges
 */
public class PermMissingElement {

  public static void main(String[] args) {
    System.out.println(solution(new int[] {2, 3, 1, 5}));
  }

  public static int solution(int[] A) {
    if (A.length == 0) return 1;

    int expectedSum = (A.length + 1) * (A.length + 2) / 2;
    int actualSum = 0;

    for (int element : A) actualSum += element;

    return (expectedSum - actualSum);
  }
}

package com.xisvaldo.codility.easy;

/**
 * @author leonardo.borges
 */
public class OddOccurrenceInArray {

  public static void main(String[] args) {
    System.out.println(solution(new int[] {9, 3, 9, 3, 9, 7, 9}));
  }

  public static int solution(int[] A) {
    int number = 0;

    for (int j : A) {
      number ^= j;
    }

    return number;
  }
}

package com.xisvaldo.codility.easy;

import java.util.HashSet;

/**
 * @author leonardo.borges
 */
public class FrogRiverOne {

  public static void main(String[] args) {
    System.out.println(solution(5, new int[] { 1, 3, 1, 4, 2, 3, 5, 4 })); //6
    System.out.println(solution(2, new int[] { 2, 2, 2, 2, 2 })); //-1
  }

  public static int solution(int X, int[] A) {
    HashSet<Integer> sequence = new HashSet<>();
    for (int i = 1; i <= X; i++) sequence.add(i);

    for (int j = 0; j < A.length; j++) {
      if (sequence.contains(A[j])) {
        sequence.remove(A[j]);
      }
      if (sequence.isEmpty()) return j;
    }

    return -1;
  }
}

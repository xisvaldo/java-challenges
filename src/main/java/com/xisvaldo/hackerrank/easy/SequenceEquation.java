package com.xisvaldo.hackerrank.easy;

/**
 * @author leonardo.borges
 */
public class SequenceEquation {

  public static void main(String[] args) {

    int[] p = { 4, 3, 5, 1, 2 };
    //int[] p = { 2, 3, 1 };

    int[] result = permutationEquation(p);

    for (int number : result) {
      System.out.println(number);
    }
  }

  static int[] permutationEquation(int[] p) {

    int[] result = new int[p.length];

    for (int i : p) {
      result[p[p[i - 1] - 1] - 1] = i;
    }

    return result;
  }
}

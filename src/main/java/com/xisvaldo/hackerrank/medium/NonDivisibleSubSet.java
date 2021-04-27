package com.xisvaldo.hackerrank.medium;

import java.util.Arrays;

/**
 * @author leonardo.borges
 */
public class NonDivisibleSubSet {

  public static void main(String[] args) {
    /*int[] S = { 1, 7, 2, 4 };
    int k = 4;*/
    int[] S = { 19, 10, 12, 10, 24, 25, 22 };
    int k = 4;

    System.out.println(nonDivisibleSubset(k, S));
  }

  static int nonDivisibleSubset(int k, int[] s) {

    int maximumSubset = 0;
    int[] remainders = new int[k];

    Arrays.fill(remainders, 0);

    for (int number : s) {
      remainders[number % k]++;
    }

    if (k % 2 == 0) {
      remainders[k / 2] = Math.min(remainders[k / 2], 1);
    }
    maximumSubset = Math.min(remainders[0], 1);

    for (int i = 1; i <= (k / 2); i++) {
      maximumSubset += Math.max(remainders[i], remainders[k - i]);
    }

    return maximumSubset;
  }
}

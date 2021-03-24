package com.xisvaldo.hackerrank.easy;

import java.util.Arrays;

/**
 * @author leonardo.borges
 */
public class SimpleArraySum {

  public static void main(String[] args) {
    int[] ar = { 1, 2, 3, 4, 10, 11 };
    System.out.println(simpleArraySum(ar));
  }

  static int simpleArraySum(int[] ar) {
    return Arrays.stream(ar).sum();
  }
}

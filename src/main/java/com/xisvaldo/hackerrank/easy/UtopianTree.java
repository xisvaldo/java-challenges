package com.xisvaldo.hackerrank.easy;

/**
 * @author leonardo.borges
 */
public class UtopianTree {

  public static void main(String[] args) {

    int n = 5;

    System.out.println(utopianTree(n));
  }

  static int utopianTree(int n) {

    int result = 0;

    for (int i = 0; i <= n; i++) {
      if (i % 2 == 0) {
        result++;
      }
      else if (i % 2 > 0) {
        result *= 2;
      }
    }

    return result;
  }
}

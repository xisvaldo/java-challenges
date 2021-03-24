package com.xisvaldo.hackerrank.easy;

import java.util.Arrays;

/**
 * @author leonardo.borges
 */
public class SockMerchant {

  public static void main(String[] args) {

    int n = 9;
    int[] ar = { 10, 20, 20, 10, 10, 30, 50, 10, 20 };

    System.out.println(sockMerchant(n, ar));
  }

  static int sockMerchant(int n, int[] ar) {

    Arrays.sort(ar);

    int result = 0;
    int i = 0;

    while (i < ar.length) {
      int num = ar[i];
      int count = 1;
      i++;

      while (i < ar.length && ar[i] == num) {
        count++;
        i++;
      }

      if (count % 2 == 0 || (count > 2 && count % 2 == 1))
        result += count / 2;
    }

    return result;
  }
}

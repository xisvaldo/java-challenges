package com.xisvaldo.hackerrank.easy;

/**
 * @author leonardo.borges
 */
public class FindDigits {

  public static void main(String[] args) {

    int n = 1012;

    System.out.println(findDigits(n));
  }

  static int findDigits(int n) {

    int count = 0;

    char[] numbers = String.valueOf(n).toCharArray();

    for (char number : numbers) {
      if (Integer.valueOf(String.valueOf(number)) == 0) continue;
      if (n % Integer.valueOf(String.valueOf(number)) == 0) count++;
    }

    return count;
  }
}

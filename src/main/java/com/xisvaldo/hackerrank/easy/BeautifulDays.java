package com.xisvaldo.hackerrank.easy;

/**
 * @author leonardo.borges
 */
public class BeautifulDays {

  public static void main(String[] args) {

    int i = 20;
    int j = 23;
    int k = 6;

    System.out.println(beautifulDays(i, j, k));
  }

  static int beautifulDays(int i, int j, int k) {

    int beautifulDays = 0;

    for (; i <= j; i++) {
       String reversedNumber = new StringBuilder(String.valueOf(i)).reverse().toString();
       if (Math.abs(i - Integer.valueOf(reversedNumber)) % k  == 0)
         beautifulDays++;
    }

    return beautifulDays;
  }

}

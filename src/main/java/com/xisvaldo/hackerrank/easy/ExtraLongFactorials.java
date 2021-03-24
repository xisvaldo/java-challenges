package com.xisvaldo.hackerrank.easy;

import java.math.BigInteger;

/**
 * @author leonardo.borges
 */
public class ExtraLongFactorials {

  public static void main(String[] args) {
    extraLongFactorials(25);
  }

  static void extraLongFactorials(int n) {

    BigInteger result = new BigInteger(String.valueOf(n));

    for (int i = n - 1; i > 1; i--) {
      result = result.multiply(new BigInteger(String.valueOf(i)));
    }

    System.out.println(result.toString());
  }
}

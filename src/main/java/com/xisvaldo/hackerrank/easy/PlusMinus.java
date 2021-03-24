package com.xisvaldo.hackerrank.easy;

import java.text.DecimalFormat;
import java.util.Arrays;

/**
 * @author leonardo.borges
 */
public class PlusMinus {

  public static void main(String[] args) {

    plusMinus(new int[] { -4, 3, -9, 0, 4, 1 });
  }

  static void plusMinus(int[] arr) {
    DecimalFormat decimalFormat = new DecimalFormat("#.######");

    double positiveRatio = (double) Arrays.stream(arr).filter(i -> i > 0).count() / arr.length;
    double negativeRatio = (double) Arrays.stream(arr).filter(i -> i < 0).count() / arr.length;
    double zeroRatio = (double) Arrays.stream(arr).filter(i -> i == 0).count() / arr.length;

    System.out.println(decimalFormat.format(positiveRatio));
    System.out.println(decimalFormat.format(negativeRatio));
    System.out.println(decimalFormat.format(zeroRatio));
  }
}

package com.xisvaldo.hackerrank.easy;

/**
 * @author leonardo.borges
 */
public class MiniMaxSum {

  public static void main(String[] args) {
    miniMaxSum(new int[] { 1, 2, 3, 4, 5 });
  }

  static void miniMaxSum(int[] arr) {

    long min = Long.MAX_VALUE;
    long max = 0;
    long sum = 0;

    for (int i = 0; i < arr.length; i++) {

      if(max < arr[i]) max = arr[i];
      if(min > arr[i]) min = arr[i];

      sum += arr[i];
    }

    long sumMin = sum - max;
    long sumMax = sum - min;

    System.out.println(sumMin + " " + sumMax);
  }

}

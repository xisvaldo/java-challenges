package com.xisvaldo.hackerrank.easy;

import java.util.Arrays;

/**
 * @author leonardo.borges
 */
public class TheHurdleRace {

  public static void main(String[] args) {

    int k = 4;
    int[] height = { 1, 6, 3, 5, 2 };
    //int k = 7;
    //int[] height = { 2, 5, 4, 5, 2 };

    System.out.println(hurdleRace(k, height));
  }

  static int hurdleRace(int k, int[] height) {

    int doses = Arrays.stream(height).max().getAsInt() - k;

    return doses > 0 ? doses : 0;
  }
}

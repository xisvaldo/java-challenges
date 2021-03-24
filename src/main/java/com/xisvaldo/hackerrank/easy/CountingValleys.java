package com.xisvaldo.hackerrank.easy;

import java.util.Arrays;

/**
 * @author leonardo.borges
 */
public class CountingValleys {

  public static void main(String[] args) {

    int n = 12;
    String s = "DDUUDDUDUUUD";

    System.out.println(countingValleys(n, s));
  }

  static int countingValleys(int n, String s) {

    int valleys = 0;
    int currentLevel = 0;

    for (char step : s.toCharArray()) {
      if (step == 'D') currentLevel--;
      if (step == 'U') currentLevel++;

      if (currentLevel == 0 && step == 'U') valleys++;
    }

    return valleys;
  }
}

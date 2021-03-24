package com.xisvaldo.hackerrank.easy;

import java.util.Arrays;

/**
 * @author leonardo.borges
 */
public class BreakingRecords {

  public static void main(String[] args) {
    int[] scores = breakingRecords(new int[] {10, 5, 20, 20, 4, 5, 2, 25, 1});
    Arrays.stream(scores).forEach(System.out::println);

    scores = breakingRecords(new int[] {3, 4, 21, 36, 10, 28, 35, 5, 24, 42});
    Arrays.stream(scores).forEach(System.out::println);
  }

  static int[] breakingRecords(int[] scores) {
    int min = scores[0];
    int max = scores[0];
    int minCount = 0;
    int maxCount = 0;

    for (int score : scores) {
      if (score < min) {
        min = score;
        minCount++;
      }
      else if (score > max) {
        max = score;
        maxCount++;
      }
    }

    return new int[] { maxCount, minCount };
  }
}

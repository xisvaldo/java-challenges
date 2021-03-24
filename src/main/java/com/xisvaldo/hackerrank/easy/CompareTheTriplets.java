package com.xisvaldo.hackerrank.easy;

import java.util.Arrays;
import java.util.List;

/**
 * @author leonardo.borges
 */
public class CompareTheTriplets {

  public static void main(String[] args) {

    List<Integer> a = Arrays.asList(5, 6, 7);
    List<Integer> b = Arrays.asList(3, 6, 10);

    System.out.println(compareTriplets(a, b));
  }

  static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {
    int aliceScore = 0;
    int bobScore = 0;

    for (int i = 0; i < 3; i++) {
      if (a.get(i) > b.get(i)) aliceScore++;
      if (a.get(i) < b.get(i)) bobScore++;
    }

    return Arrays.asList(aliceScore, bobScore);
  }

}

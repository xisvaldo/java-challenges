package com.xisvaldo.hackerrank.easy;

import java.util.Arrays;
import java.util.List;

/**
 * @author leonardo.borges
 */
public class BetweenTwoSets {

  public static void main(String[] args) {
    System.out.println(getTotalX(Arrays.asList(2, 4), Arrays.asList(16, 32, 96)));
  }

  private static int getTotalX(List<Integer> a, List<Integer> b) {
    int lcm = findLCM(a);
    int gcd = findGCD(b);
    int count = 0;

    for (int i = lcm, j = 2; i <= gcd; i = lcm * j, j++) {
      if (gcd % i == 0) {
        count++;
      }
    }

    return count;
  }

  private static int findLCM(List<Integer> a) {
    int result = a.get(0);

    for (int i = 1; i < a.size(); i++) {
      result = findLCM(result, a.get(i));
    }
    return result;
  }

  private static int findLCM(int a, int b) {
    return a * (b / findGCD(a, b));
  }

  private static int findGCD(int a, int b) {
    while (b > 0) {
      int temp = b;
      b = a % b;
      a = temp;
    }
    return a;
  }

  private static int findGCD(List<Integer> a) {
    int result = a.get(0);

    for (int i =1; i < a.size(); i++) {
      result = findGCD(result, a.get(i));
    }
    return result;
  }
}

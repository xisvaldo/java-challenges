package com.xisvaldo.hackerrank.easy;

/**
 * @author leonardo.borges
 */
public class AppleAndOranges {

  public static void main(String[] args) {
    countApplesAndOranges(7, 10, 4, 12, new int[] {2, 3, -4}, new int[] {3, -2, -4});
  }

  static void countApplesAndOranges(int s, int t, int a, int b, int[] apples, int[] oranges) {
    int appleCount = 0;
    int orangeCount = 0;

      for (int apple : apples) {
        if (a + apple >= s && a + apple <= t) {
          appleCount++;
        }
      }

      for (int orange : oranges) {
        if (b + orange >= s && b + orange <= t) {
          orangeCount++;
        }
      }

      System.out.println(appleCount);
      System.out.println(orangeCount);
  }
}

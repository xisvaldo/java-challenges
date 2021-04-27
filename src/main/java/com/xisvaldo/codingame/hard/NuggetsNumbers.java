package com.xisvaldo.codingame.hard;

/**
 * @author leonardo.borges
 */
public class NuggetsNumbers {

  public static void main(String[] args) {
    solution(new int[] {2, 5}); //3
    solution(new int[] {17, 97}); //1535
    solution(new int[] {84, 21}); //-1
    solution(new int[] {6, 9, 20}); //43
  }

  private static void solution(int[] values) {
    final int MAX_SIZE = 10000;
    boolean[] found = new boolean[MAX_SIZE];

    if (!isCalculable(values))
      System.out.println("-1");

    else {
      int higher = 0;
      found[0] = true;
      for (int i = 0; i < MAX_SIZE; i++) {
        if (!found[i]) higher = i;
        else {
          for (int value : values) {
            if (i + value < MAX_SIZE) {
              found[i + value] = true;
            }
          }
        }
      }
      System.out.println(higher);
    }
  }

  private static boolean isCalculable(int[] values) {
    for (int i = 0; i < values.length; i++) {
      for (int j = i + 1; j < values.length; j++) {
        if (greatestCommonDivisor(values[i], values[j]) == 1) {
          return true;
        }
      }
    }
    return false;
  }

  private static int greatestCommonDivisor(int x, int y) {
    return y == 0 ? x : greatestCommonDivisor(y, x % y);
  }
}

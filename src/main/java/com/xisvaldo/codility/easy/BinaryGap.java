package com.xisvaldo.codility.easy;

import java.util.Arrays;

/**
 * @author leonardo.borges
 */
public class BinaryGap {

  public static void main(String[] args) {
    System.out.println(solution(32)); // 0
    System.out.println(solution(1041)); // 5
    System.out.println(solution(529)); // 4
    System.out.println(solution(561892)); // 3
  }

  public static int solution(int N) {
    if (N == 1) return 0;

    char[] binary = Integer.toBinaryString(N).toCharArray();
    int finalGap = 0;
    int tempGap = 0;

    for (int x = 0; x < binary.length; x++) {
      if (binary[x] == '0') {
        tempGap++;
        continue;
      }
      else if (binary[x] == '1') {
        if (tempGap > finalGap) {
          finalGap = tempGap;
        }
        tempGap = 0;
      }
    }

    return finalGap;
  }
}

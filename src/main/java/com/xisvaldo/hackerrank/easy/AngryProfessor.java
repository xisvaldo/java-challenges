package com.xisvaldo.hackerrank.easy;

import java.util.Arrays;

/**
 * @author leonardo.borges
 */
public class AngryProfessor {

  public static void main(String[] args) {
    //int k = 3;
    //int[] a = { -1, -3, 4, 2 };
    int k = 2;
    int[] a = { 0, -1, 2, 1 };

    System.out.println(angryProfessor(k, a));
  }

  static String angryProfessor(int k, int[] a) {
    return Arrays.stream(a).filter(i -> i <= 0).count() < k ? "YES" : "NO";
  }
}

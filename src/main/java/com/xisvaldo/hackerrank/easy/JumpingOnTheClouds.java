package com.xisvaldo.hackerrank.easy;

/**
 * @author leonardo.borges
 */
public class JumpingOnTheClouds {

  public static void main(String[] args) {

    int[] c = { 0, 0, 0, 0, 1, 0 };
    int k = 2;

    System.out.println(jumpingOnClouds(c, k));
    System.out.println(jumpingOnClouds(c));
  }

  static int jumpingOnClouds(int[] c, int k) {

    int e = 100;

    for (int i = 0; i < c.length;) {

      if (c[(i + k) % c.length] == 0) {
        e--;
      }
      else {
        e = e - 3;
      }
      i = i + k;
    }

    return e;
  }

  static int jumpingOnClouds(int[] c) {
    int count = -1;
    int n = c.length;

    for (int i = 0; i < n; i++, count++) {
      if (i < n-2 && c[i + 2] == 0) i++;
    }

    return count;
  }
}

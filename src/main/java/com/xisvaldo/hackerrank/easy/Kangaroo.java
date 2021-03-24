package com.xisvaldo.hackerrank.easy;

/**
 * @author leonardo.borges
 */
public class Kangaroo {

  public static void main(String[] args) {
    System.out.println(kangaroo(0,3,4,2));
    System.out.println(kangaroo(0,2,5,3));
  }

  static String kangaroo(int x1, int v1, int x2, int v2) {
    if (v1 <= v2)
      return "NO";

    return (x2 - x1) % (v2 - v1) == 0 ? "YES" : "NO";
  }
}

package com.xisvaldo.hackerrank.easy;

/**
 * @author leonardo.borges
 */
public class SherlockSquares {

  public static void main(String[] args) {

    int a = 1;
    int b = 1000000000;

    System.out.println(squares(a, b));
  }

  static int squares(int a, int b) {
    return (int) Math.floor(Math.sqrt(b)) - (int) Math.ceil(Math.sqrt(a)) + 1;
  }
}

package com.xisvaldo.hackerrank.easy;

/**
 * @author leonardo.borges
 */
public class DrawingBook {

  public static void main(String[] args) {

    int n = 6;
    int p = 2;

    System.out.println(pageCount(n, p));
  }

  static int pageCount(int n, int p) {

    int pagesFromStart = (p / 2);
    int pagesFromEnd = 0;

    if (n % 2 == 1)
      pagesFromEnd = (n - p) / 2;
    else
      pagesFromEnd = (int) Math.ceil((n - p) / 2.0);

    return Math.min(pagesFromStart, pagesFromEnd);
  }

}

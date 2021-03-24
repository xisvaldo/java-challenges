package com.xisvaldo.hackerrank.easy;

/**
 * @author leonardo.borges
 */
public class LibraryFine {

  public static void main(String[] args) {
    int d1 = 31;
    int d2 = 1;
    int m1 = 12;
    int m2 = 1;
    int y1 = 2015;
    int y2 = 2016;

    System.out.println(libraryFine(d1, m1, y1, d2, m2, y2));
  }

  static int libraryFine(int d1, int m1, int y1, int d2, int m2, int y2) {
    final int DAY_FINE = 15;
    final int MONTH_FINE = 500;
    final int YEAR_FINE = 10000;

    if(y1 > y2)
      return YEAR_FINE;
    if(y1 < y2)
      return 0;

    if(m1 < m2)
      return 0;
    if(m1 > m2)
      return (m1 - m2) * MONTH_FINE;

    if(d1 > d2)
      return (d1 - d2) * DAY_FINE;

    return 0;
  }

}

package com.xisvaldo.hackerrank.easy;

/**
 * @author leonardo.borges
 */
public class StairCase {

  public static void main(String[] args) {
    staircase(6);
  }

  static void staircase(int n) {
    StringBuilder stringBuilder = new StringBuilder();

    for (int i = 1; i <= n; i++) {
      String whiteSpaces = new String(new char[n - i]).replace("\0", " ");
      String stairs = new String(new char[i]).replace("\0", "#");
      stringBuilder.append(String.format("%s%s", whiteSpaces, stairs + "\n"));
    }

    System.out.println(stringBuilder.toString());
  }

}

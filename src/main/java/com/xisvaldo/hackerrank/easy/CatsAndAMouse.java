package com.xisvaldo.hackerrank.easy;

/**
 * @author leonardo.borges
 */
public class CatsAndAMouse {

  public static void main(String[] args) {
    int x = 1;
    int y = 2;
    int z = 3;

    System.out.println(catAndMouse(x, y, z));
  }

  static String catAndMouse(int x, int y, int z) {
    int distanceCatA = Math.abs(x - z);
    int distanceCatB = Math.abs(y - z);

    if (distanceCatA == distanceCatB)
      return "Mouse C";
    else if (distanceCatA > distanceCatB)
      return "Cat B";

    return "Cat A";
  }

}

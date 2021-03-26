package com.xisvaldo.codingame.easy;

/**
 * @author leonardo.borges
 */
public class Temperatures {

  public static void main(String args[]) {
    closestToZero(5, new String[] {"1", "-2", "-8", "4", "5"});
  }

  private static void closestToZero(int n, String[] temperatures) {
    int closest = 0;

    if (n > 0) {
      closest = Integer.parseInt(temperatures[0]);
      for (String temperature : temperatures) {
        int temp = Integer.parseInt(temperature);
        if (Math.abs(temp) < Math.abs(closest) || (Math.abs(temp) == Math.abs(closest) && closest < 0))
          closest = temp;
      }
    }

    System.out.println(closest);
  }
}
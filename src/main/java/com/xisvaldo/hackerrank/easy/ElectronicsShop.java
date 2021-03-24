package com.xisvaldo.hackerrank.easy;


/**
 * @author leonardo.borges
 */
public class ElectronicsShop {

  public static void main(String[] args) {

    int b = 60;
    int[] keyboards = {40, 50, 60};
    int[] drives = { 5, 8, 12 };

    System.out.println(getMoneySpent(keyboards, drives, b));
  }

  static int getMoneySpent(int[] keyboards, int[] drives, int b) {

    int higherTotal = -1;

    for (int keyboard : keyboards) {
      for (int drive : drives) {
        if (keyboard + drive <= b && keyboard + drive > higherTotal) {
          higherTotal = keyboard + drive;
        }
      }
    }

    return higherTotal;
  }
}

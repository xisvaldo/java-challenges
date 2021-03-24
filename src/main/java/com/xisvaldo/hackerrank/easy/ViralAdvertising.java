package com.xisvaldo.hackerrank.easy;

/**
 * @author leonardo.borges
 */
public class ViralAdvertising {

  public static void main(String[] args) {

    int n = 4;
    System.out.println(viralAdvertising(n));

  }

  static int viralAdvertising(int n) {

    int shared = 0;
    int liked = 0;
    int cumulative = 0;

    for (int i = 1; i <= n; i++) {

      if (i == 1) {
        shared = 5;
        cumulative = liked = shared / 2;
      }
      else {
        shared = (shared / 2) * 3;
        liked = shared / 2;
        cumulative += liked;
      }
    }

    return cumulative;
  }

}

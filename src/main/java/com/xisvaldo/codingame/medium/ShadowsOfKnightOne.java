package com.xisvaldo.codingame.medium;

import java.util.Scanner;

/**
 * @author leonardo.borges
 */
public class ShadowsOfKnightOne {

  public static void main(String args[]) {
    Scanner in = new Scanner(System.in);
    int W = in.nextInt(); // width of the building.
    int H = in.nextInt(); // height of the building.
    int N = in.nextInt(); // maximum number of turns before game over.
    int x = in.nextInt();
    int y = in.nextInt();

    int firstX = 0;
    int lastX = W - 1;
    int firstY = 0;
    int lastY = H - 1;

    // game loop
    while (true) {
      String bombDir = in.next(); // the direction of the bombs from batman's current location (U, UR, R, DR, D, DL, L or UL)

      if (bombDir.contains("D")) {
        firstY = y + 1;
      }
      if (bombDir.contains("U")) {
        lastY = y - 1;
      }
      if (bombDir.contains("R")) {
        firstX = x + 1;
      }
      else {
        lastX = x - 1;
      }

      x = firstX + (lastX - firstX) / 2;
      y = firstY + (lastY - firstY) / 2;
      System.out.println(x + " " + y);
    }
  }
}

package com.xisvaldo.codingame.easy;


/**
 * @author leonardo.borges
 */
public class PowerOfThor {

  static int x = 0, y = 0;

  public static void main(String[] args) {
    int maxMoves = 26;
    int powerX = 31, powerY = 4;
    x = 5;
    y = 4;

    for (int i = 1; i < maxMoves; i++) {
      findPower(powerX, powerY, x, y); //final output is E
    }

    maxMoves = 13;
    powerX = 31;
    powerY = 4;
    x = 31;
    y = 18;
    for (int i = 1; i < maxMoves; i++) {
      findPower(powerX, powerY, x, y); //final output is N
    }

    maxMoves = 31;
    powerX = 0;
    powerY = 17;
    x = 31;
    y = 4;
    for (int i = 1; i < maxMoves; i++) {
      findPower(powerX, powerY, x, y); //final output is W
    }
  }

  private static void findPower(int powerX, int powerY, int xThor, int yThor) {
    String direction = "";

    if (yThor < powerY)
    {
      y++;
      direction = "S";
    }
    else if (yThor > powerY)
    {
      y--;
      direction = "N";
    }

    if (xThor < powerX)
    {
      x++;
      direction += "E";
    }
    else if (xThor > powerX)
    {
      x--;
      direction += "W";
    }

    System.out.println(direction);
  }
}

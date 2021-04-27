package com.xisvaldo.hackerrank.medium;

import java.awt.Point;
import java.util.ArrayList;
import java.util.List;

/**
 * @author leonardo.borges
 */
public class QueensAttack {

  public static void main(String[] args) {
    int n = 5; //board n x n
    int k = 3; //obstacles
    int r_q = 4; //initial queen row
    int c_q = 3; //initial queen column
    int[][] obstacles = { { 5, 5}, { 4, 2 }, { 2, 3 } };

    System.out.println(queensAttack(n, k, r_q, c_q, obstacles));
  }

  static int queensAttack(int n, int k, int r_q, int c_q, int[][] obstacles) {

    List<Point> possibleMovements = new ArrayList<>();

    for (int row = n; row >= 1; --row) {
      for (int col = n; col >= 1; --col) {

        if (isValidPosition(row, col, r_q, c_q) || (row == r_q || col == c_q)) {
          possibleMovements.add(new Point(row, col));
        }
      }
    }
    possibleMovements.remove(possibleMovements.stream().filter(point -> point.getX() == r_q && point.getY() == c_q)
        .findFirst().get());

    possibleMovements = removeObstacles(possibleMovements, obstacles);

    return possibleMovements.size();
  }

  private static boolean isValidPosition(int row, int col, int rowQueen, int colQueen) {
    boolean validPosition = false;

    validPosition = validPosition || row == rowQueen;
    validPosition = validPosition || col == colQueen;
    validPosition = validPosition || Math.abs(rowQueen - row) == Math.abs(colQueen - col);
    validPosition = validPosition && row != rowQueen && col != colQueen;

    return validPosition;
  }

  private static List<Point> removeObstacles(List<Point> possibleMovements, int[][] obstacles) {

    List<Point> obstaclesPoints = new ArrayList<>();

    for (int i = 0; i < obstacles.length; i++) {
      for (int j = 0; j < obstacles[0].length; j++) {
        obstaclesPoints.add(new Point(i, j));
      }
    }

    possibleMovements.removeAll(obstaclesPoints);
    return possibleMovements;
  }
}

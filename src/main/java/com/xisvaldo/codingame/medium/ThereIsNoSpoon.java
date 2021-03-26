package com.xisvaldo.codingame.medium;

import java.util.ArrayList;

/**
 * @author leonardo.borges
 */
public class ThereIsNoSpoon {

  public static void main(String[] args) {
    int width = 2;
    int height = 2;
    String[] lines = new String[] { "00", "0." };
    System.out.println("--- TEST CASE 1 ---");
    findNeighbors(width, height, lines);

    width = 5;
    height = 1;
    lines = new String[] { "0.0.0" };
    System.out.println("--- TEST CASE 2 ---");
    findNeighbors(width, height, lines);
  }

  private static void findNeighbors(int width, int height, String[] lines) {
    ArrayList<Node> nodes = new ArrayList<>(width * height);

    Node[] lastVerticals = new Node[width];
    Node currentHorizontal;

    for (int y = 0; y < height; y++) {
      currentHorizontal = null;
      for (int x = 0; x < width; x++) {

        if (lines[y].charAt(x) == '0') {
          Node node = new Node(x, y);
          nodes.add(node);

          if (lastVerticals[x] != null)
            lastVerticals[x].setBottom(node);
          lastVerticals[x] = node;

          if (currentHorizontal != null)
            currentHorizontal.setRight(node);
          currentHorizontal = node;
        }
      }
    }

    for (Node node : nodes) {
      System.out.printf("%s %s %s%n", node.toString(), node.getRightCoordinates(), node.getBottomCoordinates());
    }
  }

  static class Node {
    private final int x;
    private final int y;
    private Node right;
    private Node bottom;

    public Node(int x, int y) {
      this.x = x;
      this.y = y;
    }

    public int getX() {
      return x;
    }

    public int getY() {
      return y;
    }

    public String toString() {
      return x + " " + y;
    }

    public void setRight(Node right) {
      this.right = right;
    }

    public void setBottom(Node bottom) {
      this.bottom = bottom;
    }

    public String getRightCoordinates() {
      if (this.right == null)
        return "-1 - 1";

      return String.format("%d %d", this.right.getX(), this.right.getY());
    }

    public String getBottomCoordinates() {
      if (this.bottom == null)
        return "-1 -1";

      return String.format( "%d %d", this.bottom.getX(), this.bottom.getY());
    }
  }
}

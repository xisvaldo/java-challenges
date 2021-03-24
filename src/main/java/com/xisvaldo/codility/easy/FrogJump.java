package com.xisvaldo.codility.easy;

/**
 * @author leonardo.borges
 */
public class FrogJump {

  public static void main(String[] args) {
    System.out.println(solution(10, 85, 30));
    System.out.println(solution(5, 16, 5));
    System.out.println(solution(0, 100, 1));
    System.out.println(solution(3, 999111321, 7));
    System.out.println(solution(1, 5, 2));
  }

  public static int solution(int X, int Y, int D) {
    return (Y - X) / D + ((Y - X) % D == 0 ? 0 : 1);
  }
}

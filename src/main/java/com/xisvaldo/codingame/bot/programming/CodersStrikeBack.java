package com.xisvaldo.codingame.bot.programming;

import java.util.Scanner;

/**
 * @author leonardo.borges
 */
public class CodersStrikeBack {

  public static void main(String args[]) {
    Scanner in = new Scanner(System.in);
    RacePod pod = new RacePod();

    // game loop
    while (true) {
      pod.x = in.nextInt();
      pod.y = in.nextInt();
      pod.nextCheckpointX = in.nextInt(); // x position of the next check point
      pod.nextCheckpointY = in.nextInt(); // y position of the next check point
      pod.nextCheckpointDist = in.nextInt(); // distance to the next checkpoint
      pod.nextCheckpointAngle = in.nextInt(); // angle between your pod orientation and the direction of the next checkpoint
      pod.opponentX = in.nextInt();
      pod.opponentY = in.nextInt();

      pod.move();
    }
  }
}

class RacePod {

  int x;
  int y;
  int nextCheckpointX;
  int nextCheckpointY;
  int nextCheckpointDist;
  int nextCheckpointAngle;
  int opponentX;
  int opponentY;
  String thrust;
  boolean boostUsed;

  public RacePod() {
    boostUsed = false;
  }

  public void move() {
    int angle = Math.abs(nextCheckpointAngle);
    final int radius = 7;

    if (angle > 90) thrust = "10";
    else if (angle == 50) thrust = "80";
    else {
      thrust = String.valueOf(100 - angle / radius);
    }

    if (!boostUsed && nextCheckpointDist > 3000  && nextCheckpointAngle == 0) {
      System.err.println("Boost used");
      thrust = "BOOST";
      boostUsed = true;
    }

    System.out.println(nextCheckpointX + " " + nextCheckpointY + " " + thrust);
  }
}

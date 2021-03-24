package com.xisvaldo.hackerrank.easy;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

/**
 * @author leonardo.borges
 */
public class TimeConversion {

  public static void main(String[] args) {

    System.out.println(timeConversion("07:05:45PM"));
  }

  static String timeConversion(String s) {
    LocalTime time = LocalTime.parse(s, DateTimeFormatter.ofPattern("hh:mm:ssa"));

    if (time.getSecond() == 0)
      return time.toString() + ":00";
    else
      return time.toString();
  }
}

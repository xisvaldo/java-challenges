package com.xisvaldo.hackerrank.easy;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 * @author leonardo.borges
 */
public class DayOfTheProgrammer {

  public static void main(String[] args) {
    System.out.println(dayOfProgrammer(2016));
    System.out.println(dayOfProgrammer(2017));
    System.out.println(dayOfProgrammer(1800));
  }

  private static String dayOfProgrammer(int year) {
    return LocalDate.ofYearDay(year, year <= 1918 && year % 4 == 0 ? 255 : 256)
        .format(DateTimeFormatter.ofPattern("dd.MM.yyyy"));
  }
}

package com.xisvaldo.hackerrank.easy;

import java.util.Arrays;
import java.util.List;

/**
 * @author leonardo.borges
 */
public class GradingStudents {

  public static void main(String[] args) {
    gradingStudents(Arrays.asList(73, 67, 38, 33)).forEach(System.out::println);
  }

  private static List<Integer> gradingStudents(List<Integer> grades) {
    for (int i = 0; i < grades.size(); i++) {
      if (grades.get(i) >= 38 && grades.get(i) % 5 >= 3) {
          grades.set(i, grades.get(i) + (5 - grades.get(i) % 5));
      }
    }

    return grades;
  }
}

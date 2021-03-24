package com.xisvaldo.hackerrank.easy;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * @author leonardo.borges
 */
public class BirthdayChocolate {

  public static void main(String[] args) {
    System.out.println(birthday(Arrays.asList(1, 2, 1, 3, 2), 3, 2));
    System.out.println(birthday(Arrays.asList(1, 1, 1, 1, 1, 1), 3, 2));
    System.out.println(birthday(Collections.singletonList(4), 4, 1 ));
  }

  static int birthday(List<Integer> s, int d, int m) {
    int sum = 0;
    int count = 0;

    for (int i = 0; i < s.size(); i++) {
      sum += s.get(i);

      if (i > m - 1) sum -= s.get(i - m);
      if (i >= m -1 && sum == d) count++;
    }

    return count;
  }
}

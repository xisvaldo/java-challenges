package com.xisvaldo.hackerrank.easy;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author leonardo.borges
 */
public class BirthdayCakeCandles {

  public static void main(String[] args) {

    System.out.println(birthdayCakeCandles(new int[] { 3, 2, 1, 3 }));
  }

  static int birthdayCakeCandles(int[] ar) {

    List<Integer> elements = Arrays.stream(ar).boxed().collect(Collectors.toList());
    final long greaterNumber = Collections.max(elements);

    return (int) elements.stream().filter(i -> i == greaterNumber).count();
  }

}

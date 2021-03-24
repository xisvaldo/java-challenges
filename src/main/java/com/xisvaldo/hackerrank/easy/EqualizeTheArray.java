package com.xisvaldo.hackerrank.easy;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * @author leonardo.borges
 */
public class EqualizeTheArray {

  public static void main(String[] args) {
    int[] arr = { 3, 3, 2, 1, 3 };
    //int[] arr = { 1, 2, 2, 3 };
    System.out.println(equalizeArray(arr));
  }

  static int equalizeArray(int[] arr) {

    Map<Integer, Long> countingNumbers = Arrays.stream(arr).boxed().collect(Collectors.groupingBy(Function.identity(),
        Collectors.counting()));

    int mostCountedNumber = countingNumbers.entrySet().stream().max(Map.Entry.comparingByValue()).get().getKey();

    return countingNumbers.entrySet().stream().filter(entry -> entry.getKey() != mostCountedNumber)
        .mapToInt(entry -> entry.getValue().intValue()).sum();
  }

}

package com.xisvaldo.hackerrank.easy;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map.Entry;
import java.util.stream.Collectors;

/**
 * @author leonardo.borges
 */
public class MigratoryBirds {

  public static void main(String[] args) {
    System.out.println(migratoryBirds(Arrays.asList(1, 4, 4, 4, 5, 3)));
    System.out.println(migratoryBirds(Arrays.asList(1, 2, 3, 4, 5, 4, 3, 2, 1, 3, 4)));
  }

  static int migratoryBirds(List<Integer> arr) {
    return arr.stream()
        .collect(
            Collectors.groupingBy(Integer::intValue)).entrySet().stream()
        .filter(keyValue -> keyValue.getValue().size() > 1)
        .max(Comparator.comparing(keyValue -> keyValue.getValue().size()))
        .map(Entry::getKey)
        .orElse(0);
  }
}

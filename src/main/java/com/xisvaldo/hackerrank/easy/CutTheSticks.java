package com.xisvaldo.hackerrank.easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author leonardo.borges
 */
public class CutTheSticks {

  public static void main(String[] args) {

    //int[] arr = { 5, 4, 4, 2, 2, 8 };
    int[] arr = { 1, 2, 3, 4, 3, 3, 2, 1 };

    int[] result = cutTheSticks(arr);

    for (int n : result) {
      System.out.println(n);
    }
  }

  static int[] cutTheSticks(int[] arr) {
    int zeroElements = 0;
    List<Integer> result = new ArrayList<>();

    while (zeroElements < arr.length) {

      int counter = 0;
      int min = Arrays.stream(arr).filter(i -> i > 0).min().getAsInt();

      for (int i = 0; i < arr.length; i++) {

        if (arr[i] == 0) continue;
        arr[i] = arr[i] - min;
        counter++;

        if (arr[i] == 0) {
          zeroElements++;
        }
      }
      result.add(counter);
    }

    return result.stream().mapToInt(Integer::intValue).toArray();
  }
}

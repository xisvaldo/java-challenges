package com.xisvaldo.hackerrank.easy;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
/**
 * @author leonardo.borges
 */
public class PickingNumbers {

  public static void main(String[] args) {
    //List<Integer> a = Arrays.asList(4, 6, 5, 3, 3, 1);

    List<Integer> a = Arrays.asList(1, 2, 2, 3, 1, 2);
    System.out.println(pickingNumbers(a));
  }

  //horrible solution :(
  public static int pickingNumbers(List<Integer> a) {
    a.sort(Comparator.naturalOrder());

    int maxDiffCount = 0;

    for (int i = 0; i < a.size(); i++) {
      for (int j = i + 1; j < a.size(); j++) {
        int diff = Math.abs(a.get(i) - a.get(j));

        if (diff > 1) break;

        int diffCount = j - i;
        if (diffCount > maxDiffCount) {
          maxDiffCount = diffCount;
        }
      }
    }

    return maxDiffCount + 1;
  }

}

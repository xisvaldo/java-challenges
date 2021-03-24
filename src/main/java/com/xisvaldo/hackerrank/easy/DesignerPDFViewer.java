package com.xisvaldo.hackerrank.easy;

/**
 * @author leonardo.borges
 */
public class DesignerPDFViewer {

  public static void main(String[] args) {

    //int[] height = { 1, 3, 1, 3, 1, 4, 1, 3, 2, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5 };
    //String word = "abc";
    int[] height = { 1, 3, 1, 3, 1, 4, 1, 3, 2, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 7 };
    String word = "zaba";

    System.out.println(designerPdfViewer(height, word));
  }

  static int designerPdfViewer(int[] h, String word) {

    final int ASCII_LOWER_CONSTANT  = 96;
    final int ASCII_A_LOWER = 97;
    final int ASCII_Z_LOWER = 122;
    char[] letters = word.toLowerCase().toCharArray();
    int higherLetter = 0;

    for (char letter : letters) {

      if ((int) letter >= ASCII_A_LOWER & (int) letter <= ASCII_Z_LOWER) {

        if (higherLetter < h[((int) letter - ASCII_LOWER_CONSTANT) - 1])
          higherLetter = h[((int) letter - ASCII_LOWER_CONSTANT) - 1];
      }
    }

    return higherLetter * word.length();
  }
}

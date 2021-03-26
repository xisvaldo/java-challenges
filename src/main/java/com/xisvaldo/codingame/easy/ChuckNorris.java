package com.xisvaldo.codingame.easy;

import java.util.Collections;

/**
 * @author leonardo.borges
 */
public class ChuckNorris {

  public static void main(String[] args) {
    decode("C"); //0 0 00 0000 0 00
    decode("CC"); //0 0 00 0000 0 000 00 0000 0 00
    decode("%"); //00 0 0 0 00 00 0 0 00 0 0 0
    decode("Chuck Norris' keyboard has 2 keys: 0 and white space."); //0 0 00 0000 0 0000 00 0 0 0 00 000 0 000 00 0 0 0 00 0 0 000 00 000 0 0000 00 0 0 0 00 0 0 00 00 0 0 0 00 00000 0 0 00 00 0 000 00 0 0 00 00 0 0 0000000 00 00 0 0 00 0 0 000 00 00 0 0 00 0 0 00 00 0 0 0 00 00 0 0000 00 00 0 00 00 0 0 0 00 00 0 000 00 0 0 0 00 00000 0 00 00 0 0 0 00 0 0 0000 00 00 0 0 00 0 0 00000 00 00 0 000 00 000 0 0 00 0 0 00 00 0 0 000000 00 0000 0 0000 00 00 0 0 00 0 0 00 00 00 0 0 00 000 0 0 00 00000 0 00 00 0 0 0 00 000 0 00 00 0000 0 0000 00 00 0 00 00 0 0 0 00 000000 0 00 00 00 0 0 00 00 0 0 00 00000 0 00 00 0 0 0 00 0 0 0000 00 00 0 0 00 0 0 00000 00 00 0 0000 00 00 0 00 00 0 0 000 00 0 0 0 00 00 0 0 00 000000 0 00 00 00000 0 0 00 00000 0 00 00 0000 0 000 00 0 0 000 00 0 0 00 00 00 0 0 00 000 0 0 00 00000 0 000 00 0 0 00000 00 0 0 0 00 000 0 00 00 0 0 0 00 00 0 0000 00 0 0 0 00 00 0 00 00 00 0 0 00 0 0 0 00 0 0 0 00 00000 0 000 00 00 0 00000 00 0000 0 00 00 0000 0 000 00 000 0 0000 00 00 0 0 00 0 0 0 00 0 0 0 00 0 0 000 00 0
  }

  private static void decode(String message) {
    StringBuilder binary = new StringBuilder();

    for (char letter : message.toCharArray()) {
      String convertedLetter = Integer.toBinaryString(letter);

      if (convertedLetter.length() < 7) {
        convertedLetter = fillWithZerosAtStart(convertedLetter);
      }

      binary.append(convertedLetter);
    }

    int i = 0;
    char currentLetter;
    while (i < binary.length()) {

      if (binary.charAt(i) == '0') {
        System.out.print("00 ");
        currentLetter = '0';
      }
      else  {
        System.out.print("0 ");
        currentLetter = '1';
      }

      while (binary.charAt(i) == currentLetter) {
        System.out.print("0");
        i++;
        if (i >= binary.length())
          break;
      }

      if (i < binary.length())
        System.out.print(" ");
    }
    System.out.println();
  }

  private static String fillWithZerosAtStart(String convertedLetter) {
    return String.join("0", Collections.nCopies(7 - convertedLetter.length(), "0")) + convertedLetter;
  }
}
package com.xisvaldo.codingame.easy;

/**
 * @author leonardo.borges
 */
public class ASCIIArt {

  public static void main(String[] args) {
    ascii(4, 5, "E"); //E
    ascii(4, 5, "MANHATTAN"); //MANHATTAN
    ascii(4, 5, "MaNhAtTaN"); //MANHATTAN
    ascii(4, 5, "M@NH@TT@N"); //M?NH?TT?N
  }

  private static void ascii(int length, int height, String text) {
      String pattern = "ABCDEFGHIJKLMNOPQRSTUVWXYZ?";
      StringBuilder result = new StringBuilder();

      for (int i = 1; i <= height; i++) {
        int position = 0;
        String row = getASCIILine(i);
        for (char letter : text.toUpperCase().toCharArray()) {
          position = pattern.indexOf(letter);

          if (position == -1)
            result.append(row.substring(row.length() - length));
          else
            result.append(row.substring(position * length, (position * length) + length));

        }
        result.append("\n");
      }

      System.out.println(result);
  }

  private static String getASCIILine(int lineNumber) {
    switch (lineNumber) {
      case 1:
        return " #  ##   ## ##  ### ###  ## # # ###  ## # # #   # # ###  #  ##   #  ##   ## ### # # # # # # # # # # ### ### ";
      case 2:
        return "# # # # #   # # #   #   #   # #  #    # # # #   ### # # # # # # # # # # #    #  # # # # # # # # # #   #   # ";
      case 3:
        return "### ##  #   # # ##  ##  # # ###  #    # ##  #   ### # # # # ##  # # ##   #   #  # # # # ###  #   #   #   ## ";
      case 4:
        return "# # # # #   # # #   #   # # # #  #  # # # # #   # # # # # # #    ## # #   #  #  # # # # ### # #  #  #       ";
      case 5:
        return "# # ##   ## ##  ### #    ## # # ###  #  # # ### # # # #  #  #     # # # ##   #  ###  #  # # # #  #  ###  #  ";
      default:
        throw new UnsupportedOperationException();
    }
  }
}

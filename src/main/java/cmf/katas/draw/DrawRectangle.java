package cmf.katas.draw;

import lombok.val;

/**
 * @author Cristian Martín Ferrer on 20/12/22
 */
public class DrawRectangle {

  private static final String CHAR = "*";

  public String drawRectangle(final int height, final int width) {
    Shape shape = () -> this.getRectangle(height, width);
    return shape.draw().toString();
  }

  private StringBuilder getRectangle(final int height, final int width) {
    val firstPosition = 1;
    val sb = new StringBuilder();

    for (int i = firstPosition; i <= height; i++) {
      for (int j = firstPosition; j <= width; j++) {
        if (j == firstPosition || j == width || i == 1 || i == height) {
          sb.append(CHAR).append(" ");
        } else {
          sb.append("  ");
        }
      }
      sb.append("\n");
    }
    return sb;
  }


}


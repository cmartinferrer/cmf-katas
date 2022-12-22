package cmf.katas.draw;

/**
 * @author Cristian Martín Ferrer on 20/12/22
 */
public class DrawSquare {

  private static final String CHAR = "*";

  public String drawSquare(final int sideSize) {
    Shape shape = () -> new StringBuilder(new DrawRectangle().drawRectangle(sideSize, sideSize));
    return shape.draw().toString();
  }
}


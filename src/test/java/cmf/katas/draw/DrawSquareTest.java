package cmf.katas.draw;

import static org.junit.jupiter.api.Assertions.assertEquals;

import lombok.val;
import org.junit.jupiter.api.Test;

/**
 * @author Cristian Martín Ferrer on 20/12/22
 */
class DrawSquareTest {

  private final DrawSquare draw = new DrawSquare();

  @Test
  void givenSideSideWhenDrawSquareThenReturnSquare() {
    final String result = draw.drawSquare(5);

    val expected = new StringBuilder();
    expected.append("* * * * * \n");
    expected.append("*       * \n");
    expected.append("*       * \n");
    expected.append("*       * \n");
    expected.append("* * * * * \n");

    assertEquals(expected.toString(), result);
  }

}
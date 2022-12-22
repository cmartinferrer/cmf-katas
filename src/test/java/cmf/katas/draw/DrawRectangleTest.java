package cmf.katas.draw;

import static org.junit.jupiter.api.Assertions.assertEquals;

import lombok.val;
import org.junit.jupiter.api.Test;

/**
 * @author Cristian Martín Ferrer on 20/12/22
 */
class DrawRectangleTest {

  private final DrawRectangle draw = new DrawRectangle();

  @Test
  void givenHeightAndWidthWhenDrawRectangleThenReturnSquare() {
    final String result = draw.drawRectangle(5, 15);

    val expected = new StringBuilder();
    expected.append("* * * * * * * * * * * * * * * \n");
    expected.append("*                           * \n");
    expected.append("*                           * \n");
    expected.append("*                           * \n");
    expected.append("* * * * * * * * * * * * * * * \n");
    System.out.println(result);

    assertEquals(expected.toString(), result);
  }
}
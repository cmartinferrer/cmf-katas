package cmf.katas.roman;

import static org.junit.jupiter.api.Assertions.assertEquals;

import lombok.val;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

/**
 * @author Cristian Martín Ferrer on 22/12/22
 */
class RomanNumberTest {

  final RomanNumber sut = new RomanNumber();

  @Test
  @Disabled("Disabled because this test is only to print numbers by console.")
  void printNumbers() {
    for (int i = 1; i < 1000; i++) {
      System.out.println(i + " = " + sut.convertToRomanNumber(i));
    }
  }

  @Test
  void givenNumberOne_WhenConvertToRoman_ThenReturnI() {
    val result = sut.convertToRomanNumber(1);
    assertEquals("I", result);
  }

  @Test
  void givenNumberFive_WhenConvertToRoman_ThenReturnV() {
    val result = sut.convertToRomanNumber(5);
    assertEquals("V", result);
  }

  @Test
  void givenNumberTen_WhenConvertToRoman_ThenReturnX() {
    val result = sut.convertToRomanNumber(10);
    assertEquals("X", result);
  }

  @Test
  void givenNumberFifty_WhenConvertToRoman_ThenReturnL() {
    val result = sut.convertToRomanNumber(50);
    assertEquals("L", result);
  }

  @Test
  void givenNumberOneHundred_WhenConvertToRoman_ThenReturnC() {
    val result = sut.convertToRomanNumber(100);
    assertEquals("C", result);
  }

  @Test
  void givenNumberFiveHundred_WhenConvertToRoman_ThenReturnD() {
    val result = sut.convertToRomanNumber(500);
    assertEquals("D", result);
  }

  @Test
  void givenNumberOneThousand_WhenConvertToRoman_ThenReturnM() {
    val result = sut.convertToRomanNumber(1000);
    assertEquals("M", result);
  }


  @Test
  void givenNumber1987_WhenConvertToRoman_ThenReturnMCMLXXXVII() {
    val result = sut.convertToRomanNumber(1987);
    assertEquals("MCMLXXXVII", result);
  }

}
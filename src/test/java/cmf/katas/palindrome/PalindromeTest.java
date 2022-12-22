package cmf.katas.palindrome;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

/**
 * @author Cristian Martín Ferrer on 20/12/22
 */
class PalindromeTest {

  final Palindrome palindrome = new Palindrome();

  @ParameterizedTest
  @ValueSource(strings = {"bob", "salas", "rajar"})
  void givenPalindromeWordWhenCheckIfIsPalindromeThenTrue(String word) {
    assertTrue(palindrome.isPalindrome(word));
  }

  @ParameterizedTest
  @ValueSource(strings = {"hola", "casa", "amigo"})
  void givenNoPalindromeWordWhenCheckIfIsPalindromeThenFalse(String word) {
    assertFalse(palindrome.isPalindrome(word));
  }

}
package cmf.katas.palindrome;

/**
 * @author Cristian Martín Ferrer on 20/12/22
 */
public class Palindrome {

  public Boolean isPalindrome(final String word) {
    return new StringBuilder(word).reverse().toString().equals(word);
  }

}

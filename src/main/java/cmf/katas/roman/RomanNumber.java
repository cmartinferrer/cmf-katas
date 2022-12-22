package cmf.katas.roman;


import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import lombok.val;

/**
 * @author Cristian Martín Ferrer on 22/12/22
 */
public class RomanNumber {

  private Map<String, Integer> romanNumbers;

  public RomanNumber() {
    this.romanNumbers = new LinkedHashMap<>();
    fillInitalListWithRomanNumbers();

  }

  public String convertToRomanNumber(Integer number) {
    val result = new StringBuilder();
    for (Entry<String, Integer> entry : romanNumbers.entrySet()) {
      int matches = number / entry.getValue();
      result.append(repeat(entry.getKey(), matches));
      number = number % entry.getValue();
    }

    return result.toString();
  }

  private String repeat(String s, int n) {
    if (s == null) {
      return null;
    }
    return s.repeat(Math.max(0, n));
  }

  private void fillInitalListWithRomanNumbers() {
    if (romanNumbers == null) {
      romanNumbers = new LinkedHashMap<>();
    }
    romanNumbers.put("M", 1000);
    romanNumbers.put("CM", 900);
    romanNumbers.put("D", 500);
    romanNumbers.put("CD", 400);
    romanNumbers.put("C", 100);
    romanNumbers.put("XC", 90);
    romanNumbers.put("L", 50);
    romanNumbers.put("XL", 40);
    romanNumbers.put("X", 10);
    romanNumbers.put("IX", 9);
    romanNumbers.put("V", 5);
    romanNumbers.put("IV", 4);
    romanNumbers.put("I", 1);
  }

}

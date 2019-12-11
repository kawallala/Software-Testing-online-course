package tudelft.caesarshift;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CaesarShiftCipherTest {
  @ParameterizedTest(name = "string = {0}, shift = {1}, result = {2}")
  @CsvSource({ "abc,3,def"})
  public void CipherTest(String string, int shift, String res){
    String result = new CaesarShiftCipher().CaesarShiftCipher(string,shift);
    assertEquals(res,result);
  }
}

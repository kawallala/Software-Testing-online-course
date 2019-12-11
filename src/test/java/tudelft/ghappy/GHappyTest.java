package tudelft.ghappy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class GHappyTest {
  @Test
  public void startsWithGTest(){
    boolean result = new GHappy().gHappy("ghappy");
    assertFalse(result);
  }
  @Test
  public void endsWithGTest(){
    boolean result = new GHappy().gHappy("happyg");
    assertFalse(result);
  }
  @Test
  public void happyTest(){
    assertTrue(new GHappy().gHappy("happggy"));
  }
  @Test
  public void notHappyTest(){
    assertFalse(new GHappy().gHappy("happgy"));
  }
}

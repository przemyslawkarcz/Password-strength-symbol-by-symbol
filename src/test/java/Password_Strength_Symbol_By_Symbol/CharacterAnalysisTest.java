package Password_Strength_Symbol_By_Symbol;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import static Password_Strength_Symbol_By_Symbol.CharactersAnalysis.checksCharacterType;
import static Password_Strength_Symbol_By_Symbol.CharactersAnalysis.checksLengthOfCharacter;

public class CharacterAnalysisTest {

   @Test
   public void checksLengthOfCharacterTestReturnValue01(){

      String s = "a";

      String character = checksLengthOfCharacter(s);

      Assertions.assertEquals("a", character);

   }

   @Test
   public void checksLengthOfCharacterTestReturnValue02(){

      String s = "a";

      String character = checksLengthOfCharacter(s);

      Assertions.assertNotEquals("b", character);

   }

   @Test
   public void checksLengthOfCharacterTestLength(){

      String s = "a";

      String character = checksLengthOfCharacter(s);

      int length = character.length();

      Assertions.assertEquals(1, length);

   }

   @Test
   public void checksCharacterTypeTestReturnValueCapitalLetter01(){

      String s = "A";

      String characterType = checksCharacterType(s);

      Assertions.assertEquals("A", characterType);

   }

   @Test
   public void checksCharacterTypeTestReturnValueCapitalLetter02(){

      String s = "A";

      String characterType = checksCharacterType(s);

      Assertions.assertNotEquals("B", characterType);

   }

   @Test
   public void checksCharacterTypeTestReturnValueDigit01(){

      String s = "1";

      String characterType = checksCharacterType(s);

      Assertions.assertEquals("1", characterType);

   }

   @Test
   public void checksCharacterTypeTestReturnValueDigit02(){

      String s = "1";

      String characterType = checksCharacterType(s);

      Assertions.assertNotEquals("2", characterType);

   }

   @Test
   public void checksCharacterTypeTestReturnValueAlphabetic01(){

      String s = "#";

      String characterType = checksCharacterType(s);

      Assertions.assertEquals("#", characterType);

   }

   @Test
   public void checksCharacterTypeTestReturnValueAlphabetic02(){

      String s = "#";

      String characterType = checksCharacterType(s);

      Assertions.assertNotEquals("@", characterType);

   }

}

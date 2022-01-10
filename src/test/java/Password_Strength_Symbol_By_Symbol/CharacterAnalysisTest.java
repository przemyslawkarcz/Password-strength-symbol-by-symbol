package Password_Strength_Symbol_By_Symbol;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CharacterAnalysisTest {

   @Test
   public void checksLengthOfCharacterTestReturnValue01(){

      CharactersAnalysis charactersAnalysis = new CharactersAnalysis();

      String s = "a";

      String character = charactersAnalysis.checksLengthOfCharacter(s);

      Assertions.assertEquals("a", character);

   }

   @Test
   public void checksLengthOfCharacterTestReturnValue02(){

      CharactersAnalysis charactersAnalysis = new CharactersAnalysis();

      String s = "a";

      String character = charactersAnalysis.checksLengthOfCharacter(s);

      Assertions.assertNotEquals("b", character);

   }

   @Test
   public void checksLengthOfCharacterTestLength(){

      CharactersAnalysis charactersAnalysis = new CharactersAnalysis();

      String s = "a";

      String character = charactersAnalysis.checksLengthOfCharacter(s);

      int length = character.length();

      Assertions.assertEquals(1, length);

   }

   @Test
   public void checksCharacterTypeTestReturnValueCapitalLetter01(){

      CharactersAnalysis charactersAnalysis = new CharactersAnalysis();

      String s = "A";

      String characterType = charactersAnalysis.checksCharacterType(s);

      Assertions.assertEquals("A", characterType);

   }

   @Test
   public void checksCharacterTypeTestReturnValueCapitalLetter02(){

      CharactersAnalysis charactersAnalysis = new CharactersAnalysis();

      String s = "A";

      String characterType = charactersAnalysis.checksCharacterType(s);

      Assertions.assertNotEquals("B", characterType);

   }

   @Test
   public void checksCharacterTypeTestReturnValueDigit01(){

      CharactersAnalysis charactersAnalysis = new CharactersAnalysis();

      String s = "1";

      String characterType = charactersAnalysis.checksCharacterType(s);

      Assertions.assertEquals("1", characterType);

   }

   @Test
   public void checksCharacterTypeTestReturnValueDigit02(){

      CharactersAnalysis charactersAnalysis = new CharactersAnalysis();

      String s = "1";

      String characterType = charactersAnalysis.checksCharacterType(s);

      Assertions.assertNotEquals("2", characterType);

   }

   @Test
   public void checksCharacterTypeTestReturnValueAlphabetic01(){

      CharactersAnalysis charactersAnalysis = new CharactersAnalysis();

      String s = "#";

      String characterType = charactersAnalysis.checksCharacterType(s);

      Assertions.assertEquals("#", characterType);

   }

   @Test
   public void checksCharacterTypeTestReturnValueAlphabetic02(){

      CharactersAnalysis charactersAnalysis = new CharactersAnalysis();

      String s = "#";

      String characterType = charactersAnalysis.checksCharacterType(s);

      Assertions.assertNotEquals("@", characterType);

   }

}

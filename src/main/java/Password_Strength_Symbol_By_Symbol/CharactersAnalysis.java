package Password_Strength_Symbol_By_Symbol;

import java.util.Scanner;

public class CharactersAnalysis {

    public static String fieldThatCollectsCapitalCharacters = "";
    public static String fieldThatCollectsSmallCharacters = "";
    public static String fieldThatCollectsSpecialSigns = "";
    public static String fieldThatCollectsDigits = "";
    public static String fieldThatCollectsAllCharacters = "";

    public void executiveMethod() {

        PasswordStrengthSymbolBySymbol passwordStrengthSymbolBySymbol = new PasswordStrengthSymbolBySymbol();

        Scanner introducesCharacters = new Scanner(System.in);
        int numberOfCharactersInPassword = 12;

        System.out.print("* * * Enter characters symbol by symbol * * *");
        System.out.print("\n* * * Password should consists of at least " + numberOfCharactersInPassword + " characters * * *");

        for (int i = 1; i <= numberOfCharactersInPassword; i++) {

            System.out.print("\nSymbol " + i + " of " + numberOfCharactersInPassword + ": ");
            String enteredCharacter = introducesCharacters.nextLine();

            String checkedLengthOfCharacter = checksLengthOfCharacter(enteredCharacter);

            if (checkedLengthOfCharacter.equals(String.valueOf(0))){
                break;
            }

            checksCharacterType(enteredCharacter);

            passwordStrengthSymbolBySymbol.checksPasswordStrengthSymbolBySymbol();

            printsSummaryOfCharacters();

        }

    }

    public String checksLengthOfCharacter(String someString){

        int characterLength = someString.length();

        if (characterLength != 1){
            System.out.println("Enter 1 by 1 character only. Start again.");
            return String.valueOf(0);
        }

        return someString;
    }

    public String checksCharacterType(String someString){

        CharactersAnalysis charactersAnalysis = new CharactersAnalysis();

        String checkedCharacter = charactersAnalysis.checksLengthOfCharacter(someString);

        for (int i = 0; i < checkedCharacter.length(); i++) {

            char c = checkedCharacter.charAt(i);

            setFieldThatCollectsAllCharacters(fieldThatCollectsAllCharacters.concat(checkedCharacter));

            if (Character.isLowerCase(c)){

                return setFieldThatCollectsSmallCharacters(fieldThatCollectsSmallCharacters.concat(checkedCharacter));

            }
            if (Character.isUpperCase(c)){

                return setFieldThatCollectsCapitalCharacters(fieldThatCollectsCapitalCharacters.concat(checkedCharacter));

            }
            if (Character.isDigit(c)){

                return setFieldThatCollectsDigits(fieldThatCollectsDigits.concat(checkedCharacter));

            }
            if (!Character.isAlphabetic(c)){

                return setFieldThatCollectsSpecialSigns(fieldThatCollectsSpecialSigns.concat(checkedCharacter));

            }

        }

        return checkedCharacter;
    }

    public void printsSummaryOfCharacters() {

        System.out.println("Password: \t" + getFieldThatCollectsAllCharacters());
        System.out.println("Uppercase: \t" + getFieldThatCollectsCapitalCharacters() + "\t, number of characters: " + getFieldThatCollectsCapitalCharacters().length());
        System.out.println("Lowercase: \t" + getFieldThatCollectsSmallCharacters() + "\t, number of characters: " + getFieldThatCollectsSmallCharacters().length());
        System.out.println("Digits: \t" + getFieldThatCollectsDigits() + "\t, number of characters: " + getFieldThatCollectsDigits().length());
        System.out.println("Symbols: \t" + getFieldThatCollectsSpecialSigns() + "\t, number of characters: " + getFieldThatCollectsSpecialSigns().length());

    }

    public static String getFieldThatCollectsCapitalCharacters() {
        return fieldThatCollectsCapitalCharacters;
    }

    public static String setFieldThatCollectsCapitalCharacters(String fieldThatCollectsCapitalCharacters) {
        CharactersAnalysis.fieldThatCollectsCapitalCharacters = fieldThatCollectsCapitalCharacters;
        return fieldThatCollectsCapitalCharacters;
    }

    public static String getFieldThatCollectsSpecialSigns() {
        return fieldThatCollectsSpecialSigns;
    }

    public static String setFieldThatCollectsSpecialSigns(String fieldThatCollectsSpecialSigns) {
        CharactersAnalysis.fieldThatCollectsSpecialSigns = fieldThatCollectsSpecialSigns;
        return fieldThatCollectsSpecialSigns;
    }

    public static String getFieldThatCollectsDigits() {
        return fieldThatCollectsDigits;
    }

    public static String setFieldThatCollectsDigits(String fieldThatCollectsDigits) {
        CharactersAnalysis.fieldThatCollectsDigits = fieldThatCollectsDigits;
        return fieldThatCollectsDigits;
    }

    public static String getFieldThatCollectsSmallCharacters() {
        return fieldThatCollectsSmallCharacters;
    }

    public static String setFieldThatCollectsSmallCharacters(String fieldThatCollectsSmallCharacters) {
        CharactersAnalysis.fieldThatCollectsSmallCharacters = fieldThatCollectsSmallCharacters;
        return fieldThatCollectsSmallCharacters;
    }

    public static String getFieldThatCollectsAllCharacters() {
        return fieldThatCollectsAllCharacters;
    }

    public static void setFieldThatCollectsAllCharacters(String fieldThatCollectsAllCharacters) {
        CharactersAnalysis.fieldThatCollectsAllCharacters = fieldThatCollectsAllCharacters;
    }

}

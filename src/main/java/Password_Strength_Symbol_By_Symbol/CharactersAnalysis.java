package Password_Strength_Symbol_By_Symbol;

import java.util.Scanner;

import static Password_Strength_Symbol_By_Symbol.PasswordStrengthSymbolBySymbol.checksPasswordStrengthSymbolBySymbol;

public class CharactersAnalysis {

    public static String fieldThatCollectsCapitalCharacters = "";
    public static String fieldThatCollectsSmallCharacters = "";
    public static String fieldThatCollectsSpecialSigns = "";
    public static String fieldThatCollectsDigits = "";
    public static String fieldThatCollectsAllCharacters = "";

    public static void executiveMethod() {

        Scanner introducesCharacters = new Scanner(System.in);
        int numberOfCharactersInPassword = 12;

        System.out.print("* * * Enter characters symbol by symbool * * *");
        System.out.print("\n* * * Password should consists of at least " + numberOfCharactersInPassword + " characters * * *");

        for (int i = 1; i <= numberOfCharactersInPassword; i++) {

            System.out.print("\nSymbol " + i + " of " + numberOfCharactersInPassword + ": ");
            String enteredCharacter = introducesCharacters.nextLine();

            String checkedLengthOfCharacter = checksLengthOfCharacter(enteredCharacter);

            if (checkedLengthOfCharacter.equals(String.valueOf(0))){
                break;
            }

            checksCharacterType(enteredCharacter);

            checksPasswordStrengthSymbolBySymbol();

            printsSummaryOfCharacters();

        }

    }

    public static String checksLengthOfCharacter(String someString){

        int characterLength = someString.length();

        if (characterLength != 1){
            System.out.println("Enter 1 by 1 character only. Start again.");
            return String.valueOf(0);
        }

        return someString;
    }

    public static String checksCharacterType(String someString){

        String checkedCharacter = checksLengthOfCharacter(someString);

        for (int i = 0; i < checkedCharacter.length(); i++) {

            char c = checkedCharacter.charAt(i);

            setFieldThatCollectsAllCharacters(fieldThatCollectsAllCharacters.concat(checkedCharacter));

            if (Character.isLowerCase(c)){

                setFieldThatCollectsSmallCharacters(fieldThatCollectsSmallCharacters.concat(checkedCharacter));

                return "";
            }
            if (Character.isUpperCase(c)){

                setFieldThatCollectsCapitalCharacters(fieldThatCollectsCapitalCharacters.concat(checkedCharacter));

                return "";
            }
            if (Character.isDigit(c)){

                setFieldThatCollectsDigits(fieldThatCollectsDigits.concat(checkedCharacter));

                return "";
            }
            if (!Character.isAlphabetic(c)){

                setFieldThatCollectsSpecialSigns(fieldThatCollectsSpecialSigns.concat(checkedCharacter));

                return "";
            }

        }

        return checkedCharacter;
    }

    public static void printsSummaryOfCharacters() {

        System.out.println("Password: \t" + getFieldThatCollectsAllCharacters());
        System.out.println("Uppercase: \t" + getFieldThatCollectsCapitalCharacters() + "\t, number of characters: " + getFieldThatCollectsCapitalCharacters().length());
        System.out.println("Lowercase: \t" + getFieldThatCollectsSmallCharacters() + "\t, number of characters: " + getFieldThatCollectsSmallCharacters().length());
        System.out.println("Digits: \t" + getFieldThatCollectsDigits() + "\t, number of characters: " + getFieldThatCollectsDigits().length());
        System.out.println("Symbols: \t" + getFieldThatCollectsSpecialSigns() + "\t, number of characters: " + getFieldThatCollectsSpecialSigns().length());

    }

    public static String getFieldThatCollectsCapitalCharacters() {
        return fieldThatCollectsCapitalCharacters;
    }

    public static void setFieldThatCollectsCapitalCharacters(String fieldThatCollectsCapitalCharacters) {
        CharactersAnalysis.fieldThatCollectsCapitalCharacters = fieldThatCollectsCapitalCharacters;
    }

    public static String getFieldThatCollectsSpecialSigns() {
        return fieldThatCollectsSpecialSigns;
    }

    public static void setFieldThatCollectsSpecialSigns(String fieldThatCollectsSpecialSigns) {
        CharactersAnalysis.fieldThatCollectsSpecialSigns = fieldThatCollectsSpecialSigns;
    }

    public static String getFieldThatCollectsDigits() {
        return fieldThatCollectsDigits;
    }

    public static void setFieldThatCollectsDigits(String fieldThatCollectsDigits) {
        CharactersAnalysis.fieldThatCollectsDigits = fieldThatCollectsDigits;
    }

    public static String getFieldThatCollectsSmallCharacters() {
        return fieldThatCollectsSmallCharacters;
    }

    public static void setFieldThatCollectsSmallCharacters(String fieldThatCollectsSmallCharacters) {
        CharactersAnalysis.fieldThatCollectsSmallCharacters = fieldThatCollectsSmallCharacters;
    }

    public static String getFieldThatCollectsAllCharacters() {
        return fieldThatCollectsAllCharacters;
    }

    public static void setFieldThatCollectsAllCharacters(String fieldThatCollectsAllCharacters) {
        CharactersAnalysis.fieldThatCollectsAllCharacters = fieldThatCollectsAllCharacters;
    }

}

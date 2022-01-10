package Password_Strength_Symbol_By_Symbol;

public class Main {

    public static void main(String[] args) {

        // Password strength grading

        // Very weak password:          The password is lesser or equals 7 characters.
        // Weak password:               The password contains 8 characters or more but the number of digits or capital letters or special characters is 0.
        // Medium strength password:    The password contains 8 characters or more including 1 digit or 1 capital letter or 1 special character.
        // Strong password:             The password contains 8 characters or more including 2 digits or 2 capital letters or 2 special characters.
        // Very strong password:        The password contains 8 characters or more including more than 2 digits or more than 2 capital letters
        //                              or more than 2 special characters.

        // Main method responsible for checking password strength throughout symbol by symbol
        CharactersAnalysis charactersAnalysis = new CharactersAnalysis();
        charactersAnalysis.executiveMethod();

    }

}

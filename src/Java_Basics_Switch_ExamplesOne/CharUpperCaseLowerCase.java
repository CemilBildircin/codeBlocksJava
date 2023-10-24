package Java_Basics_Switch_ExamplesOne;

public class CharUpperCaseLowerCase {
    public static void main(String[] args) {

        int upperCase = 0;
        char letter = 'A';
        int lowerCase = upperCase + 32;

        if (letter >= 65 && letter <= 90){
            System.out.println("Letter " + letter + " is uppercase.");
            letter += 32;
            System.out.println(letter);
        } else if (letter >= 97 && letter <=122 ){
            System.out.println("Letter " + letter + " is lowercase.");
            letter -= 32;
            System.out.println(letter);
        }
    }
}

/*
Given a letter (char) determine if the character is an uppercase letter or lowercase letter

        Note: 	'b'  --> lowercase
        'G' --> uppercase
        'O'  --> uppercase

        Hint: 	Use the ASCII table.

        Also, note that there is a different 32 between upper case and lower case

        lowercase = uppercase + 32;

        Also, the range for uppercase is from 65 (inclusive) to 90 (inclusive), for lowercase

        it is from 97 (inclusive) to 122 (inclusive)

        Ex:
        Enter letter to be converted:
        A

        OUTPUT:
        a
      */

package Java_Nested_Loop;

public class ReverseOnlySecondWord {
    public static void main(String[] args) {

        String str = "I love java";
        String middleWord = str.substring(str.indexOf(" ") + 1, str.lastIndexOf(" "));
        String firstWord = String.valueOf(str.charAt(0));
        String lastWord = str.substring(str.lastIndexOf(" "));
        String newMiddle ="";

        for (int i = middleWord.length() - 1; i >= 0; i--) {
            newMiddle += String.valueOf(middleWord.charAt(i));

        }
        System.out.print(firstWord +" "+ newMiddle + lastWord);
    }
}




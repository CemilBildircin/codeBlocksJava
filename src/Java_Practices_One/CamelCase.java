package Java_Practices_One;

public class CamelCase {
    public static void main(String[] args) {

        String str = "Tomorrow is Mine!".toLowerCase();
        int firstEmpty = str.indexOf(" ");
        String firstWord = str.substring(0, firstEmpty).toLowerCase();

        int secondEmpty = str.lastIndexOf(" ");
        String secondWord = str.substring(secondEmpty - 2, secondEmpty);
        secondWord = secondWord.substring(0, 1).toUpperCase() + secondWord.substring(1);

        String lastWord = str.substring(secondEmpty + 1);
        lastWord = lastWord.substring(0, 1).toUpperCase() + lastWord.substring(1);

        String result = firstWord + secondWord + lastWord;
        System.out.println(result);

    }
}
 /*
    Today is SUNDAY

        Output:

        todayIsSunday

  */
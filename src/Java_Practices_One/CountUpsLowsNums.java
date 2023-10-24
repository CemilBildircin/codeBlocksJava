package Java_Practices_One;

public class CountUpsLowsNums {
    public static void main(String[] args) {

        String str = "This sentences has multiple words";
        int cntr = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ' ') {
                cntr++;
            }
        }
        System.out.println("This sentence has " + (cntr + 1) + " words");
    }
}
/*

Given a sentence determine how many words are in the String.
                    Ex:
                        Input:
                            This has multiple words
                        Output:
                            4

 */
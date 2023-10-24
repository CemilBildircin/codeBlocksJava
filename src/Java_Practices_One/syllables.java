package Java_Practices_One;

public class syllables {
    public static void main(String[] args) {

        String str = "ja-va-va-ja-va";
        int cnt = 1;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '-') {
                cnt++;
            }
        }System.out.println(cnt);
    }
}
/*

Task:
		Given a String separated by dashes calculate how many syllables the words are

                Ex:
                    Input:
                        ja-va
                    Output:
                        2

 */
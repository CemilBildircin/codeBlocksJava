package Arrays;

public class LastChars {

    public static void main(String[] args) {
        String result = "";
        String[][] arr = {{"James", "is", "back"},{"he", "was", "never", "gone"},{"methods", "tomorrow"}, };

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                result += arr[i][j].charAt(arr[i][j].length()-1);
            }
            System.out.println(result);
            result = "";
        }
    }
}

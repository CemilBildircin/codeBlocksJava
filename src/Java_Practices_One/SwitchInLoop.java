package Java_Practices_One;

public class SwitchInLoop {
    public static void main(String[] args) {

        int n = 5;
        String message = "";

        for (int i = 0; i <= n; i++) {
            switch (i) {
                case 0:
                    message = "zero";
                    break;
                case 1:
                    message = "One";
                    break;
                case 2:
                    message = "Two";
                    break;
                case 3:
                    message = "Three";
                    break;
                case 4:
                    message = "Four";
                    break;
                case 5:
                    message = "Five";
                    break;

            }
            System.out.println(message);

        }

    }
}
/*
 Given loop iterates n times (from 0 to n),
 I want to use switch statement in the loop and print out for each case

		Ex:
           Input:
           	5
           Output:
            Zero
			One
			Two
			Three
			Four
			Five
 */
package Java_Practices_One;

public class MultiplyEnd {
    public static void main(String[] args) {

        String str = "hello?";
        int num = 5;
        String lastChar = String.valueOf(str.charAt(str.length() - 1));
        for (int i = 1; i < num; i++) {
            lastChar += str.toLowerCase().charAt(str.length() - 1);
        }
        System.out.println(str + lastChar);
    }
}
/*
Multiply End [String, Loops]

   Given a String and a number return a String that has the ending character duplicated and attached by the number amount of times
                        Ex:
                            Input:
                                Hello?
                                3
                            Output:
                                Hello????

                        Ex:
                            Input:
                                java
                                5
                            Output:
                                javaaaaaa
 */
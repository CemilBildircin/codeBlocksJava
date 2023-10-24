package Java_Basics_StringMethods_ExamplesTwo;

public class PrintLettersCombination {
    public static void main(String[] args) {

        char char1 = 'z';
        char char2 = 'z';
        while (char1 >= 118) {
            while (char2 >= 118) {
                System.out.println(char1 + "" + char2);
                char2--;
            }
            char2 = 'z';
            char1--;
        }
    }
}
 /*

        122-122 -- zz
        122-121 -- zy
        122-120 -- zx
        122-119 -- zw
        122-118 -- zv


         */

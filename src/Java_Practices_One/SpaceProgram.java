package Java_Practices_One;

public class SpaceProgram {
    public static void main(String[] args) {

        String str1 = "Java is cool";

        if (str1.contains(" ")) {
            str1 = (str1.replaceAll(" ", "_").replace("", " "));
        } else {
            str1 = str1.replace("", " ");
        }
        System.out.println(str1);
    }
}

/*

Space program [String, Loops]

        Given a String return a version of with spaces between all the letters.
        If there is already a space in the String put an underscore

                        Ex: java   -> j a v a
                            space      -> s p a c e
                            more words -> m o r e _ w o r d s
 */

package Arrays;


import java.util.Arrays;

public class URLParts {

    public static void main(String[] args) {

        String url = "https://learn.loopcamp.com/courses/130";
        String[] parts = url.split("/");
        System.out.println();

        for (int i = 0; i < parts.length; i++) {
            System.out.println(parts[i]);
        }

    }
}

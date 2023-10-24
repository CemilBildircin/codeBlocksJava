package Java_Practices_One;

public class CreateID {
    public static void main(String[] args) {
        String name = "Johny".toLowerCase();
        String lastName = "Walker".toUpperCase();
        int num = name.length() * 2;
        System.out.println("" + name.charAt(0) + lastName.charAt(0) + lastName.substring(1, 3).toLowerCase() + num);
    }
}
/*
 Task:
       Given a first name and last name create and return an id using the following format:
       the first letter of the first name as lowercase,
       the first 3 letters of the last name with the first letter as uppercase and the rest lowercase,
       the length of the first String multiplied by 2

                            first name: john
                            last name: smith

                            id: jSmi8

 */
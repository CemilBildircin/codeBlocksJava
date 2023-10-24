package Java_Practices_Two;

public class WhileLoopPractice {
    public static void main(String[] args) {

        int i = 1; // initialization expression. it is a MUST for while loop.
        while (i < 6) { // loop value is the key to number of repetition.
            System.out.println("\nHello World");
            i++; // UPDATE VALUE. updates value until WHILE LOOP (in this case i<6) value.
        }

    }
}

/*          1. Program starts.
            2. i is initialized with value 1.
            3. Condition is checked. 1 < 6 yields true.
                3.a) "Hello World" gets printed 1st time.
                3.b) Updation is done. Now i = 2.
            4. Condition is checked. 2 < 6 yields true.
                4.a) "Hello World" gets printed 2nd time.
                4.b) Updation is done. Now i = 3.
            5. Condition is checked. 3 < 6 yields true.
                5.a) "Hello World" gets printed 3rd time
                5.b) Updation is done. Now i = 4.
            6. Condition is checked. 4 < 6 yields true.
                6.a) "Hello World" gets printed 4th time
                6.b) Updation is done. Now i = 5.
            7. Condition is checked. 5 < 6 yields true.
                7.a) "Hello World" gets printed 5th time
                7.b) Updation is done. Now i = 6.
            8. Condition is checked. 6 < 6 yields false.
            9. Flow goes outside the loop. Program terminates. */



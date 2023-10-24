package Arrays;

public class GradebookTwo {
    public static void main(String[] args) {

        String[] students = {"Mike", "Joe", "Ana", "Ali", "Joanna"};
        int[] scores = {80, 54,100,66,94};
        char[] grades = {'B','D','A','C','A'};

        for (int i = 0; i < students.length; i++) {

            for (int i1 = 0; i1 < scores.length; i1++) {

                for (int i2 = 0; i2 < grades.length; i2++) {

                }
            }

            System.out.println(students[i] + " | " + scores[i] + " | " + grades[i]);
        }

    }
}

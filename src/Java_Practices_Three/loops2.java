package Java_Practices_Three;

public class loops2 {
    public static void main(String[] args){

        int sum = 0, num; // sum and num values are int
        for(num=0; num<=10; num++){ // num has zero declared and <=10. num++ shows num will go zero to ten and the value
                                    // will assign to it.

            sum += num; // sum = sum + num
        }
        System.out.println(sum);

    }
}

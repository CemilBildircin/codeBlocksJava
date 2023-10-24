package Arrays;

public class AverageOfEach {
    public static void main(String[] args) {
        int result = 0;
        int ave;
        int[][] nums = { {3,4,5,6,}, {5,2,6,},{10,20,30,40,50,60} };
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j <nums[i].length ; j++) {
                result += nums[i][i];
            }
            ave = result/nums[i].length ;
            System.out.println(ave);
            result = 0;
        }



    }
}

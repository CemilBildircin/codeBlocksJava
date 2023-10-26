package MethodsVoid;

public class MethodPractice1 {

    public static void printNumTo100odd() {

        for (int i = 0; i <= 100; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }

    }
    public static void printNumTo100Even(){
        for (int i = 0; i < 100; i++) {
            if (i%2!=0){
                System.out.print(i + " ");
            }
        }
    }

    public static void main(String[] args) {
        printNumTo100odd();
        System.out.println();
        printNumTo100Even();
    }

}

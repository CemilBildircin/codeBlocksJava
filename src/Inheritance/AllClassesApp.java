package Inheritance;

public class AllClassesApp {
    public static void main(String[] args) {

        App app1 = new App("HyperBike", 1.2023);
        Instagram insta1 = new Instagram("InsTop", 2023.1);
        Youtube yut1 = new Youtube("Youtube", 2023.2);
        System.out.println(yut1);
        System.out.println(insta1);
        System.out.println(app1);
        insta1.download();
        insta1.postPicture();
        app1.download();


    }
}

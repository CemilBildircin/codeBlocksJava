package Inheritance;

public class AllClassesDiscord {
    public static void main(String[] args) {

        DiscordUser user1 = new DiscordUser("User", "Tomy", 90123);
        Admin admin1 = new Admin("Micky", 90124);
        Student student1 = new Student("Jimmy", 90125);
        student1.study();
        admin1.study();
        admin1.createChannel();
        student1.sendMessage();

        System.out.println(user1);
        System.out.println(admin1);
        System.out.println(student1);
    }
}
package Inheritance;

public class Admin extends DiscordUser {

    public Admin(String name, int id) {
       super("Admin",name,id);

    }
    public void createChannel() {

        System.out.println( name + " is creating a new discord channel");
    }
}

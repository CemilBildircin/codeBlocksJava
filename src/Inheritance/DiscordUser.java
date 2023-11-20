package Inheritance;

public class DiscordUser {

    String name;
    String role;
    int id;

    public DiscordUser(String role,String name, int id) {
        this.name = name;
        this.role=role;
        this.id = id;
    }
    public void study(){
        System.out.println( name + " is studying for the exam.");
    }

    @Override
    public String toString() {
        return "Discord User" +
                "\n\tName: " + name +
                "\n\tRole: " + role +
                "\n\tID: " + id;
    }
}

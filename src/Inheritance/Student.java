package Inheritance;

public class Student extends DiscordUser{

    public Student(String name, int id){
        super("Student",name,id);
    }

    public void sendMessage(){
        System.out.println(name + " is sending message to class chat");
    }
}

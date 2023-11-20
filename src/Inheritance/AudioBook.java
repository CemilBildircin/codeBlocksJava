package Inheritance;

public class AudioBook extends Book {

    double duration;
    String narrator;

    public void listen(){
        System.out.println( "Listening " + this.title + " narrated by " +
                this.narrator + " it is " + this.duration + " long." );

    }
}

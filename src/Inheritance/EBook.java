package Inheritance;

public class EBook extends Book {
    int size;
    int pages;

    public void read(){
        System.out.println("Reading a digital copy of " + "\'"+ title +
                "\'"+ " file size is: " + this.size + " MB"+
                " consists of " + this.pages + " pages.");
    }
}

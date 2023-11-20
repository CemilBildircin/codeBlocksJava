package Inheritance;

public class AllClassesBook {
    public static void main(String[] args) {

        Book book = new Book();
        EBook eBook = new EBook();
        AudioBook audioBook = new AudioBook();

        book.title = "Give Yourself a Week";
        book.author = "Feyruz Shahmurad";
        book.genre = "Fiction";
        book.price= 9.99;
        book.chapter = 25;
        book.hasMovie = true;
        System.out.println(book);

        eBook.title = "May be Two Weeks?";
        eBook.price = 9.99;
        eBook.size = 12;
        eBook.pages = 999;
        eBook.hasMovie = false;
        eBook.chapter = 1099;
        eBook.author = "Anonymous Students";
        eBook.genre = "Science";
        System.out.println(eBook);
        eBook.read();

        audioBook.duration= 459;
        audioBook.narrator= "Stephen Fry";
        audioBook.title = "Touching the Void";
        audioBook.price= 9.99;
        audioBook.hasMovie= true;
        audioBook.chapter=45;
        audioBook.genre="Science Fiction";
        audioBook.author="Joe Simpson";
        System.out.println(audioBook);
        audioBook.listen();

    }
}

package Inheritance;

public class Book {
    String title, author, genre;

    int chapter;
    double price;
    boolean hasMovie;

    @Override
    public String toString() {
        return "\nBook" +
                "\n\tTitle: " + title +
                "\n\tAuthor: " + author+
                "\n\tGenre: " + genre +
                "\n\tChapter: " + chapter +
                "\n\tPrice: $" + price +
                "\n\tHas Movie: " + hasMovie;
    }
}

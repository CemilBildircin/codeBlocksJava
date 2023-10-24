package Java_Basics_One;

public class ConcatenationExampleOne {
    public static void main(String[] args) {

        String name = "\"The Lord of The Codes\"";
        String genre = "Science Fiction";
        byte durationHour = 2;
        byte durationMinute = 35;
        String releaseDate = "20/23/2023";
        String rating = "PG 13";
        boolean isSequel = false;
        boolean isOnDvd = true;

        System.out.println( "\n" + " ------ Welcome to the CodeyWood Movie Theater ------ " + "\n" + "Tonight we are streaming " + name +  " which " +
                "was released on " + releaseDate + "." + "\n"+ "This " + genre + " movie got a " + rating + " on the Motion" +
                " Picture Association of America (MPAA)." + "\n" + "The " + name + " runs almost " + durationHour +" hours and "
                + durationMinute + " minutes." + " This is not a sequel and is on DVD " + isOnDvd + ".");


//                - Print out the Movie information using concatenations and print statements
//
//                ------ Welcome to the Cinema ------
//                Tonight we are streaming "$movieName" which was released on $releaseDate
//        This $genre movie got a $rottenTomatoesRating rating on Rotten Tomatoes.
//        The rating is $rating and it runs for $duration hours.
//        This is a sequel $isSequel and is on dvd $isOnDvd.
//



    }
}

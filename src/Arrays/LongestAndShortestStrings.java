package Arrays;

public class LongestAndShortestStrings {
    public static void main(String[] args) {

        String[] cities = {"Atlanta", "Florida", "Baku", "Miami", "New York","Orlando"};
        String longest = cities[0];
        String shortest = cities[0];

        for (int i = 0; i < cities.length; i++) {
            if (cities[i].length() > longest.length()) {
                longest = cities[i];
            }
        }
        for (int i = 0; i < cities.length; i++) {
            if (cities[i].length() < shortest.length()) {
                shortest = cities[i];
            }
        }
        System.out.println("\nLongest City names is " + longest + " and shortest city name is " + shortest + ".");
    }
}

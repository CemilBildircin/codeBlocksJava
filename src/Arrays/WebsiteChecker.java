package Arrays;

public class WebsiteChecker {
    public static void main(String[] args) {

        String[] webURLs = {"www.atlanta.com", "www.google.com", "www.mozilla.org", "www.comcast.net",
                "www.nasa.com", "www.nasa.gov", "www.blabla.net", "www.blabla.edu", "www.blabla.io", "www.blabla.org","www.blabla.jp"};
        int total = 0, other =0, comCount = 0, orgCount = 0, netCount = 0, govCount = 0, eduCount = 0, ioCount = 0, jpCount = 0;

        for (int i = 0; i < webURLs.length; i++) {
            if (webURLs[i].contains(".com")) {
                comCount++;
            } else if (webURLs[i].contains(".org")) {
                orgCount++;
            } else if (webURLs[i].contains(".edu")) {
                eduCount++;
            } else {
                other++;
            }
        }
        other = webURLs.length - (comCount + orgCount + eduCount);
        System.out.println("Document contains " + comCount + " times .com, " + orgCount + " times .org, and " +
                eduCount + " times .edu. And " + other + " times other URL's. " );
    }
}

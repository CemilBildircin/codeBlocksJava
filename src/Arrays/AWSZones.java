package Arrays;

public class AWSZones {
    public static void main(String[] args) {

        String zones = "US-east1, us-west1, us-south1, us-north1";
        String app = "Etsy";
        String[] zone = zones.split(", ");

        for (String each : zone) {
            System.out.println(app + " is deploying on " + each);
        }

    }
}

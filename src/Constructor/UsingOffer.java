package Constructor;
import java.util.*;
public class UsingOffer {
    public static void main(String[] args) {

        Offer off1 = new Offer("Junior SDET", "Atlanta", true, true, false, 95_000, 10);
        Offer off2 = new Offer("Junior SDET", "Jacksonville", true, false, false, 103_000, 10);
        Offer off3 = new Offer("SDET", "Marietta", true, true, false, 111_000, 15);
        Offer off4 = new Offer("SDET", "Atlanta", false, true, true, 123_000, 15);
        Offer off5 = new Offer("Lead SDET", "Atlanta", true, true, false, 133_000, 20);
        Offer off6 = new Offer("Senior SDET", "Alpharetta", true, true, false, 145_000, 5);
        Offer off7 = new Offer("Senior SDET", "Baku", false, false, true, 225_000, 25);

        ArrayList <Offer> offerList = new ArrayList<>( Arrays.asList( off1,off2,off3,off4,off5,off6,off7));
        ArrayList<Offer> localOffers = new ArrayList<>();
        ArrayList<Offer> fullTimeOffers = new ArrayList<>();

        for ( Offer each : offerList ){
            if ( each.isLocal){
                localOffers.add(each);
            }
        }

        for (Offer whopy : offerList ){
            if ( whopy.isFullTime){
                fullTimeOffers.add(whopy);
            }
        }
        System.out.println("Local Offers: " + localOffers);
        System.out.println();
        System.out.println();
        System.out.println("Full Time Offers = " + fullTimeOffers);
    }
}

package Encapsulation;

import java.util.*;

public class CallingHobby {
    public static void main(String[] args) {

        Hobby hob1 = new Hobby("Bouldering", 499, true, false);
        Hobby hob2 = new Hobby("Riding Motorcycle", 750, true, false);
        Hobby hob3 = new Hobby("Sky Diving", 1250, true, true);
        Hobby hob4 = new Hobby("Play Guitar", 100, false, false);

        ArrayList<Hobby> allHobbies = new ArrayList<>(Arrays.asList(hob1, hob2, hob3, hob4));
        System.out.println(allHobbies);

        for (Hobby each : allHobbies) {
            each.dolt();
        }
        System.out.println("---------------");
        ArrayList<Hobby> indoors = new ArrayList<>();
        for (Hobby each : allHobbies) {
            if (!each.isOutdoors) {
                indoors.add(each);
            }
        }
        System.out.println("indoors = " + indoors);
        ArrayList<Hobby> solo = new ArrayList<>();
        for (Hobby each : allHobbies) {
            if (!each.requiresOthers) {
                solo.add(each);
            }
        }
        System.out.println("solo = " + solo);

        ArrayList<Hobby> cheaperHobby = new ArrayList<>();
        for (Hobby each : allHobbies) {
            if (each.annualCost < 500) {
                cheaperHobby.add(each);
            }
        }
        System.out.println("cheaperHobby = " + cheaperHobby);


    }
}

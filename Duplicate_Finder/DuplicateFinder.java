package Duplicate_Finder;

import java.util.ArrayList;

public class DuplicateFinder {
    public static void main(String[] args) {

        ArrayList<String> guests = new ArrayList<>();

        guests.add("John");
        guests.add("Mary");
        guests.add("John");
        guests.add("David");
        guests.add("Mary");

        System.out.println("Duplicate Names:");

        for (int i = 0; i < guests.size(); i++) {

            for (int j = i + 1; j < guests.size(); j++) {

                if (guests.get(i).equals(guests.get(j))) {
                    System.out.println(guests.get(i));
                }
            }
        }
    }
}

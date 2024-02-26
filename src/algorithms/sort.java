package algorithms;

import java.util.ArrayList;
import java.util.Collections;

class sort {
    public static void main(String[] args) {

        // Creating an array list
        ArrayList<Integer> numbers = new ArrayList<>();

        // Add elements
        numbers.add(4);
        numbers.add(2);
        numbers.add(3);
        System.out.println("Unsorted ArrayList: " + numbers);

        // Using the sort() method
        Collections.sort(numbers);
        System.out.println("Sorted ArrayList: " + numbers);

        ArrayList<String> ArrayString = new ArrayList<>();
        ArrayString.add("alok");
        ArrayString.add("patel");
        ArrayString.add("laharpur");
        ArrayString.add("sitapur");

        Collections.sort(ArrayString);
        System.out.println("sorted arrayString: " + ArrayString);

        // using shuffle method
        Collections.shuffle(ArrayString);
        System.out.println("shuffuled arrayString: " + ArrayString);

        // Routine Data Manipulation

        // using reverse to revese the arraylist
        Collections.reverse(ArrayString);
        System.out.println("shuffuled arrayString: " + ArrayString);

        // using fill to fill the arraylist
        Collections.fill(ArrayString, "ssdgads");
        System.out.println("filled arrayString: " + ArrayString);

        ArrayList<String> newArray = new ArrayList<>();
        newArray.add("fsdf");
        Collections.addAll(newArray);
        // Collections.copy(newArray, ArrayString);
        System.out.println(newArray);

        String s = Collections.max(ArrayString);
        System.out.println(s);

    }
}

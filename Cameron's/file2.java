import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class file2 {
    public static List<String> suits = new ArrayList<> ();
    public static List<Integer> numbers = new ArrayList<> ();
    public void Deck() {
        suits.add("hearts ");
        suits.add("spades ");
        suits.add("diamonds ");
        suits.add("clubs ");

        for(int k = 0; k < 4; k++) {
            for(int i = 1; i < 14; i++) {
                numbers.add(i);
            }
        }

        Collections.shuffle(numbers);
        Collections.shuffle(suits);
        // System.out.println(suits);
        // System.out.println(numbers);
    }
    public void Combine() {
        //combine is a different function than deck to keep them seperate
        System.out.println(suits.remove(0) + numbers.remove(0));
        //prints to terimal
        //remove(index) takes one out of the list, either suits or numbers
    }

}
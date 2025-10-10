import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;


public class Blackjeack {
    public static void main(String[] args){

        // Creating things
        Scanner hist = new Scanner(System.in);
        List<Integer> phand = new ArrayList<>();
        List<Integer> dhand = new ArrayList<>();
        List<Integer> deck = new ArrayList<>();

        //Deck
        for (int f = 0; f < 5; f++){
            for (int g = 1; g < 14; g++){
                deck.add(g);
            }
        }
        System.out.println("goon");
        
        // Player input detection
        while(true){
            System.out.println("Hit or Stand");

            String hs = hist.next();
            String HS = hs.toUpperCase();

            if (HS.equals("H")){
                System.out.println("Hit");

            } else if (HS.equals("S")){
                System.out.println("S");
                break;

            }else{
                System.out.println("WRONG");
            }

        }
        hist.close();

    
    }

}

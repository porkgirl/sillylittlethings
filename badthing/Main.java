import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Collections;

public class Main {
    static boolean go = true;
    static int dsum = 0;
    static int psum = 0;
    static Random ra = new Random();
    static Random rb = new Random();

    //DEALER AI
    static void Dealer(List<Integer> dhand, List<Integer> deck){
        if (dsum <= 11){
            dhand.add(deck.remove(0));
            
        }
        dsum = 0;
        for (int r = 0; r < dhand.size(); r++){
            dsum += dhand.get(r);
        }
        if (dsum <= 19){
            int rnch = ra.nextInt(3);
            if (rnch == 2){
                dhand.add(deck.remove(0));
                
            }
            
        }
        dsum = 0;
        for (int r = 0; r < dhand.size(); r++){
            dsum += dhand.get(r);
        }
    }

    static void deal(List<Integer> phand, List<Integer> dhand, List<Integer> deck){

        // Deck creation
        for (int f = 0; f < 4; f++){
            for (int i = 1; i < 11; i++){
                deck.add(i);
                }
            for (int d = 1; d < 4; d++){
                deck.add(10);
            }
        }

        // Shuffle deck
        Collections.shuffle(deck);


        // Dealer hand :3
        int dcard = deck.remove(0);
        dhand.add(dcard);
        dcard = deck.remove(0);
        dhand.add(dcard);
        
        // player hand :3
        int pcard = deck.remove(0);
        phand.add(pcard);
        pcard = deck.remove(0);
        phand.add(pcard);
        System.out.print("player ");
        System.out.println(phand);


    }
    // DRAWING CARDS FOR DEALER
    static void draw(List<Integer> deck, List<Integer> dhand){
        dhand.add(deck.remove(0));
    }

    
    static void ask(Scanner ec, List<Integer> phand, List<Integer> dhand, List<Integer> deck){
        
        // Scanning and Input
        System.out.println("Hit or Stand:");
        String hs = ec.next();
        String HS = hs.toUpperCase();

        // Drawing a card kinda
        Integer pcard = deck.remove(0);

        // Hitting or standing

            //HITTING
        if (HS.equals("H")){
            System.out.println("Hit");
            if (psum > 21){
                go = false;
            } else{
                phand.add(pcard);
            }
            System.out.println(phand);
            //STANDING
        } else if (HS.equals("S")){
            System.out.println("Stand");
            go = false;
            
            //ERROR
        } else {
            System.out.println("ERROR");
        }

        
    }

    static void hands(List<Integer> phand, List<Integer> dhand){

        // Printing Current player Hand Values

        // Setting sums to 0
        dsum = 0;
        psum = 0;

        // Getting total of Dealer Hand
        for (int w = 0; w < dhand.size(); w++){
            dsum += dhand.get(w);
        }

        // Getting total of Player Hand
        for (int d = 0; d < phand.size(); d++){
            psum += phand.get(d);
        }
        System.out.println("player: " + psum);
        System.out.println(" ");

    }

    public static void main(String[] args){

        // creating new stuff (I forgot the word :3, Maybe it's token :3)
        Scanner sc = new Scanner(System.in);
        List<Integer> phand = new ArrayList<>();
        List<Integer> dhand = new ArrayList<>();
        List<Integer> deck = new ArrayList<>();
        
        String winner = "void";
        
        deal(phand, dhand, deck);
        while (go == true){
            
            ask(sc, phand, dhand, deck);
            hands(phand, dhand);
            if (dsum > 21 || psum > 21){
                break;
            }
        }
        Dealer(dhand, deck);
        hands(phand, dhand);

        //AFTER PLAYING SECTION
        
        System.out.println(" ");
        sc.close();

        // outcomes

        // dealer wins via closer to 21
        if (dsum > psum && dsum <= 21){
            winner = "Dealer ";
            // dealer wins bc player busts
        }
        if (dsum <= 21 && psum > 21 ){
            winner = "Dealer ";
            // Player wins via closer to 21
        }
        if (psum > dsum && psum <= 21){
            winner = "Player ";
            // Player wins bc dealer busts
        }
        if (psum <= 21 && dsum > 21){
            winner = "Player ";
            // Dealer wins because of a tie
        }
        if (psum == dsum){
            winner = "Dealer ";
            // If both bust
        }
        if (psum > 21 && dsum > 21){
            winner = "Dealer";
        }

        // Printing Hands
        dsum = 0;
        psum = 0;
        for (int w = 0; w < dhand.size(); w++){
            dsum += dhand.get(w);
        }
        for (int d = 0; d < phand.size(); d++){
            psum += phand.get(d);
        }

        System.out.println("Player: " + psum);
        System.out.println("Dealer: " + dsum);

        // Telling player result
        System.out.println(winner + "wins!");

    }
    
}
 
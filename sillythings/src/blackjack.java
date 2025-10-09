import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class blackjack {
    static List<Integer> deck = new ArrayList<>();
    public static void main(String[] args){
        deckmngmnt();
        deal();
    }

    //DEALING
    static void deal(){
        List<Integer> phand = new ArrayList<>();
        for (int i = 0; i < 2; i++){
            phand.add(deck.remove(0));
        }
        //System.out.println(deck);
        System.out.println(phand);
    }
    //DECK
    static void deckmngmnt(){
        
        for (int k = 0; k < 4; k++){
            for (int i = 1; i < 10; i++){
                deck.add(i);
            }
            for (int q = 0; q < 4; q++){
                deck.add(10);
            }
        }

        Collections.shuffle(deck);

        //System.out.println(deck);

        //Analyzer
        //int z = 0;
        //for (int t = 0; t < deck.size(); t++){
        //    int y = deck.get(t);
           
        //    if (y == 10){
        //        z++;
        //    }
        //}

        //System.out.println(z);
    }

}
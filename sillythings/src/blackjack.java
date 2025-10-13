import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class blackjack {
    static List<Integer> deck = new ArrayList<>();
    static Scanner scn = new Scanner(System.in);
    public static void main(String[] args){
        deckmngmnt();
        deal();
        draw();
    }
    //drawing
    static void draw(){
        String ask = scn.next().toUpperCase();

        if (ask.equals("H")){
            System.out.println("Hit");
        }else if (ask.equals("S")){
            System.out.println("Stand");
        }
    }

    //DEALING
    static void deal(){
        List<Integer> phand = new ArrayList<>();
        List<Integer> dhand = new ArrayList<>();
        for (int i = 0; i < 2; i++){
            phand.add(deck.remove(0));
            dhand.add(deck.remove(0));
        }
        System.out.println("Dealer" + dhand);
        System.out.println("Player" + phand);
        
        int psum = 0;
        //Compiler
        for (int y = 0; y < phand.size(); y++){
            psum += phand.get(y);
        }
        System.out.println(psum);
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
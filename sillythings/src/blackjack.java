import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class blackjack {
    static List<Integer> deck = new ArrayList<>();
    static Scanner scn = new Scanner(System.in);
    static List<Integer> phand = new ArrayList<>();
    static List<Integer> dhand = new ArrayList<>();
    static boolean running = true;
    public static void main(String[] args){
        deckmngmnt();
        deal();
        while (running == true){
            draw();    
        }    
    }

    //DRAW
    static void draw(){
        String ask = scn.next().toLowerCase();
        
        if (ask.equals("h")){
            //hit
            int card = deck.remove(0);
            phand.add(card);
            System.out.println(card);
        }else if (ask.equals("s")){
            running = false;
        }

        compile();
    }
    //Compiler
    static void compile(){
        int psum = 0;
        for (int y = 0; y < phand.size(); y++){
            psum += phand.get(y);
        }
        
        int dsum = 0;
        for (int y = 0; y < dhand.size(); y++){
            dsum += dhand.get(y);
        }
        if (running == true){
            System.out.println("dealer: " + dsum);
            System.out.println("player: " + psum);
        }
    }

    //DEALING
    static void deal(){
        for (int k = 0; k < 2; k++){
            phand.add(deck.remove(0));
            dhand.add(deck.remove(0));
        }
        System.out.println(dhand);
        System.out.println(phand);

        //Compiler
        
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
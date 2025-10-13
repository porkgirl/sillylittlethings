import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class newjack {
static List<Integer> deck = new ArrayList<>();
static List<Integer> phand = new ArrayList<>();
static List<Integer> dhand = new ArrayList<>();
static boolean running = true;
static int psum;
static int dsum;
static Scanner action = new Scanner(System.in);
    public static void main(String[] args){
        System.out.println("this is blackjack");
        deck();
        deal('a', 2);
        compile('a');
        while (running == true){
            turn();
        }
        //run dealer here
        action.close();
    }
    static void dealer(){
        System.out.println("hello, i am dealer");
    }
    static void turn(){
        compile('p');
        if (psum > 21){
            running = false;
        }
        System.out.println("Hit or Stand");
        
        String recived = action.next();
        System.out.println(recived);
        if (recived == "h"){
            deal('p', 1);
            System.out.println("hit");
        }else if (recived == "STAND" || recived == "S"){
            running = false;
        }//else{
            //System.out.println("ERROR");
        //}
        
    }
    static void deck(){
        for (int i = 0; i < 4; i++){
            for (int n = 1; n <  10; n++){
                deck.add(n);
            }
            for (int t = 0; t < 4; t++){
                deck.add(10);
            }
            Collections.shuffle(deck);
            //System.out.println(deck);
        }
    }
    static void deal(Character hand, int cards){
        for (int h = 0; h < cards; h++){
            if (hand == 'a'){
                phand.add(deck.remove(0));
                dhand.add(deck.remove(0));
            }else if (hand == 'd'){
                dhand.add(deck.remove(0));
            }else if (hand == 'p'){
                phand.add(deck.remove(0));
            }
        }
        System.out.println(phand + " | " + dhand);
    }
    static void compile(Character sum){
        psum = 0;
        dsum = 0;

        if (sum == 'a'){
            for (int c = 0; c < dhand.size(); c++){
                dsum += dhand.get(c);
            }
            for (int c = 0; c < phand.size(); c++){
                psum += phand.get(c);
            }
        }else if (sum == 'p'){
            for (int c = 0; c < phand.size(); c++){
                psum += phand.get(c);
            }
        }else if (sum == 'd'){
            for (int c = 0; c < dhand.size(); c++){
                dsum += dhand.get(c);
            }
        }
        System.out.println(psum + " | " + dsum);

    }
}

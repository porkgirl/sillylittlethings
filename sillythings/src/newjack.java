import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class newjack {
static List<Integer> deck = new ArrayList<>();
static List<Integer> phand = new ArrayList<>();
static List<Integer> dhand = new ArrayList<>();
    public static void main(String[] args){
        System.out.println("this is blackjack");
        deck();
        deal('p');
        deal('d');
        compile('a');
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
    static void deal(Character hand){
        for (int h = 0; h < 2; h++){
            if (hand == 'p'){
                phand.add(deck.remove(0));
            }else if (hand == 'd'){
                dhand.add(deck.remove(0));
            }
        }
    }
    static void compile(Character sum){
        int psum = 0;
        int dsum = 0;

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

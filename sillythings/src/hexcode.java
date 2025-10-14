import java.util.Random;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public class hexcode{
    public static void main(String[] args){
        List<Character> alpha = new ArrayList<>();
        Collections.addAll(alpha,'a','b','c','d','e','f');
        Random numeric = new Random();
        int min = 1;
        int max = 7;
        int num = numeric.nextInt(min - max + 1);
        for (int y = 0; y < 13; y++){
            System.out.println(num);
        }
        System.out.println();
    }
}
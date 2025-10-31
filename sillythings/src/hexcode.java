import java.util.Random;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public class hexcode{
    public static void main(String[] args){
        String digit = "0";
        Random numeric = new Random();
        List<String> alpha = new ArrayList<>();
        Collections.addAll(alpha,"a", "b", "c", "d", "e", "f");
        List<String> code = new ArrayList<>();
        for (int i = 0; i < 6; i++){    
            int type = numeric.nextInt(0,2);
            if (type == 1){
                int numerals = numeric.nextInt(0, 10);
                System.out.println(numerals);
            }else if (type == 0){
                //letters
                int num = numeric.nextInt(0, 6);
                System.out.println(alpha.get(num));
                digit = alpha.get(num);
            }
                //code
                
                code.add(digit);
        }   
        System.out.println(code);
    }
}
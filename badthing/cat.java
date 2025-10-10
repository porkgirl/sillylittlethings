// This is a database for the stats of Team 2129 Ultraviolet robots

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class cat {

    public static void main(String[] args){
        Scanner rbtnm = new Scanner(System.in);

        var kitty = true;
        while (kitty == true){
            String ROBOTNAME = rbtnm.next();

            if (ROBOTNAME == "chester"){
                Chester();
            } else if (ROBOTNAME == "marina"){
                Marina();
            } else if (ROBOTNAME == "off"){
                break;
            }
        }
        
        rbtnm.close();
    }

    static void Marina(){
        System.out.println("MARINA RECORD");

        List<Integer> SRECORD = new ArrayList<>();
        List<Integer> ORECORD = new ArrayList<>();

        SRECORD.add(20); //WINS
        SRECORD.add(20); //LOSSES
        SRECORD.add(0); //TIES

        ORECORD.add(22); //WINS
        ORECORD.add(24); //LOSSES
        ORECORD.add(1); //TIES

        System.out.println(SRECORD);
        System.out.print(ORECORD);
    }

    static void Chester(){
        System.out.println("CHESTER RECORD");

        List<Integer> SRECORD = new ArrayList<>();
        List<Integer> ORECORD = new ArrayList<>();

        SRECORD.add(27); //WINS
        SRECORD.add(15); //LOSSES
        SRECORD.add(0); //TIES

        ORECORD.add(38); //WINS
        ORECORD.add(24); //LOSSES
        ORECORD.add(1); //TIES

        System.out.println(SRECORD);
        System.out.println(ORECORD);
    }
}
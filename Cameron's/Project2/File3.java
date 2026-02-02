//Project2 is the folder name that this file is in
package Project2;

//imports the Array List type that gives the code the ability to store values
import java.util.ArrayList;

//imports that Collections tools that gives the code the ability to do things to lists, like shuffle them
import java.util.Collections;

//imports the List type that gives the code the ability to store values
import java.util.List;

//import the Random type that gives the code the ability to make random values
import java.util.Random;

public class File3 {

    //creates list with integers called numbers that is in an array list
    public static List<Integer> numbers = new ArrayList<> ();

    //creates list with strings called alpha that is in an array list
    public static List<String> alpha = new ArrayList<> ();

    //creates list with strings called output that is in an array list
    public static List<String> output = new ArrayList<> ();

    //main method of the file, it is the method that can be run
    public static void main(String[] args) {

        //creates a varible that is random
        Random crazy = new Random();

        //makes a collection using the alpha list that has a-f in it
        Collections.addAll(alpha, "a", "b", "c", "d", "e", "f");

        //for loop that makes a value that takes 6 random values between 0-15
        //int i = 0; i < 6; i ++ states that i starts at 0 and if it is anything less than 6 add 1
        //this for loop loops until 6 random values are generated
        for(int i = 0; i < 6; i ++) {
            numbers.add(crazy.nextInt(16));
        }
        
        //for loop that takes the 6 values from number and checks them if they are greater than 9
        for (int i = 0; i < numbers.size(); i ++) {
           
            //currval is the value of i, so one of the 6 values from number
            int currval = numbers.get(i);

            //indxval is a different way of saying currval so that currval can be checked to see if it is 9
            int indxval;

            //this says that if the currval is greater than 9, it needs to minus 10
            if (currval > 9) {
                indxval = currval - 10;

                //the value of indxval is a string from the alpha list
                output.add(alpha.get(indxval));
            } else if (currval < 10){
                output.add(String.valueOf(currval));
            }

        }

        //for loop that takes the output
        for(int i = 0; i < output.size(); i ++){
            System.out.print(output.get(i) + " ");
        }

        System.out.println();

        //for loop that takes the 6 values from before and prints them with a space afterwards
        //int i = 0; i < numbers.size(); i ++ states that i starts at 0 and if it is anything less than the number size, which is 6, add 1
        //never prints more than 6 because number size is 6 so it prints number size and is done
        for(int i = 0; i < numbers.size(); i ++){
            System.out.print(numbers.get(i) + " ");
        }
    }

}

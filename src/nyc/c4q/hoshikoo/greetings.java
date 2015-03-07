package nyc.c4q.hoshikoo;

/**
 * Created by Hoshiko on 3/7/15.
 * Greetings helped by John Gomez
 * a program that responds to different greetings
 */
import java.util.Scanner;
public class greetings {

    public static void main(String[] args){
        Scanner input = new Scanner (System.in);

        System.out.println("Hello!");
        String response = input.nextLine();

        if (response.equals("Hello")){
            System.out.println("How are you?");
        }else if(response.equals("Hi")){
            System.out.println("How is it going?");
        }
        else{
            System.out.println("GoodBye!");
        }
    }
}

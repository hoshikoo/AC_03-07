package nyc.c4q.hoshikoo;

/**
 * Created by Hoshiko on 3/7/15.
 */
import java.util.Scanner;
public class Madlibs {

    public static void main(String[] args){

        Scanner input= new Scanner (System.in);

        System.out.println("Enter a noun:");
        String noun = input.nextLine();

        System.out.println("Enter an adverb:");
        String adV= input.nextLine();

        System.out.println("Enter a plural noun:");
        String noun2= input.nextLine();

        System.out.println("Enter an adjective:");
        String adj= input.nextLine();

        System.out.println("Enter another noun:");
        String noun3= input.nextLine();

        System.out.println("Enter another adjective:");
        String adj2= input.nextLine();

        System.out.println("Enter a number:");
        int num= input.nextInt();


        System.out.println("A "+ noun + " " + adV + " fell through the roof.  "+noun+" ! You broke all my "+ noun2 + "! said the " + noun3 + ". You "+ adj + " jerk! that makes me feel so " + adj2+ " That's "+ num +" times this week.");
    }
}

package nyc.c4q.hoshikoo;

/**
 * Created by Hoshiko on 3/7/15.
 */

import java.util.Scanner;
public class PolishNotationCalcultator {

    public static void main (String [] args){
        Scanner input = new Scanner (System.in);
        System.out.println("Please enter your fisrt number");
        int num1 = input.nextInt();
        System.out.println("Please enter your second number");
        int num2 = input.nextInt();
        System.out.println("Please enter an operator");
        String operator = input.next();

        if(operator.equals("+")){
            System.out.println(num1+num2);
        }else if(operator.equals("-")){
            System.out.println(num1-num2);
        }else if(operator.equals("/")){
            System.out.println(num1/num2);
        }else if(operator.equals("*")){
            System.out.println(num1*num2);
        }else if(operator.equals("%")){
            System.out.println(num1%num2);
        }else{
            System.out.println("your input was wrong");
        }
        
    }
}

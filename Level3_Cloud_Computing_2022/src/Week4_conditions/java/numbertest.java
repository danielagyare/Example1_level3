
package Week4_conditions.java;

import java.util.Scanner;


public class numbertest 
{
    static int number1, number2;
    public static void main(String[] D££)
    {
        //local variables
        Scanner kb=new Scanner(System.in);
        System.out.println("Enter number 1");
        number1=kb.nextInt();
        System.out.println("Enter number 2");
        number2=kb.nextInt();
        if(number1>number2)
        {
            System.out.println("Number1 is bigger");
        }
        else if(number2>number1)
        {
            System.out.println("Number2 is bigger");    
        }
        else
        {
            System.out.println("They are Equal!!");
        }
    }
    
}

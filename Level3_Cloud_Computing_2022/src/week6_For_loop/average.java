
package week6_For_loop;

import java.util.Scanner;

public class average 
{
    public static void main(String[] args)
    {
        Scanner MyScanner=new Scanner(System.in);
        
        int Numbers,Counter;
        double Value;
        double Sum=0.0;
        double Average=0.0;
        
        System.out.print("How many numbers?:");
        Numbers=MyScanner.nextInt();
        
        for (Counter=1;Counter<=Numbers;Counter++)
        {
            System.out.print("Give me a number:");
            Sum = Sum + MyScanner.nextDouble();
        }
        
        Average= Sum/Numbers;
        System.out.println("Average is "+Average);
    }
}

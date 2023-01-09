
import java.util.Scanner;


public class factorial 
{
     public static void main(String[] args)
    {
        Scanner kb=new Scanner(System.in);
        System.out.println("Enter your factorial number");
        int n=kb.nextInt();
        
        int m = 1;
        int f = 1;
        while (m <= n)
        {
            f = f * m;
            System.out.println("f: "+ f);
            m++;
        }
        System.out.println("F("+n+") = "+f);
    }
}

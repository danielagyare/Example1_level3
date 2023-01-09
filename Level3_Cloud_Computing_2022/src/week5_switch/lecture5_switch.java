package week5_switch;

import java.util.Scanner;

public class lecture5_switch 
{
    static int mark;
    static Scanner kb=new Scanner(System.in);
    public static void example1()
    {
    System.out.println("enter your grade:");
    mark=kb.nextInt();
    if(mark>=70)
    {
    System.out.println("First class");
    }
    else if(mark>=60)
    {
        System.out.println("2:1 class");
    }
    else if(mark>50)
    {
        System.out.println("2:2 class");
    }
    else if(mark>=40)
    {
        System.out.println("3rd class");
    }
    else if(mark>=35)
    {
        System.out.println("simple pass");
    }
    else if(mark<=34)
    {
        System.out.println("no pass");
    }
    else if(mark<=29)
    {
        System.out.println("no resit");
    }
    }
    
    
    public static void example2()
    {
        int number1, number2;
        System.out.println("enter first number");
        number1=kb.nextInt();
        System.out.println("enter second number");
        number2=kb.nextInt();
        if(number1>10)
        {
            if(number2>10)
            {
                System.out.println("both bigger than 10");
            }
        }
        else
        {
            System.out.println("number1<=10");
        }
    }
        
    
    public static void example3()
    {
        char option=' ';
        System.out.println("Press N,Q or P");
        option=kb.next().charAt(0);
        switch(option)
        {
            case 'Q':
                System.out.println("Quitting");
                break;
            case 'P':
                System.out.println("Printing file");
                break;
            case 'N':
                System.out.println("Starting new file");
                break;
            default:
                System.out.println("Unknown command - try again");
                break;
        }
    }
    public static void example4()
    {
        
    }        
    public static void menu()
    {
     int option=0;
        do{
       System.out.println("Select an option 1-3 or 4 to exit");
       option=kb.nextInt();
       switch(option)
       {
           case 1:
               example1();
               break;
           case 2:
               example2();
               break;
           case 3:
               example3();
               break;
           case 4:
               example4();
               break;
           case 5:
               System.out.println("thank you and good bye");
               break;
       }
    } while(option !=5);
    }
    public static void main(String[] args)
    {
      menu();  
    }}
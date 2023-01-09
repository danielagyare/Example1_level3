/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week0_Introduction;

import java.util.Scanner;

/**
 *
 * @author 2001791
 */
public class Introduction 
{
 public static void main(String[] args)
 {
     System.out.println("Welcome To Unit 4 Programming. Have fun!");// output
     //Variables
     String name="";
     int number1=0;
     int number2=0;
     int total=0;
     Scanner kb=new Scanner(System.in);
     //process
     System.out.println("Enter your name");
      name=kb.next();
     
     System.out.println("Hello " +name);
     System.out.println("Enter first number");
     number1=kb.nextInt();
     System.out.println("Enter second number");
     number2=kb.nextInt();
     total=number1+number2;
     
     
     // outcome
     System.out.println(" well done "+name+ " your total is= " +total);
     System.out.println("Thank you");
 }
}

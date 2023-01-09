
package week6_For_loop;


public class Lecture6_for_loop 
{
    public static void example2()
    {
        for(int launch=10; launch>0; launch--)
        {
           System.out.println("count: "+launch);
        }
        System.out.println("Fly Like Birdie!!!");
    }
    public static void example1()
    {
        //local variable
        int people;
        for(people=0; people<=1000; people++)
        {
            System.out.println("people ="+people);
        }
    }
    public static void main(String[] args)
    {
        example2();
    }
}

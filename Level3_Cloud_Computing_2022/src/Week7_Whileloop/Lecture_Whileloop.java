
package Week7_Whileloop;


public class Lecture_Whileloop 
{
   public static void main(String[] args)
   {
       for(int i=0;i<10;i++)
       {
           System.out.println("count:"+(i+1));
       }
       System.out.println("Demo while loop");
       
       int count=0;
       while(count<10)
       {
           System.out.println("count:"+count);
           count++;
       }
       System.out.println("do while loop");
       
       int start=1;
       
       do
       {
           System.out.println("start: "+start);
           start++;
       }while(start<5);
       System.out.println("lecture example 1");
       int x=10;
       int times=0;
       while(x<100)
       {
           System.out.println("5-times"+times);
           times++;
           x=x+15;
       }
   } 
}

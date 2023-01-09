
package week2_variable_pt2;


public class lecture2 
{
 public static void main(String[] args)
 {
     //types integers
     int number=0;  //32
     short number2=0;//16
     long number3=0;//64
     byte number4=0;// 8
     number=30;
     System.out.println("number"+number);
     //type decimals number
     float number5=4.5f;//32
     double number6=5.5d;//64
     //type character
     char mychar='f';//32
     /////boolean//////////////
     int count=0;
     while(count<=12)
     {
        System.out.println("loop:"+count+"total"+(count*2));
        count=count+1;        
     }
     
     //bolean expression
     int age=21;
     boolean underAge;
     
     if(age<=18)
     {
          underAge=true;
          System.out.println("UnderAge"+underAge);
     }
     age=18;
     underAge=(age<=18);
     System.out.println("UnderAge"+underAge);
     //casting
     int a=5;
     float b=6.8f;
     int total=a+(int)b;
     System.out.println("total="+total);
     char mc='a';
     total=mc+10;
     System.out.println("mc="+mc+"total="+total);
     char nc=(char)(total+10);
     System.out.println("nc="+nc);
     //logical operators
     int n=9;
     int m=10;
     boolean aTest=(n<10 || m<11);
      System.out.println("aTest= "+ aTest);
 }
}

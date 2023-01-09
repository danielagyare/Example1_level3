
package Week9_array_OD;


public class Lecture9_array 
{
    public static void main(String[] args)
    {
        int numbers[]=new int[8];
        numbers[0]=20;
        numbers[1]=2;
        numbers[2]=100;
        numbers[3]=1;
        numbers[4]=30;
        numbers[5]=420;
        numbers[6]=69;
        numbers[7]=400;
        System.out.println("length= "+ numbers.length);
        System.out.println("index 2 "+ numbers[2] );
        numbers[2]= 30*2;
        System.out.println("index 2 "+ numbers[2] );
        numbers[0]= numbers[1]+numbers[4];
        System.out.println("index 0 "+ numbers[0]);
        
        String names[]={"leo","john","kimini","hule","donut","helen","jo"}
                System.out.println("length="+names.length);
                names[0]=names[0]+" is a lecturer";
                System.out.println(names[0]);
                for(int i=0;i<names.length;i++)
                {
                    System.out.println("index");
                }
    }
}

package Week8_StringBuffer;


public class Lecture8_stringBuffer 
{
    public static void methodnoreturn()
    {
        System.out.println("this is an example of no return method");
    }
    public static int sum(int a, int b)
    {
        return a+b;
    }
    public static double multiplication(double a, int b, int c)
    {
        double total=a*b*c;
        return total;
    }
    public static String pad(String base,int n, char c)
    {
        while(base.length()<n)
        {
            base=base+c;
        }
        
        return base;
    }
    public static int timesChsrOccurs(String base, char n)
    {
        int time=0;
        for(int i=0;i<base.length();i++)
        {
            if(base.charAt(i)==n)
            {
                time=time+1;
            }
        }
        return time;
    }
    public static void main(String[] args)
    {
        /// reference type
        String name="Daniel Agyare";
        String name2=(" Helen Martin");
        System.out.println(name);
        System.out.println(name2);
        System.out.println(name +" and" + name2+ " are lecturers");
        name.charAt(5);
        System.out.println("length: "+ name.length());
        
        int total=sum(30,40);
        System.out.println("total="+total);
        
        double total2=multiplication(2.5,4,6);
        System.out.println("Total2="+total2);
        
        String example=pad(name,20,'x');
        System.out.println("example "+example);
        System.out.println(tinmesCharOccurs("abcaabcaadeaaa",'a'));
        
        System.out.println("+++++++StringBuffer*************");
        StringBuffer name3=new StringBuffer("trafford college");
        System.out.println(name3);
        System.out.println("name3 length ="+name3.length());
        name3.append(" campus s")
    }
}


package week3_objects;


public class Person 
{   //attributes
   String name;
   int age;
   char gender;
   static int counter=0;
   //constructor
   public Person()
   {
       System.out.println("new object person");
       counter++;
       System.out.println("counter"+counter);
   }
   public void setName(String an)
   {
       this.name=an;
   }
   public String getName()
   {
     return this.name;
   }
   public void setAge(int A)
   {
       this.age=A;
   }
   public int getAge()
   {
       return this.age;
   }
   public void setGender(char G)
   {
       this.gender=G;
   }
   public char getGender()
   {
       return this.gender;
   }
   public void showInf()
   {
       System.out.println("Name:" + this.name + 
               "age: " + this.age+
               "gender: " + this.gender);
   }
   
}

public class Q1 {
   /*1. Write a Java programme using the following steps.
1.1 Declare two instance variables.
1.2 Declare one instance method.
1.3 Call both instance variables into the instance method inside the print statement.
1.4 Declare the Main method.
1.5 Call the above instance method into the Main method and run the programme.
 */
   int a= 12; //declare instance variable
    int b=13;// declare instance variable
 public static void main(String []args){//main method
     Q1 t = new Q1();// created object for Call instance method into the Main method
     t.instmethod();//run the programme

 }
   public void instmethod(){// declare instance method
       System.out.println(a);//Call a instance variables into the instance method inside the print statement
       System.out.println(b);//Call b instance variables into the instance method inside the print statement

   }

}

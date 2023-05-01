public class Q17 {
 /*17. Write a Java Program using below steps.
 17.1 Declare your city as instance variables.
 17.2 Declare your country as static variables.
 17.3 Declare one instance method and call static variable in print statement
 17.4 Declare static method and call instance variable in print Statement.
 17.5 Call both user defined methods into main method.
  */

   String city = "London";//Declare your city as instance variables.
   static String country ="UK";//Declare your country as static variables.
 public static void main(String[]args){//main method
     Q17 t6 = new Q17();//object created
     t6.test4();
     test5();
 }
    public void test4(){//Declare one instance method and call static variable in print statement
        System.out.println(city);
    }
 public static void test5(){//Declare one static method and call instance variable in print statement
        System.out.println(country);
 }


}

public class Q20 {
    /*
    20. Write a Java Program using below steps.
    20.1 Declare your holidays country  as static variable.
    20.2 Declare your homeCountry as instance variable.
    20.3 Declare instance method name homeCountry()and call static variable.
    20.4 Declare static method name holidays() and call instance variable
    20.5 Call both methods in main method.

     */

 static String countryname1 = "spain";//Declare your  country  as static variable.
 String countryname2 = "united kingdom";//Declare your Country as instance variable.
 public static void main (String[]args){//declare main method
     Q20 t10= new Q20();//Call both methods in main method.
     t10.homeountry();
     holidays();
 }
 public void homeountry(){//Declare instance method name homeCountry()and call static variable.
     System.out.println(countryname1);
 }
 public static void holidays(){//Declare static method name holidays() and call instance variable
     Q20 t9 = new Q20();
      System.out.println(t9.countryname2);
 }

}

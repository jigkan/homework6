public class Q19 {
    /*
 19. Write a Java Program using below steps.
 19.1 Declare one of your group member names as instance variable.
 19.2 Declare one of your group member names as static variable.
 19.3 Declare one instance method name with group name (e.g. selenium())and call both global  variables.
 19.4 Declare static method name agile() and call both variable
 19.5 Call both user defined methods into main method.
Note: Declare 1 local variables in all user defined method and main method and print in to statement

     */
    String name1  = "Mahesh";//Declare one of your group member names as instance variable.
    static String  name2= " Hemi"; //Declare one of your group member names as static variable.
     public static void main(String [ ]args){
       Q19 t8 = new Q19();//Call both user defined methods into main method.
       t8.selenium();
        agile();
        int c= 15;//Declare 1 local variables in all user defined method and main method and print in to statement
         System.out.println(c);
    }

    public void selenium(){//Declare one instance method name with group name (e.g. selenium())and call both global  variables.

         System.out.println(name1);
         System.out.println(name2);
        int a = 13;//Declare 1 local variables in all user defined method and main method and print in to statement
        System.out.println(a);
    }
    static void agile(){//Declare static method name agile() and call both variable

         Q19 t7 = new Q19();
        System.out.println(t7.name1);
        System.out.println(name2);
        int b =14;//Declare 1 local variables in all user defined method and main method and print in to statement
        System.out.println(b);

    }
}

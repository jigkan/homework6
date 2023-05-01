public class Q18 {

    /*    18. Write a Java Program using below steps.
          18.1 Declare your council name as static variables.
           18.2 Declare your house number as instance var iables.
           18.3 Declare one instance method name borough() and call Static variable
           18.4 Declare static method name address() and call instance variable
           18.5 Call both user defined methods into main method.

     */
    static String councilname = " Ealing";//Declare your council name as static variables.
    int houseNumber = 18;//Declare your house number as instance variables.
    public static void main (String []args){//main method.
    Q18 t1= new Q18();// call instance method
        t1.borough();
        Address();//call static method

    }
    public void borough(){// declare instance method
        System.out.println("Council Name - " + councilname );
            }
            public static void Address(){ // declare static method
        Q18 t= new Q18();
        System.out.println("house number - " + t.houseNumber );
            }

}



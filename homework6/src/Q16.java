public class Q16 {
   /*
   16. Write a Java Program to print as below. (All details to be stored in variable)
    "+------------------------+"
"| |"
"| CORNER STORE |"
"| |"
"| 2015-03-29 04:38PM |"
"| |"
"| Gallons: 10.870 |"
"| Price/gallon: $ 2.89 |"
"| |"
"| Fuel total: $ 22.71 |"
"| |"
"+------------------------+"

        */
    public static void main(String[]args){

         String line = ("+------------------------+");
        String  linedouble = "| |";
        String Store = "| CORNER STORE |";
        String time = "| 2015-03-29 04:38PM | ";
        String Gallons = "| GAllons: 10.870 |";
        String price = "| Price/gallon: $ 2.89 |";
        String fuel = "| Fuel total: $ 22.71 |";

          System.out.println(line);
          System.out.println(linedouble);
          System.out.println(Store);
          System.out.println(linedouble);
           System.out.println(time);
        System.out.println(linedouble);
        System.out.println(Gallons);
        System.out.println(price);
        System.out.println(linedouble);
        System.out.println(fuel);
        System.out.println(linedouble);
        System.out.println(line);
    }

}

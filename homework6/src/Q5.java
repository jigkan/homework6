public class Q5 {

    /*
Write a program for a calculator with addition, subtraction, multiplication, and division methods all with parameters
and use string concatenation methods. (Note: Two static  and Two instance methods.)
     */
    static int  num1 = 100;// declare num1 static variable
    static int num2= 50;//declare num2 static variable

    public static void main(String [] args){//main method
     addition();
     subtraction();
     Q5 m = new Q5();
     m.multiplication();
     Q5 d = new Q5();
     d.division();
    }
    public static void addition(){//static method
        int sum = num1+num2;
        System.out.println("Addition of " + num1+ " + " +num2+ " = " +sum);
    }
   public static  void subtraction(){//static method
       int sub = num1-num2;
       System.out.println("Subtraction of " + num1+ " - " +num2+ " = " +sub);
   }

    public void multiplication(){// instance method
        int mul = num1*num2;
        System.out.println("Multiplication of " + num1+ " * " +num2+ " = " +mul);
    }

    public void division(){// instance method
        int div = num1/num2;
        System.out.println("Division of " + num1+ " / " +num2+ " = " +div);
    }







}

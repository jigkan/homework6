public class Q4 {
    /*4. Write a Java programme using the following steps.
    4.1 Declare two instance and two static variables.
    4.2 Declare one instance method.
    4.3 Declare one static method.
    4.4 Call all four instance and static variables into both instance and static methods inside the  print statement.
    4.5 Declare the Main method.
    4.6 Call both instance and static methods into the Main method and run the programme.  */

    int a= 12;//Declare instance static variables a
    int b=3;//Declare instance static variables b
    static int c = 23;//Declare static variables c
    static int d = 44;//Declare static variables d
    public static void main (String []args){//Declare the Main method.
        Q4 t = new Q4();
        t.test3();
        test4();

    }
    public void test3(){// declare instance method
        System.out.println(a);//Call  instance variables a into  instance  methods inside the  print statement.
        System.out.println(b);//Call  instance variables b into  instance  methods inside the  print statement.
        System.out.println(c);//call static variables c into  instance methods inside the  print statement.
        System.out.println(d);//call static variables d into  instance methods inside the  print statement.
    }
    public static void test4(){// declare static method
        Q4 t1= new Q4();
        System.out.println(t1.a);//Call  instance  variables a into  static methods inside the  print statement.
         Q4 t2 = new Q4();
          System.out.println(t2.b);//Call  instance  variables b into  static methods inside the  print statement.
        System.out.println(c);//Call  static variables c into  static methods inside the  print statement.
        System.out.println(d);//Call  static variables b into  static methods inside the  print statement
    }



}

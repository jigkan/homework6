public class Q3 {
    /*3. Write a Java programme using the following steps.
       3.1 Declare one instance and one static variable.
        3.2 Declare one instance method.
        3.3 Declare one static method.
        3.4 Call both instance and static variables into both instance and static methods inside the  print statement.
        3.5 Declare the Main method.
       3.6 Call both instance and static methods into the Main method and run the programme.
*/
    int a = 12;//Declare one instance
    static int b = 20;//Declare one static variable
    public static void main (String[] args){//declare main method
     Q3 t = new Q3();// object created
        t.test2();
        test();
    }

    public static void test(){//declare static method
        Q3 t = new Q3();//object create
        System.out.println(t.a);//instance variables a into static methods inside the  print statement
        System.out.println(b);//static variables b into static methods inside the  print statement
    }
    public void test2(){//declare instance method
        System.out.println(a);//instance  variables a into static methods inside the  print statement
        System.out.println(b);//static   variables b into static methods inside the  print statement
    }
}

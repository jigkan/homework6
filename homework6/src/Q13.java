public class Q13 {
 // 13. Write a Java program to print the area and perimeter of a rectangle.
    //Test Data:
    //Width = 5.6 Height = 8.5
    //Expected Output:
    //Area is 5.6 * 8.5 = 47.60
    //Perimeter is 2 * (5.6 + 8.5) = 28.20
    public static void main (String[]args){
        double width =5.6;// declare width variable
        double height =8.5;// declare height variable
        double a = width * height; // declare a variable
        double b = 2*(width+height);// declare b variable
        System.out.println("Area is 5.6 * 8.5 = " +a );
        System.out.println("Perimeter is 2 * (5.6 + 8.5) = " +b);



    }
}

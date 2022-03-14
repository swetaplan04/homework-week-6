package homeworkweek6;
/*14. Write a Java program to print the area and perimeter of a rectangle.
Test Data:
Width = 5.5 Height = 8.5
 Expected Output:
Area is 5.6 * 8.5 = 47.60
Perimeter is 2 * (5.6 + 8.5) = 28.20
 */

import java.util.Scanner;


public class Program14_PrintArePerimeter {
    public static void main(String[] args) {
        rectangle();

    }

    public static void rectangle() {

        double Width;
        double Height;
        double Area;
        double perimeter;
        System.out.println("pleasen enter the width:");
        Scanner s = new Scanner(System.in);
        Width = s.nextDouble();
        System.out.println("please enter the height");
        Height = s.nextDouble();

        Area = Width * Height;
        perimeter = 2 * (Width);

        System.out.println("Area is 5.6* 8.5 =" + Area);
        System.out.println("perimeter is 2 * (5.6 +8.5)= " + perimeter);
    }
}

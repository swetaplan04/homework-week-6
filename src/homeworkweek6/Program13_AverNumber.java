package homeworkweek6;
/*13. Write a Java program that takes three numbers as input to calculate and
      print the average of the numbers.
 */

import java.util.Scanner;

public class Program13_AverNumber {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Input the first number: ");
        double x = in.nextDouble();
        System.out.print("Input the second number: ");
        double y = in.nextDouble();
        System.out.print("Input the third number: ");
        double z = in.nextDouble();
        System.out.print("The average value is " + average(x, y, z) + "\n");
    }


    public static double average(double x, double y, double z) {
        return (x + y + z) / 3;
    }

}

package homeworkweek6;
/*6. Write a program to enter any radius value of the circle and find out the
area.(Formula of Area A=PI*r*r).
*/

import java.util.Scanner;

public class Program6_RadiusCircle {

    public static void main(String ag[]) {
            int rad;
            double pie = 3.14, ar;
            Scanner s = new Scanner(System.in);
            System.out.print("Enter radius of circle:");
            rad = s.nextInt();
            ar = pie * rad * rad;
            System.out.println("Area of circle:" + ar);
        }
    }


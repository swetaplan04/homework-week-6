package homeworkweek6;
/*15. Write a Java program to swap two variables.
 */

public class Program15_SwapTwoVriable {

    public static void main(String[] args)
        {
            int temp;
            int x = 100;
            int y = 200;

            //Swapping in steps
            temp = x;
            x = y;
            y = temp;

            //Verify swapped values
            System.out.println("x = " + x + " and y = " + y);
        }
    }


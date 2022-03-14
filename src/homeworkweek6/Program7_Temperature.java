package homeworkweek6;
/*7. Write a program to insert any temperature value in degree Fahrenheit and
convert to degree Celsius ((F − 32) × 5/9 = 0°C).
*/

public class Program7_Temperature {

    public static void main (String [] args)
        {
            float Fahrenheit, Celsius;
            Fahrenheit = 43;
            Celsius  = ((Fahrenheit-32)*5)/9;
            System.out.println("Temperature in celsius is: "+Celsius);
        }
}



package homeworkweek6;
/*1. Write a Java programme using the following steps.
1.1 Declare two instance variables.
1.2 Declare one instance method.
1.3 Call both instance variables into the instance method inside the print statement.
1.4 Declare the Main method.
1.5 Call the above instance method into the Main method and Run the programme.
*/


public class Program1 {

    int a = 40; // instance variable
    int b = 50; // instance variable


    public static void main(String[] args) {
        Program1 s = new Program1();
        s.Test1();


    }

    public void Test1() { // Instance method
        System.out.println(a);
        System.out.println(b);

    }

    public void Test2() { // Instance method
        Program1 s = new Program1();
        System.out.println(s.a);
        System.out.println(s.b);


    }
}
package homeworkweek6;
/*4. Write a Java programme using the following steps.
4.1 Declare two instance and two static variables.
4.2 Declare one instance method.
4.3 Declare one static method.
4.4 Call all four instance and static variables into both instance and static methods inside the
print statement.
4.5 Declare the Main method.
4.6 Call both instance and static methods into the Main method and run the programme.
*/

public class Program4 {


    int a = 30; // instance variable
    int b = 40; // instance variable
    static String name = "Sweta"; // static variable
    static String Surname = "Patel"; // static variable

    public static void main(String[] args) {
        Program4 s = new Program4();
        s.Test1();
        Test2();

    }
        public void Test1 () { // Instance method
            System.out.println(a);
            System.out.println(b);
            System.out.println(Program4.name);
            System.out.println(Program4.Surname);
        }

        public static void Test2() { // static method
            Program4 s = new Program4();
            System.out.println(s.a);
            System.out.println(s.b);
            System.out.println(name);
            System.out.println(Surname);


        }

    }





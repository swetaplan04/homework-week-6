package homeworkweek6;
/*3. Write a Java programme using the following steps.
3.1 Declare one instance and one static variable.
3.2 Declare one instance method.
3.3 Declare one static method.
3.4 Call both instance and static variables into both instance and static methods inside the
print statement.
3.5 Declare the Main method.
3.6 Call both instance and static methods into the Main method and run the programme.
*/

public class Program3 {

    int a = 100; // instnce variable
    static String name = "Sweta"; // static variable


    public void Test1() {
        System.out.println(a);
        System.out.println(Program3.name);

    }

    public static void test2() { // Static method
        Program3 t = new Program3();
        System.out.println(t.a);
        System.out.println(name);


    }

    // main method
    public static void main(String[] args) {
        Program3 t = new Program3();
        t.Test1();
        test2();


    }
}

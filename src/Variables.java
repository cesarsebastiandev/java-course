public class Variables {
    //Variable = a reusable container for a value, a variable behaves as if was the value  it contains

    //Primitive = simple value stored directly in memory (stack)
    //Reference = memory address (stack) that points to the (heap)

    //Primitive vs Reference
    //---------    ---------
    //int           string
    //double        array
    //char          object
    //boolean

    //2 steps to creating a variable
    //-------------------------
    //1. declaration
    //2. assignment

    public void printInfo() {
        int age = 26;
        int year = 1980;
        int month = 1;

        double price = 55.66;
        double gpa = 3.5;
        double temperature = -13.6;
        double humidity = 22.5;
        double salary = 3455.78;

        char gender = 'M';
        char grade = 'A';

        boolean isStudent = false;
        boolean isTeacher = true;
        boolean isMarriage = false;

        String name = "Cesar Sebastian";
        String nickname = "Cesseb";

        //Other examples
        byte podium = 3;
        short s = 12;
        float percentage = 9.5f;
        long million = 100000;



        System.out.println("Your age is: " + age);
        System.out.println("The year is: " + year);
        System.out.println("The month is: " + month);
        System.out.println("-------------------------");
        System.out.println("The price is: " + price);
        System.out.println("The gpa is: " + gpa);
        System.out.println("The temperature is: " + temperature);
        System.out.println("The humidity is: " + humidity);
        System.out.println("The salary is: " + salary);
        System.out.println("-------------------------");
        System.out.println("The gender is: " + gender);
        System.out.println("The grade is: " + grade);
        System.out.println("-------------------------");
        System.out.println("Is it student? " + isStudent);
        System.out.println("Is it teacher? " + isTeacher);
        System.out.println("Is it marriage? " + isMarriage);
        System.out.println("-------------------------");
        System.out.println("I'm " + name);
        System.out.println("My nickname is " + nickname);



    }


}

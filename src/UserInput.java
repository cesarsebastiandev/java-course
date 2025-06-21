import java.util.Scanner;

public class UserInput {

    public void showInfo(){
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your name:");
        String name = input.nextLine();
        System.out.println("Enter your age:");
        int age = input.nextInt();
        System.out.println("Hello, I'm " + name + " and I'm " + age + " years old.");

    }
}

import java.util.Scanner;

public class Exercise2_9{
    public static void main(String[] args){
        // Initialize the Scanner Object.
        Scanner input = new Scanner(System.in);
        // Get the user input.
        System.out.println("Enter v0, v1, and t: ");
        double v0 = input.nextDouble();
        double v1 = input.nextDouble();
        double t = input.nextDouble();

        double average_acceleration = ((v1 - v0) / t);

        System.out.println("The average acceleration is " + average_acceleration);
    }
}
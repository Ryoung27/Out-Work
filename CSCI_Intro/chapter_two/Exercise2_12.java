import java.util.Scanner;

public class Exercise2_12{
    public static void main(String[] args){
        // Create a scanner object.
        Scanner input = new Scanner(System.in);

        // Enter
        System.out.print("Please enter the velocity in meters per second: ");
        double velocity = input.nextDouble();

        System.out.print("Please enter the acceleration in meters per second: ");
        double acceleration = input.nextDouble();

        double length = (velocity * velocity) / (2 * acceleration);

        System.out.println("The minimum runway length of this airplane is " + length);
    }
}
//Scanner is in the java utils package.
import java.util.Scanner;

public class ComputeArea{
    public static void main(String[] args){
        //Create a scanner Object.
        Scanner input = new Scanner(System.in);

        //Prompt the user or an input.
        System.out.println("Please enter a number for radius: ");
        double radius = input.nextDouble();

        // Compute the area.
        double area = radius * radius * 3.14159;

        // Return the results.
        System.out.print("The area for the circle of radius " + radius + " is " + area);
    }
}
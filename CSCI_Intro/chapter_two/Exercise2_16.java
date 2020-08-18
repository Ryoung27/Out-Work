import java.util.Scanner;

public class Exercise2_16{
    public static void main(String[] args){
        // Create a scanner object.
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter the length of the side of a hexagon:  ");

        double s = input.nextDouble();

        double formula = (3 * Math.pow(3, 0.5) / 2) * (s * s);

        System.out.println("The area of the hexagon is: " + formula);

    }
}
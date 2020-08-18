import java.util.Scanner;

public class Exercise2_15{
    public static void main(String[] args){
        // Create a scanner object.
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter a value for x1 and y1:  ");

        double x1 = input.nextDouble();
        double y1 = input.nextDouble();

        System.out.println("Please enter a value for x2 and y2:  ");

        double x2 = input.nextDouble();
        double y2 = input.nextDouble();

        double results_before_square_root = ((x2 - x1) * (x2 - x1)) +((y2 - y1) * (y2 - y1));

        double answer = Math.pow(results_before_square_root, 0.5);

        System.out.println("The distances between the two points is: " + answer);
    }
}
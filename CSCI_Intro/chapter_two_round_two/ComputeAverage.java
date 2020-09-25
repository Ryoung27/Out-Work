import java.util.Scanner; // import the java.util package to use Scanner.

public class ComputeAverage{
    public static void main(String[] args){
        //Create a Scanner Object
        Scanner input = new Scanner(System.in);
        //Prompt the user to enter three numbers.
        System.out.print("Please enter three numbers. ");
        double number1 = input.nextDouble();
        double number2 = input.nextDouble();
        double number3 = input.nextDouble();

        //Compute Average
        double average = (number1 + number2 + number3) / 3;

        //Display results
        System.out.println("The average of " + number1 + " " + number2 + " " + number3 + " is " + average);
    }
}
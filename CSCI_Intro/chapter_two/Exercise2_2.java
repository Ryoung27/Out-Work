import java.util.Scanner;

public class Exercise2_2{
    public static void main(String[] args){
        final double PI = 3.14159; //Declare a constant
        Scanner input = new Scanner(System.in);

        //Prompt the user for a radius.
        System.out.print("Please enter a radius: ");
        double radius = input.nextDouble();

        //Prompt the user for a cylinder.
        System.out.print("Please enter the length of a cylinder: ");
        double cylinder_length = input.nextDouble();

        double area = radius * radius * PI;

        double volume = area * cylinder_length;

        //Return to the user the area.
        System.out.println("The area of the clyinder is " + area);

        //Return to the user the volume.
        System.out.println("The volume of the clyinder is " + volume);
    }
}
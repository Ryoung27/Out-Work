import java.util.Scanner;

public class InputTypes{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        //Byte Value.
        System.out.print("Enter a byte value.");
        byte byteVAlue = input.nextByte();

        //Short Value
        System.out.print("Enter a short value.");
        short shortValue = input.nextShort();

        //Int Value
        System.out.print("Enter an int value.");
        int intValue = input.nextInt();

        //Long Value
        System.out.print("Enter a long value.");
        long longValue = input.nextLong();

        //Float Value
        System.out.print("Enter a float value.");
        float floatValue = input.nextFloat();
    }
}
public class TestPassByValue{
    public static void main(String[] args){
        int num1 = 1;
        int num2 = 2;

        System.out.println("Before invoking the swap method, num1 is " + num1 + " and num2 is " + num2);

        swap(num1, num2);

        System.out.println("After invoking the swap method, num1 is " + num1 + " and num2 is " + num2);
    }

    public static void swap(int num1, int num2){
        int temp = num1;
        num1 = num2;
        num2 = temp;
        // The values are local, so they don't impact the global values.
        System.out.println("\t\t After swapping, n1 is " + num1 + " and n2 is " + num2);
    }
}
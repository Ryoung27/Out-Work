public class Increment{
    public static void main(String[] args){
        int x = 1;
        System.out.println("The current value of x " + x);
        increment(x);
        System.out.println("Back out of the method " + x);
        increment(x);
        System.out.println("Decrementing in Main: ");
        decrement(x);
    }

    public static void increment(int x){
        x++;
        System.out.println("x inside the method is " + x);
        System.out.println("Decrement inside of increment method");
        decrement(x);
    }

    public static void decrement(int x){
        x--;
        System.out.println("decrementing x: " + x);
    }
}
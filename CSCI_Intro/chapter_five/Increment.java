public class Increment{
    public static void main(String[] args){
        int x = 1;
        System.out.println("Before the call the value of x is " + x);
        increment(x);
        System.out.println("The value after the call is " + x);
    }

    public static void increment(int n){
        n++;
        System.out.println("The value of n in the method is " + n);
    }
}
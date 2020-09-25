
/**
 * Description: Fist assignment for (CSCI 231) Object-Oriented Programming (Fall 2020)
 *
 * @author: Ronnie Young
 * @version 08.17.20
 * Submission Reciept: dc5af270-8023-41c5-b7a6-261f633941e7.
 */

/* 6. Change the statement "System to system", then compile again. What happens?
Why?
Package "system" does not exist. This means that the package name "System" exists,
but the package name "system" does not. Due to casing "System" and "system" are
two different things.
 */

/*7. Break the line of code .
System.out.println("Hello, World!");
To
System.out.println("Hello,
World!");
What happens?
 * BlueJ will not let me save the file and I get the error "Unclosed string literal.
 * The complier is trying to recognize this as another line, since it is, but it not
 * a line that is recognized, so I get an error.
 */

/*8. Change the statement "
 * System.out.println " to "System.out.print", what happens?
 * The statements get printed on the same line, and if you remove both the program
 * ends on the same line.
 * Println essentially creates a new line at the end of the print statement,
 * print does not.
 */
public class Ronnie_Young_Project01
{
    public static void main(String[] args){

        System.out.println("Hello,World!");

        System.out.println("This is my first Java Program");



        System.out.println("Java " + 1 + 2 + 3);
        System.out.println((char)4);
        System.out.println("peter".compareToIgnoreCase("Peter"));

        char c = 'd';
        System.out.println(c);

        System.out.println(Math.sqrt(4));

        System.out.println("No pain,\n\t no gain.");

        int x = 2;

        if(x % 2 == 0){
            System.out.println("EVEN");
        }
        else{
            System.out.println("ODD");
        }
    }
}

/*
 * Description: Sixth Assignment:
The	purpose	of	this	project	is	to	reinforce	the	knowledge	from	Chapter	Six	of	the	textbook.	The
students	are	required	to	write	the	following	two	overloaded	methods:
1. public	static	int	countLetters(String	s)	which	count	the	number	of	English	letters	in	given
String	s.
2. public	static	int	countLetters(String	s,	char	c)	which	count	the	number	of	English	letter	c
(not	case	sensitive)	in	given	String	s.	If	c	is	not	an	English	letter,	returns	-1.
 *
 * @author: Ronnie Young
 * @version 09.30.20
 */

import java.util.Scanner; // import scanner package

public class Ronnie_Young_Project6 {
    public static void main(String[] args){
        // Create a Scanner Object
        Scanner input = new Scanner(System.in);

        char answer, character;
        String string;

        do {
            System.out.println("Please enter a string");
            string = input.nextLine();

            System.out.println("Please enter a character");
            character = input.next().charAt(0);

            System.out.println("The result of calling function int countLetters(String s) :" + countLetters(string));

            System.out.println("The result of calling function int countLetters(String s, char) is: " + countLetters(string, character));

            System.out.println("Do you want to do another test? (Y/N):");
            answer = input.next().charAt(0);
        } while(answer == 'Y' || answer == 'y');
    }

    public static int countLetters(String s){
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (Character.isLetter(s.charAt(i)))
                count++;
        }
        return count;
    }

    public static int countLetters(String s, char c){
        int count = 0;
        if (Character.isLetter(c)){
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == c || s.charAt(i) == Character.toUpperCase(c) || s.charAt(i) == Character.toLowerCase(c) )
                    count++;
            }
            return count;
        }
        else{
            return - 1;
        }
    }

}
/*
Purpose:	The	purpose	for	this	project	is	to	reinforce	the	knowledge	from	Chapter	10	of	the	textbook.
The	students	will	learn	how	to	write	a	user	defined	class.
Project	Objectives:
1. Apply	UML	design	on	user	defined	class
2. Write	overloaded	constructors	of	a	class
3. Write	customer	methods	of	the	class	(Other	than	get	and	set	methods)
Problem	description:
The	String	class	is	provided	by	java	library.	Write	your	own	String	class	based	on	the	following	UML
diagram.	No	built-in	String,	StringBuffer	related	classes	are	allowed.
 *
 * @author: Ronnie Young
 * @version 11.02.20
 */

 public class Ronnie_Young_Project10{
    public static void main(String[] args){
	/** Main method */
		// Create to char arrays
		char[] test = {'T', 'e', 's', 'T'};
        char[] test2 = {'T', 'e', 's', 'T', '2'};

        // Create two MyString objects
        // MyString(chars: char[])
		MyString string = new MyString(test);
        MyString string2 = new MyString(test2);
        MyString string3 = new MyString(test2);

        // Test charAt()
        // charAt(i:int):char
		System.out.print("\nCharacter at index 3 of string: "
            + string.charAt(3));

        System.out.print("\nCharacter at index 0 of string (second test): "
			+ string2.charAt(3));

        // Test the length of string
        // length():int
        System.out.print("\nLength of MyString: " + string.length());

        System.out.print("\nLength of MyString (second test): " + string2.length());


        // Test substring
        // substring(begin:int, end:int):MyString
		System.out.print("\nSubstring from index 0 to 3 of MyString: ");
		MyString substr = string.substring(0,3);
		for (int i = 0; i < substr.length(); i++) {
			System.out.print(substr.charAt(i));
        }
		System.out.print("\nSubstring from index 0 to 4 of MyString (second test): ");
		MyString substr2 = string2.substring(0,4);
		for (int i = 0; i < substr2.length(); i++) {
			System.out.print(substr2.charAt(i));
		}

        // Test string as lowercase:"
        // toLowerCase():MyString
		System.out.print("\nMyString to lowercase: ");
		MyString lower = string.toLowerCase();
		for (int i = 0; i < lower.length(); i++) {
			System.out.print(lower.charAt(i));
        }

		System.out.print("\nMyString to lowercase (second test): ");
		MyString lower2 = string2.toLowerCase();
		for (int i = 0; i < lower.length(); i++) {
			System.out.print(lower.charAt(i));
		}

        // Test if string is equal to string1
        // equals(other:MyString):Boolean
		System.out.print("\nString is equal to string2: "
            + string.equals(string2));

            System.out.print("\nString is equal to string2 (second test, should return true): "
			+ string2.equals(string3));

        // Test the integer 20 as a string object
        // valueOf(i:int):MyString
		System.out.print("\nDisplay the integer 20 as a MyString object: ");
		MyString value = string.valueOf(20);
		for (int i = 0; i < value.length(); i++) {
			System.out.print(value.charAt(i));
        }

		System.out.print("\nDisplay the integer 120 as a MyString object: ");
		MyString value2 = string2.valueOf(120);
		for (int i = 0; i < value2.length(); i++) {
			System.out.print(value2.charAt(i));
		}
    }
}
class MyString{
    private char[] string;
    private int stringLength;

    //  +MyString(chars: char[])
    public MyString(char[] chars){
        stringLength = chars.length;
		string = new char[stringLength];
		for(int i = 0; i < stringLength; i++){
            string[i] = chars[i];
		}
    }

    // +charAt(i: int) : char
    public char charAt(int i){
        return string[i];
    }

    // +length():int
    public int length(){
        return stringLength;
    }

    // +substring(begin: int, end: int) : MyString
    public MyString substring(int begin, int end){
        int subLength = end - begin;
		int count = 0;
		char[] sub = new char[subLength];

        for(int j = begin; j < end; j++){
            sub[count] = string[j];
            count++;
        }

		return new MyString(sub);
    }

    // +toLowerCase() : MyString
    public MyString toLowerCase(){
        char[] lowerCaseString = new char[stringLength];
		for(int i = 0; i < stringLength; i++){
            lowerCaseString[i] = Character.toLowerCase(string[i]); //using 'char' class toLowerCase()
		}

		return new MyString(lowerCaseString);
    }

    // +equals(other: MyString) : Boolean
    public boolean equals(MyString s){

		if (s.length() != stringLength) {
            return false;
		}
		else{
            for (int i = 0; i < stringLength; i++) {
                if(s.string[i] != string[i]){
                    return false;
				}
			}
		}

		return true;
    }

    // +valueOf(i:	int) : MyString
    public static MyString valueOf(int i){
        int digits = 1;
		int temp = i;

		while(temp > 0){
            temp /= 10;
			digits++;
		}

		int[] integers = new int[digits];
        int count = 0;

		while(i > 0){
            integers[count] = i % 10;
			i /= 10;
			count++;
		}

		char[] chars = new char[count];
		int anotherCount = 0;
		for(int k = count-1; k >= 0; k--){
            chars[anotherCount] = Character.forDigit(integers[k], 10);
			anotherCount++;
		}

		return new MyString(chars);
    }
 }
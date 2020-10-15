/*
Purpose: The	purpose	for	this	project	is	to	reinforce	the	knowledge	learned	in
Chapter	7.
Objectives:
1. Apply	linear	search	algorithm
2. Apply	select sort	algorithm
3. Apply	array	iteration	skill
 *
 * @author: Ronnie Young
 * @version 10.06.20
 */

import java.util.Arrays;
import java.util.Scanner; // import scanner package

public class Ronnie_Young_Project7 {
    public static void main(String[] args){
        // Create a Scanner Object
        Scanner input = new Scanner(System.in);
        int user_input_key;

        //1. Declare an	int	array of size 10
        // 2. Initialize	the	array	by	calling initializeArray	function
        int[] sample_array = initializeArray();


        // 3. Print	out	the	array	by	calling printArray	function
        printArray(sample_array);
        System.out.println("");

        // 4. Print	out	the	largest	and	smallest	value	of	the	array	by	using
        // System.out.prinln and calling	largest	and	smallest functions
        System.out.println("Largest number in the array: ");
        System.out.println(largest(sample_array));

        System.out.println("Smallest number in the array: ");
        System.out.println(smallest(sample_array));

        // 5. Print	out	the	range	of	the	array
        System.out.println(range(sample_array));

        // 6. Print	out	the	average	of	the	array	elements
        System.out.println(average(sample_array));

        // 7. Ask user to enter	a search key
        System.out.println("Please enter a search key: ");
        user_input_key = input.nextInt();
        // 8. Call the linearSearch	function with array and key. Based on result, print out appropriate	message.
        System.out.println(linearSearch(sample_array, user_input_key));

        // 9. Call the selectSort function to sort the array.
        selectSort(sample_array);
        // 10. Print out array again to	see	the	sorted	array
        printArray(sample_array);
    }

    // assign each element in array with a random number
    //between 1 and	100, inclusive
    public static int[] initializeArray(){
        int[] sample_array = new int[10];
        for(int i=0; i<sample_array.length; i++)
        {
            sample_array[i] = (int)(Math.random() * 100 + 1);
        }
        return sample_array;
    }

    // print out all array elements. 5 elements	per line
    public static void printArray(int[] args){
        for (int i = 0; i < args.length; i++){
            if (i % 5 == 0 && i > 0) {
                System.out.println();
            }
            System.out.print(args[i] + " ");
        }
    }

    // find the	smallest element in	array
    public static int smallest(int arr[]){
        java.util.Arrays.sort(arr);
        return arr[0];
    }

    // find the	largest element in	array
    public static int largest(int arr[]){
        int max = Arrays.stream(arr).max().getAsInt();
        return max;
    }

    //	find the range of all array	elements
    //	the	range is defined as	the	difference between	the	largest	and	smallest elements
    public static int range(int arr[]){
        return largest(arr) - smallest(arr);
    }

    // find the average value of all elements in an array
    public static double average(int arr[]){
        int sum = 0;
        for (int i = 0; i < arr.length; i++){
            sum = sum + arr[i];
        }
        double average = sum / arr.length;
        return average;
    }

    // Return the index of the first occurence of key in arr.
    // If key is not found in array return -1.
    public static int linearSearch(int arr[], int key){
        for (int i = 0; i < arr.length; i++){
            if (key == arr[i]){
                return i;
            }
        }
        return -1;
    }

    // sort the array from least to largest by using select sort algorithm
    public static void selectSort(int arr[]){
        for (int i = 0; i < arr.length; i++){
            // Find the minimum in the array.
            int currentMin = arr[i];
            int currentMinIndex = i;

            for (int j = i + 1; j < arr.length; j++){
                if (currentMin > arr[j]){
                    currentMin = arr[j];
                    currentMinIndex = j;
                }
            }

            //Swap arr[i] with arr[currentMinIndex] if necessary
            if (currentMinIndex != i){
                arr[currentMinIndex] = arr[i];
                arr[i] = currentMin;
            }
        }
    }

}
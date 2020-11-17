/*
*Purpose: The purpose for this	project	is to reinforce	the	knowledge from	Chapter	9 of the textbook. The students	will learn how to write	a user defined class.

Project Objectives:
1. Apply UML design	on user defined	class
2. Write overloaded constructors of a class
3. Write mutators (i.e.	get	methods) and accessors (i.e. set methods) of a class
4. Write overloaded	methods
5. Write main method to	test the user defined class
 *
 * @author: Ronnie Young
 * @version 10.28.20
 */

import java.util.Scanner; // import scanner package

public class Ronnie_Young_Project9 {
    public static void main(String[] args){
        //create scanner object
        Scanner input = new Scanner(System.in);
        int user_input_temp = 0;
        char user_input_scale;

        //The main method must create four temperature objects by using all four constructors.

        // Temperature One.
        Temperature temperature_one = new Temperature();

        System.out.println("The first Temperature has been created using the default constructor which sets	the degree to a	default value of " + String.format("%.2f",temperature_one.getDegreeInFahrenheit()) +
        " and the scale	to a default value of " + String.format("%.2f",temperature_one.getDegreeInCelsius()) + " C.");

        System.out.println("Set the degree (a number) and the scale (F or C) of the first Temperature. ");
        System.out.println("First set the degree: ");
        user_input_temp = input.nextInt();

        System.out.println("First set the scale: ");
        user_input_scale = input.next().charAt(0);
        temperature_one.setDegree(user_input_temp, user_input_scale);

        System.out.println("Now the first temperature is: "+ String.format("%.2f",temperature_one.getDegreeInCelsius()) + " C.");

        System.out.println("Which is: "+ String.format("%.2f",temperature_one.getDegreeInFahrenheit())+ " F ");


        // Temperature Two.
        Temperature temperature_two = new Temperature('C');

        System.out.println("The first Temperature has been created using the default constructor which sets	the degree to a	default value of " + String.format("%.2f",temperature_two.getDegreeInFahrenheit()) +
        " and the scale	to a default value of " + String.format("%.2f",temperature_two.getDegreeInCelsius()) + " C.");

        System.out.println("Set the degree (a number) and the scale (F or C) of the first Temperature. ");
        System.out.println("First set the degree: ");
        user_input_temp = input.nextInt();

        System.out.println("First set the scale: ");
        user_input_scale = input.next().charAt(0);
        temperature_two.setDegree(user_input_temp, user_input_scale);

        System.out.println("Now the first temperature is: "+ String.format("%.2f",temperature_two.getDegreeInCelsius()) + " C.");

        System.out.println("Which is: "+ String.format("%.2f",temperature_two.getDegreeInFahrenheit())+ " F ");

        //Temperature Three
        Temperature temperature_three = new Temperature(0.00, 'F');

        System.out.println("The first Temperature has been created using the default constructor which sets	the degree to a	default value of " + String.format("%.2f",temperature_three.getDegreeInFahrenheit()) +
        " and the scale	to a default value of " + String.format("%.2f",temperature_three.getDegreeInCelsius()) + " C.");

        System.out.println("Set the degree (a number) and the scale (F or C) of the first Temperature. ");
        System.out.println("First set the degree: ");
        user_input_temp = input.nextInt();

        System.out.println("First set the scale: ");
        user_input_scale = input.next().charAt(0);
        temperature_three.setDegree(user_input_temp, user_input_scale);

        System.out.println("Now the first temperature is: "+ String.format("%.2f",temperature_three.getDegreeInCelsius()) + " C.");

        System.out.println("Which is: "+ String.format("%.2f",temperature_three.getDegreeInFahrenheit()) + " F ");

        Temperature temperature_four = new Temperature(98.6, 'F');

        System.out.println("The first Temperature has been created using the default constructor which sets	the degree to a	default value of " + String.format("%.2f",temperature_four.getDegreeInFahrenheit()) +
        " and the scale	to a default value of " + String.format("%.2f",temperature_four.getDegreeInCelsius()) + " C.");

        System.out.println("Set the degree (a number) and the scale (F or C) of the first Temperature. ");
        System.out.println("First set the degree: ");
        user_input_temp = input.nextInt();

        System.out.println("First set the scale: ");
        user_input_scale = input.next().charAt(0);
        temperature_four.setDegree(user_input_temp, user_input_scale);

        System.out.println("Now the first temperature is: "+ String.format("%.2f",temperature_four.getDegreeInCelsius()) + " C.");

        System.out.println("Which is: "+ String.format("%.2f",temperature_four.getDegreeInFahrenheit()) + " F ");


        //create an array of all test temperatures
        Temperature[] temperatures_array = {temperature_one,temperature_two,temperature_three,temperature_four};

        //loops through temperatures and compares them using boolean functions
        for (int i = 0; i < temperatures_array.length ; i++) {
            for (int j = i + 1; j < temperatures_array.length; j++) {
                System.out.println("Temperature " + (i+1) + " is equal to Temperature " + (j+1) +": "
                        + temperatures[i].equals(temperatures[j]));
                System.out.println("Temperature " + (i+1) + " is less than Temperature " + (j+1) +": "
                        + temperatures[i].isLessThan(temperatures[j]));
                System.out.println("Temperature " + (i+1) + " is greater than Temperature " + (j+1) +": "
                        + temperatures[i].isGreaterThan(temperatures[j]));
            }
            System.out.println();
        }
    }

}
    class Temperature{
        // -degree:	double
        private double degree = 0.0;
        // -scale:	char
        private char scale = 'C';

        //+Temperature()
        public Temperature(){
        }
        // +Temperature(degree:	double)
        public Temperature(double degree){
            this.degree = degree;
            this.scale = scale;
        }
        // +Temperature(scale: char)
        public Temperature(char scale){
            this.degree = degree;
            if(scale == 'C' || scale == 'F'){
                this.scale = scale;
            }
            else{
                System.out.println("Invalid input.");
            }
        }
        // +Temperature(degree:	double,	scale:	char)
        public Temperature(double degree, char scale){
            this.degree = degree;
            if(scale == 'C' || scale == 'F'){
                this.scale = scale;
            }
            else{
                System.out.println("Invalid input.");
            }
        }
        // +getDegreeInCelsius(): double
        public double getDegreeInCelsius(){
            // return the temperature’s	degree in its equivalent Celsius degree If the temperature’s scale is ‘C’, then	the	return value is temperature’s degree
            if(scale == 'C') {
                return degree;
            }
            //If the temperature’s scale is ‘F’, the return	value is calculated by the following formula: C = (F-32)*5/9.
            else{
                return (degree - 32) * 5 / 9;
            }
        }
        // +getDegreeInFahrenheit(): double
        public double getDegreeInFahrenheit(){
            //If the temperature's scale is 'F', then the return value is temperature's degree.
            if(scale == 'F'){
                return degree;
            }
            // If the temperature's scale is 'C', the return value is calculated by the following formula: F = (1.8 * degree) + 32;
            else{
                return (1.8 * degree) + 32;
            }
        }
        // +setDegree(degree: double): void
        public void setDegree(double degree) {
            // reset the temperature to given degree without changing the scale of the temperature.
            this.degree = degree;
        }
        // +setDegree(scale: char): void
        public void setDegree(char scale) {
            // reset the temperature to given scale without changing the degree of the temperature.
            if (scale == 'C' || scale == 'F'){
                this.scale = scale;
            }
            else {
                System.out.println("Invalid input.");
            }
        }
        // +setDegree(degree: double, scale: char): void
        public void setDegree(double degree, char scale) {
            // reset the temperature to given scale and degree.
            this.degree = degree;
            this.scale = scale;
        }
        // +equals(obj:	Temperature): boolean
        public boolean equals(Temperature temperature) {
            // equals method returns true if this temperature is equal to the parameter temperature, false otherwise.
            return (this.getDegreeInFahrenheit() == temperature.getDegreeInFahrenheit());
        }
        // +isLessThan(obj:	Temperature): boolean
        public boolean isLessThan(Temperature temperature) {
            // Return true if this temperature is less than parameter Temperature, false otherwise.
            return (this.getDegreeInFahrenheit() < temperature.getDegreeInFahrenheit());
        }
        // +isGreaterThan(obj: Temperature): boolean
        public boolean isGreaterThan(Temperature temperature){
            return (this.getDegreeInFahrenheit() > temperature.getDegreeInFahrenheit());
        }
    }
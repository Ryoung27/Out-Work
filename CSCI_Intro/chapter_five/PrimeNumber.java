public class PrimeNumber{
    public static void main(String[] args){
        final int NUMBER_OF_PRIMES = 50; // Number of prime numbers to display.
        final int NUMBER_OF_PRIMES_PER_LINES = 10; // Display 10 per line.
        int count = 0;
        int number = 2;

        System.out.println("The first 50 prime numbers are \n");

        // Repeatedly find prime numbers
        while (count < NUMBER_OF_PRIMES){
            // Assume the number is prime.
            boolean isPrime = true; // Is the current number prime?

            //Test weather the number is prime.
            for(int divisor = 2; divisor <= number /2; divisor++){
                if(number % divisor == 0){
                    isPrime = false; // Set isPrime to false
                    break;
                }
            }

            //Display the prime number and increase the count.
            if(isPrime){
                count++;

                if(count % NUMBER_OF_PRIMES_PER_LINES == 0){
                    //Display the number and advance to the new line.
                    System.out.println(number);
                }
                else
                    System.out.print(number + " ");
            }
            // Check if the next number is prime;
            number++;
        }

    }
}
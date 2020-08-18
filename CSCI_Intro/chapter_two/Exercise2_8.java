import java.util.Scanner;

public class Exercise2_8{
    public static void main(String[] args){
        // Initialize the Scanner Object.
        Scanner input = new Scanner(System.in);
        // Get the user input.
        System.out.println("Please enter a GMT offput: ");
        int user_gmt_offput = input.nextInt();

        //Obtain the number of milliseconds since Unix Epoch.
        long totalMilliseconds = System.currentTimeMillis();

        //Obtain the total seconds since Unix Epoch.
        long totalSeconds = totalMilliseconds/1000;

        //Compute the current second in the minute in the hour.
        long currentSecond = totalSeconds % 60;

        //Obtain the total minutes.
        long totalMinutes = totalSeconds / 60;

        //Compute the current minute in the hour.
        long currentMinute = totalMinutes % 60;

        //Obtain the total hours.
        long totalHours = totalMinutes / 60;

        //Compute the current hour.
        long currentHour = totalHours % 24;

        long currentHourGMT = 0;

        if(user_gmt_offput < 0)
        {
            currentHourGMT = currentHour - Math.abs(user_gmt_offput);

        }
        else{
            currentHourGMT = currentHour + Math.abs(user_gmt_offput);
        }
        //Display results.
        System.out.println("The current time is " + currentHourGMT + ":" + currentMinute + ":" + currentSecond + "GMT");

    }
}
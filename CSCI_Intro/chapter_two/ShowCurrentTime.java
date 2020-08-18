public class ShowCurrentTime{
    public static void main(String[] args){
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

        //Display results.
        System.out.println("The current time is " + currentHour + ":" + currentMinute + ":" + currentSecond + "GMT");

    }
}
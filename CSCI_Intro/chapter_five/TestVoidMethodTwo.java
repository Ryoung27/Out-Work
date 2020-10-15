public class TestVoidMethodTwo{
    public static void main(String[] args){
        System.out.println(printGrade(90.0));
    }

    public static char printGrade(double score){
        if(score > 90.0)
            return 'A';
        else if(score > 80.0)
            return 'B';
        else if(score > 70.0)
            return 'C';
        else if(score > 60.0)
            return 'D';
        else
            return 'F';
    }
}
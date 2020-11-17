public class TestReturnGradeMethod{
    public static void main(String[] args){
        System.out.println(" Your grade is " + getGrade(90.0));
        System.out.println(" Your grade is " + getGrade(85.0));
    }

    public static char getGrade(double score){
        if(score >= 90){
            return 'A';
        }
        else if(score >= 85){
            return 'B';
        }
        else if(score >= 75){
            return 'C';
        }
        else if(score >= 70){
            return 'D';
        }
        else{
            return 'F';
        }

    }
}
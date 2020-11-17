public class TestVoidMethod{
    public static void main(String[] args){
        printGrade(91);
        printGrade(80);
        printGrade(70);
        printGrade(60);
        printGrade(50);
    }

    public static void printGrade(double score){
        if(score >= 90){
            System.out.println("You're making an A.");
        }
        else if(score >= 85){
            System.out.println("You're making an B.");
        }
        else if(score >= 75){
            System.out.println("You're making an C.");
        }
        else if(score >= 70){
            System.out.println("You're making an D.");
        }
        else{
            System.out.println("You're making an F.");
        }

    }
}
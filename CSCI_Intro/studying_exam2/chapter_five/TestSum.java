public class TestSum{
    public static void main(String[] args){
        float sum = 0;
        double suml = 0;
        double sumi = 0;
        double currentValue = 0;

        for(float i = 0.01f; i <= 1.0f; i = i + 0.01f)
            sum += i;

        System.out.println("The sum is " + sum);

        for(double l = 0.01; l < 1.0; l = l + 0.01)
            suml += l;

        System.out.println("The sum l is " + suml);

        for(int count = 0; count < 100; count++){
            sumi += currentValue;
            currentValue += 0.01;
        }

        System.out.println("The sum i is " + sumi);
    }
}
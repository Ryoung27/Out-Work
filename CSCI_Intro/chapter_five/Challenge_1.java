public class Challenge_1{
    public static void main(String[] args){

        System.out.println(addition(1, 10));
    }

    public static int addition(int n1, int n2){
        int result = 0;
        for(int i = n1; i <= n2; i++)
            result += i;
        return result;
    }
}
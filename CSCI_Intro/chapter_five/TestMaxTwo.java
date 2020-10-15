public class TestMaxTwo{
    public static void main(String[] args){
        int i = 5;
        int j = 2;
        int k = max(i, j);
        System.out.println("The maximum of " + i + " and " + j + " is " + k);
    }

    public static int max(int n1, int n2){
        if(n1 > n2)
            return n1;
        else
            return n2;
    }
}
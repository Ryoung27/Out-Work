
public class MultiplicationTable{
    public static void main(String[] args){
        System.out.println("        Multiplication Table");
        System.out.println("        ");
        for (int j = 1; j <= 9; j++){
            System.out.print("   " + j);

        System.out.println("\n--------------------");

        for(int i = 1; i <= 9; i++){
            System.out.print(i + " | ");
            for(int l =1; l <= 9; l++){
                System.out.printf("%4d", i * l);
            }
            System.out.println();
        }
        }
    }
}
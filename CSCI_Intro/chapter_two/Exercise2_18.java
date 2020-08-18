public class Exercise2_18{
    public static void main(String[] args){
        System.out.println("a     b     pow(a,b)");
        float a = 1;
        float b = 2;
        int c = (int)Math.pow(a, b);
        System.out.println(a + "  " + b + "        " + c);
        a = b;
        b = b + 1;
        c = (int)Math.pow(a, b);
        System.out.println(a + "  " + b + "        " + c);
        a = b;
        b = b + 1;
        c = (int)Math.pow(a, b);
        System.out.println(a + "  " + b + "        " + c);
        a = b;
        b = b + 1;
        c = (int)Math.pow(a, b);
        System.out.println(a + "  " + b + "        " + c);
        a = b;
        b = b + 1;
        c = (int)Math.pow(a, b);
        System.out.println(a + "  " + b + "        " + c);

    }
}
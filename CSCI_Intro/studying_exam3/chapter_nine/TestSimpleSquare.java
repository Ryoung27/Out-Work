public class TestSimpleSquare{
    public static void main(String[] args){
        SimpleSquare square_one = new SimpleSquare();
        System.out.println("The area of a square with side size " + square_one.one_side + " is " + square_one.getArea());

        SimpleSquare square_two = new SimpleSquare(100);
        System.out.println("The area of a square with side size " + square_two.one_side + " is " + square_two.getArea());
    }

}

class SimpleSquare{
    double one_side;

    SimpleSquare(){
        one_side = 2;
    }

    SimpleSquare(double new_side){
        one_side = new_side;
    }

    double getArea(){
        return one_side * 4;
    }
}
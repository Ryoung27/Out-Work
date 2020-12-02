public class TestCircleWithStaticMembers{
    public static void main(String[] args){

        System.out.println("Before creating objects");
        System.out.println("The number of Circle objects is " + CircleWithStaticMembers.numberOfObjects);
    }

    public class CircleWithStaticMembers{
        double radius;

        int numberOfObjects = 0;

        CircleWithStaticMembes(){
            radius = 1;
            numberOfObjects++;
        }

        CircleWithStaticMembers(double newRadius){
            radius = newRadius;
            numberOfObjects++;
        }

        int getNumberOfObjects(){
            return numberOfObjects;
        }

        double getArea(){
            return radius * radius * Math.PI;
        }

    }
}
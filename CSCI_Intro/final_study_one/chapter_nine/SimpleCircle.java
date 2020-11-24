public class SimpleCircle {
    public static void main(String[] args){
        SimpleCircle circle1 = new SimpleCircle(25);
        System.out.println("The area of a circle with radius " + circle1.radius);
        SimpleCircle circle2 = new SimpleCircle(125);
        System.out.println("The area of a circle with radius " + circle2.radius);
        SimpleCircle circle3 = new SimpleCircle(25);
        System.out.println("The area of a circle with radius " + circle3.radius);
        circle2.radius = 100;
        System.out.println("The area of a circle with radius " + circle2.radius);
        circle2.setRadius(100);
        System.out.println("The area of a circle with radius " + circle2.radius);
        SimpleCircle circle4 = new SimpleCircle();
        System.out.println("The area of a circle with radius " + circle4.radius);
    }

    double radius;

    SimpleCircle(){
        radius = 1;
    }

    SimpleCircle(double newRadius){
        this.radius = newRadius;
    }

    double getArea(){
        return radius * radius * Math.PI;
    }

    double getPerimeter(){
        return 2 * radius * Math.PI;
    }

    void setRadius(double newRadius){
        this.radius = newRadius;
    }

}


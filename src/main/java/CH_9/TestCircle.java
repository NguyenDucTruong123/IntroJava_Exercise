package CH_9;

public class TestCircle {

    public static void main(String[] args) {

        Circle circle1 = new Circle();
        System.out.println("The area of a circle of radius " + circle1.radius + " is" + circle1.getArea());
        Circle circle2 = new Circle(25);
        System.out.println("The area of a circle of radius " + circle2.radius + " is" + circle1.getArea());
    }
}
class Circle {
    double radius;
    Circle () {
        radius = 1;
    }
    Circle(double newRadius) {
        radius = newRadius;
    }
    double getArea () {
        return Math.PI * radius * radius;
    }
    double getPerimeter() {
        return 2 * Math.PI * radius;
    }
    void setRadius(double newRadius) {
        radius = newRadius;
    }
}

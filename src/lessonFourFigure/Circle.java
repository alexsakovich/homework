package lessonFourFigure;

public class Circle {
    private double radius;

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    double perimeter() {
        double perimeter = radius * (2 * 3.1415);
        return perimeter;
    }
}

package lessonFourFigure;

class Rectangle {
    private double length, width;

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    double area() {
        double area = length * width;
        return area;
    }

    double perimeter() {
        double perimeter = (length + width) * 2;
        return perimeter;
    }
}
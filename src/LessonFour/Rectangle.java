package LessonFour;

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
    void square () {
        System.out.println("Площадь прямоугольника: " + length * width);
    }
    void perimeter () {
        System.out.println("Периметр прямоугольника: " + (length + width) * 2);
    }
}
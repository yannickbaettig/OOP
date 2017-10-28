package ch.hslu.SW06.Shape;


public class Square extends Shape {
    private int length;

    public Square(int x, int y, int length) {
        super(x, y);
        this.length = length;
    }

    @Override
    public double getPerimeter() {
        return 4 * length;
    }

    @Override
    public double getArea() {
        return Math.pow(length, 2);
    }

    public int getLength() {
        return length;
    }
}

package ch.hslu.SW06.Shape;

public class Rectangle extends Shape {
    private int width;
    private int height;

    public Rectangle(final int x, final int y, final int width, final int height) {
        super(x, y);
        this.width = width;
        this.height = height;
    }

    public void changeDimension(int newWidth, int newHeight) {
        width = newWidth;
        height = newHeight;
    }

    @Override
    public double getPerimeter() {
        return (2 * this.width) + (2 * this.height);
    }

    @Override
    public double getArea() {
        return width * height;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }
}
package ch.hslu.SW06.Shape;

public abstract class Shape {
    private int x;
    private int y;

    protected Shape(final int x, final int y) {
        this.x = x;
        this.y = y;
    }
    public final void move(final int newX, final int newY) {
        this.x = newX;
        this.y = newY;
    }
    public abstract double getPerimeter();

    public abstract double getArea();

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}
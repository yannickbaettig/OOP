package ch.hslu.SW06.Shape;

public class Circle extends Shape {

    private double diameter;

    public Circle(int x, int y, int diameter) {
        super(x, y);
        this.diameter = diameter;
    }

    @Override
    public double getPerimeter() {
        return ((2 * Math.PI) * (diameter/2));
    }

    @Override
    public double getArea() {
        return Math.PI * Math.pow(diameter/(double)2, 2);
    }

    public void setDiameter(int diameter) {
        this.diameter = diameter;
    }

    public double getDiameter() {
        return diameter;
    }
}

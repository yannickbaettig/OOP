package ch.hslu.SW07;

import java.util.Objects;

public class Point {
    private int x;
    private int y;

    private final int QUADRANT_1 = 1;
    private final int QUADRANT_2 = 2;
    private final int QUADRANT_3 = 3;
    private final int QUADRANT_4 = 4;
    private final int QUADRANT_0 = 0;


    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Point(Point point) {
        this(point.getX(),point.getY());
    }

    public void moveRelative(int x, int y) {
        this.x = +x;
        this.y = +y;
    }

    public void moveRelative(Point point){
        moveRelative(point.getX(),point.getY());
    }

    public void moveRelaitve(double angle, int norm) {
        int x = Math.toIntExact(Math.round(Math.cos(angle) * norm));
        int y = Math.toIntExact(Math.round(Math.sin(angle) * norm));
        moveRelative(x,y);
    }

    public int getQuadrant(){
        int quadrant = QUADRANT_0;
        if (this.x != 0 && this.y != 0){
            if (x > 0){
                if (y > 0){
                    quadrant = QUADRANT_1;
                }else {
                    quadrant = QUADRANT_4;
                }
            }else {
                if (y > 0){
                    quadrant = QUADRANT_2;
                }else {
                    quadrant = QUADRANT_3;
                }
            }
        }
        return quadrant;
    }

    @Override
    public final boolean equals(final Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Point)) {
            return false;
        }

        final Point point = (Point) obj;

        return (point.x == this.x) && (point.y == this.y);

    }

    @Override
    public final int hashCode() {
        return Objects.hash(this.x, this.y);
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}

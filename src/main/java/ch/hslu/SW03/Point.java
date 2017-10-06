package ch.hslu.SW03;

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

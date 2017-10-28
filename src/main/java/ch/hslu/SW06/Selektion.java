package ch.hslu.SW06;

public class Selektion {

    public int max(final int a, final int b){
        if (a >= b){
            return a;
        } else {
            return b;
        }
    }

    public int min(final int a, final int b){
        if (a <= b) {
            return a;
        } else {
            return b;
        }
    }

    public int max1(final int a, final int b, final int c){
        if (a >= b && a >= c){
            return a;
        } else if (b >= a && b >= c){
            return b;
        } else {
            return c;
        }
    }

    public int max2(final int a, final int b, final int c){
       return max(max(a,b),c);
    }

    public int max3(int ... values){
        int max = values[0];
        for (int i = 1; i < values.length; i++) {
            if (values[i] > max) {
                max = values[i];
            }
        }
        return max;
    }



}

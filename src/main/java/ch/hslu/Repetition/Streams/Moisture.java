package ch.hslu.Repetition.Streams;

public class Moisture implements Comparable<Moisture>{
    private int moisture;

    public Moisture(int moisture){
        this.moisture = moisture;
    }

    @Override
    public String toString(){
        return String.valueOf(getMoisture());
    }


    public int getMoisture(){
        return this.moisture;
    }

    @Override
    public int compareTo(Moisture o) {
        return Integer.compare(moisture, o.moisture);
    }


}

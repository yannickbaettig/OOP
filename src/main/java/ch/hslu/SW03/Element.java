package ch.hslu.SW03;

public class Element {
    private String id;
    private String name;
    private float boilingPoint;
    private float fluidPoint;

    public Element(String id, String name, float boilingPoint, float fluidPoint) {
        this.id = id;
        this.name = name;
        this.boilingPoint = boilingPoint;
        this.fluidPoint = fluidPoint;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getBoilingPoint() {
        return boilingPoint;
    }

    public void setBoilingPoint(float boilingPoint) {
        this.boilingPoint = boilingPoint;
    }

    public float getFluidPoint() {
        return fluidPoint;
    }

    public void setFluidPoint(float fluidPoint) {
        this.fluidPoint = fluidPoint;
    }
}



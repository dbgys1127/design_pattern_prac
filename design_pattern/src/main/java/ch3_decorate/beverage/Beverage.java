package ch3_decorate.beverage;

public abstract class Beverage {
    public enum Size{
        TALL,GRANDE,VENTI
    };
    String description = "no title";

    Size size = Size.TALL;

    public String getDescription() {
        return description;
    }

    public Size getSize() {
        return this.size;
    }

    public void setSize(Size size) {
        this.size = size;

    }

    public abstract double cost();
}

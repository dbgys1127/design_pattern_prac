package ch3_decorate.beverage;

public class Decaf extends Beverage{
    public Decaf() {
        description = "디카페인";
    }

    @Override
    public double cost() {
        if (this.getSize().equals(Size.TALL)) {
            return 1.05;
        }
        if (this.getSize().equals(Size.GRANDE)) {
            return 1.1;
        }
        if (this.getSize().equals(Size.VENTI)) {
            return 1.15;
        }

        return 1.05;
    }
}

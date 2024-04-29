package ch3_decorate.beverage;

public class Espresso extends Beverage{
    public Espresso() {
        description = "에스프레소";
    }

    @Override
    public double cost() {
        if (this.getSize().equals(Size.TALL)) {
            return 1.99;
        }
        if (this.getSize().equals(Size.GRANDE)) {
            return 2.04;
        }
        if (this.getSize().equals(Size.VENTI)) {
            return 2.09;
        }

        return 1.99;
    }
}

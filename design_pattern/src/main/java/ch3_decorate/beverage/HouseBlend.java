package ch3_decorate.beverage;

public class HouseBlend extends Beverage{
    public HouseBlend() {
        description = "하우스 블랜드";
    }

    @Override
    public double cost() {
        if (this.getSize().equals(Size.TALL)) {
            return .89;
        }
        if (this.getSize().equals(Size.GRANDE)) {
            return .95;
        }
        if (this.getSize().equals(Size.VENTI)) {
            return 1.00;
        }

        return .89;
    }
}


package ch3_decorate.condimentdecorator;

import ch3_decorate.beverage.Beverage;

public class Whip extends CondimentDecorator{
    public Whip(Beverage beverage) {
        System.out.println("wc "+beverage);
        this.beverage = beverage;
    }


    @Override
    public double cost() {

        if (beverage.getSize().equals(Size.TALL)) {
            return beverage.cost()+.11;
        }
        if (beverage.getSize().equals(Size.GRANDE)) {
            return beverage.cost()+.16;
        }
        if (beverage.getSize().equals(Size.VENTI)) {
            return beverage.cost()+.21;
        }
        return beverage.cost()+.11;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription()+", 휘핑크림";
    }
}

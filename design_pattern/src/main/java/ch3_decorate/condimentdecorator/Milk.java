package ch3_decorate.condimentdecorator;

import ch3_decorate.beverage.Beverage;

public class Milk extends CondimentDecorator{
    public Milk(Beverage beverage) {
        this.beverage = beverage;
    }


    @Override
    public double cost() {
        if (beverage.getSize().equals(Size.TALL)) {
            return beverage.cost()+.10;
        }
        if (beverage.getSize().equals(Size.GRANDE)) {
            return beverage.cost()+.15;
        }
        if (beverage.getSize().equals(Size.VENTI)) {
            return beverage.cost()+.20;
        }
        return beverage.cost()+.10;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription()+", 우유";
    }
}

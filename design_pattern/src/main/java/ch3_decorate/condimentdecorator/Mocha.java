package ch3_decorate.condimentdecorator;

import ch3_decorate.beverage.Beverage;

public class Mocha extends CondimentDecorator{
    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }


    @Override
    public double cost() {
        if (beverage.getSize().equals(Size.TALL)) {
            return beverage.cost()+.20;
        }
        if (beverage.getSize().equals(Size.GRANDE)) {
            return beverage.cost()+.25;
        }
        if (beverage.getSize().equals(Size.VENTI)) {
            return beverage.cost()+.30;
        }
        return beverage.cost()+.20;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription()+", 모카";
    }
}

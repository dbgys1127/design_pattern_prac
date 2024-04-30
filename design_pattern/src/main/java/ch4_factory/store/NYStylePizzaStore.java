package ch4_factory.store;

import ch4_factory.product.*;
import ch4_factory.product.ny.NYStyleCheesePizza;
import ch4_factory.product.ny.NYStyleClamPizza;
import ch4_factory.product.ny.NYStylePepperoniPizza;
import ch4_factory.product.ny.NYStyleVeggiePizza;

public class NYStylePizzaStore extends PizzaStore{
    @Override
    protected Pizza createPizza(String type) {
        if (type.equals("cheese")) {
            return new NYStyleCheesePizza();
        } else if (type.equals("pepperoni")) {
            return new NYStylePepperoniPizza();
        }else if (type.equals("clam")) {
            return new NYStyleClamPizza();
        }else if (type.equals("veggie")) {
            return new NYStyleVeggiePizza();
        }
        return null;
    }
}

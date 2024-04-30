package ch4_factory.store;

import ch4_factory.product.Pizza;
import ch4_factory.product.california.CaliforniaStyleCheesePizza;
import ch4_factory.product.california.CaliforniaStyleClamPizza;
import ch4_factory.product.california.CaliforniaStylePepperoniPizza;
import ch4_factory.product.california.CaliforniaStyleVeggiePizza;

public class CaliforniaStylePizzaStore extends PizzaStore{
    @Override
    protected Pizza createPizza(String type) {
        if (type.equals("cheese")) {
            return new CaliforniaStyleCheesePizza();
        } else if (type.equals("pepperoni")) {
            return new CaliforniaStylePepperoniPizza();
        }else if (type.equals("clam")) {
            return new CaliforniaStyleClamPizza();
        }else if (type.equals("veggie")) {
            return new CaliforniaStyleVeggiePizza();
        }
        return null;
    }
}

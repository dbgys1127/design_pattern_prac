package ch4_factory.store;

import ch4_factory.product.Pizza;
import ch4_factory.product.chicago.ChicagoStyleCheesePizza;
import ch4_factory.product.chicago.ChicagoStyleClamPizza;
import ch4_factory.product.chicago.ChicagoStylePepperoniPizza;
import ch4_factory.product.chicago.ChicagoStyleVeggiePizza;

public class ChicagoStylePizzaStore extends PizzaStore{
    @Override
    protected Pizza createPizza(String type) {
        if (type.equals("cheese")) {
            return new ChicagoStyleCheesePizza();
        } else if (type.equals("pepperoni")) {
            return new ChicagoStylePepperoniPizza();
        }else if (type.equals("clam")) {
            return new ChicagoStyleClamPizza();
        }else if (type.equals("veggie")) {
            return new ChicagoStyleVeggiePizza();
        }
        return null;
    }
}

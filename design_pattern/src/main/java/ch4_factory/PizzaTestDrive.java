package ch4_factory;

import ch4_factory.product.Pizza;
//import ch4_factory.store.ChicagoStylePizzaStore;
import ch4_factory.store.NYStylePizzaStore;
import ch4_factory.store.PizzaStore;

public class PizzaTestDrive {
    public static void main(String[] args) {
        PizzaStore nyStylePizzaStore = new NYStylePizzaStore();
//        PizzaStore chicagoStylePizzaStore = new ChicagoStylePizzaStore();

        Pizza pizza = nyStylePizzaStore.orderPizza("cheese");
        System.out.println("에단 피자 : "+ pizza + "\n");

//        pizza = chicagoStylePizzaStore.orderPizza("cheese");
//        System.out.println("조엘 피자 : "+ pizza.getName() + "\n");
    }
}

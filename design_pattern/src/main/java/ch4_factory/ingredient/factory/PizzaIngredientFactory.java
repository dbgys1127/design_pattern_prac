package ch4_factory.ingredient.factory;

import ch4_factory.ingredient.factor.cheese.Cheese;
import ch4_factory.ingredient.factor.clams.Clams;
import ch4_factory.ingredient.factor.dough.Dough;
import ch4_factory.ingredient.factor.pepperoni.Pepperoni;
import ch4_factory.ingredient.factor.sauce.Sauce;
import ch4_factory.ingredient.factor.veggies.Veggies;

public interface PizzaIngredientFactory {
    public Dough createDough();

    public Sauce createSauce();

    public Cheese createCheese();

    public Veggies[] createVeggies();

    public Pepperoni createPepperoni();

    public Clams createClam();
}

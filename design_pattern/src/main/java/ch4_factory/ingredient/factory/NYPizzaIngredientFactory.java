package ch4_factory.ingredient.factory;

import ch4_factory.ingredient.factor.cheese.Cheese;
import ch4_factory.ingredient.factor.cheese.ReggianoCheese;
import ch4_factory.ingredient.factor.clams.Clams;
import ch4_factory.ingredient.factor.clams.FreshClams;
import ch4_factory.ingredient.factor.dough.Dough;
import ch4_factory.ingredient.factor.dough.ThickCrustDough;
import ch4_factory.ingredient.factor.pepperoni.Pepperoni;
import ch4_factory.ingredient.factor.pepperoni.SlicedPepperoni;
import ch4_factory.ingredient.factor.sauce.MarinaraSauce;
import ch4_factory.ingredient.factor.sauce.Sauce;
import ch4_factory.ingredient.factor.veggies.*;

public class NYPizzaIngredientFactory implements PizzaIngredientFactory{
    @Override
    public Dough createDough() {
        return new ThickCrustDough();
    }

    @Override
    public Sauce createSauce() {
        return new MarinaraSauce();
    }

    @Override
    public Cheese createCheese() {
        return new ReggianoCheese();
    }

    @Override
    public Veggies[] createVeggies() {
        Veggies veggies[] = {new Garlic(), new Onion(), new Mushroom(), new RedPepper()};
        return veggies;
    }

    @Override
    public Pepperoni createPepperoni() {
        return new SlicedPepperoni();
    }

    @Override
    public Clams createClam() {
        return new FreshClams();
    }
}

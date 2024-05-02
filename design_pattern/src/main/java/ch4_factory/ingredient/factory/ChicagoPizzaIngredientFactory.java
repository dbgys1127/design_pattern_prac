package ch4_factory.ingredient.factory;

import ch4_factory.ingredient.factor.cheese.Cheese;
import ch4_factory.ingredient.factor.cheese.MozzarellaCheese;
import ch4_factory.ingredient.factor.clams.Clams;
import ch4_factory.ingredient.factor.clams.FrozenClams;
import ch4_factory.ingredient.factor.dough.Dough;
import ch4_factory.ingredient.factor.dough.ThickCrustDough;
import ch4_factory.ingredient.factor.pepperoni.Pepperoni;
import ch4_factory.ingredient.factor.pepperoni.SlicedPepperoni;
import ch4_factory.ingredient.factor.sauce.PlumTomatoSauce;
import ch4_factory.ingredient.factor.sauce.Sauce;
import ch4_factory.ingredient.factor.veggies.BlackOlives;
import ch4_factory.ingredient.factor.veggies.EggPlant;
import ch4_factory.ingredient.factor.veggies.Spinach;
import ch4_factory.ingredient.factor.veggies.Veggies;

public class ChicagoPizzaIngredientFactory implements PizzaIngredientFactory{
    @Override
    public Dough createDough() {
        return new ThickCrustDough();
    }

    @Override
    public Sauce createSauce() {
        return new PlumTomatoSauce();
    }

    @Override
    public Cheese createCheese() {
        return new MozzarellaCheese();
    }

    @Override
    public Veggies[] createVeggies() {
        Veggies veggies[] = {new BlackOlives(), new Spinach(), new EggPlant()};
        return veggies;
    }

    @Override
    public Pepperoni createPepperoni() {
        return new SlicedPepperoni();
    }

    @Override
    public Clams createClam() {
        return new FrozenClams();
    }
}

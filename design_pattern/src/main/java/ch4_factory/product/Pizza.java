package ch4_factory.product;

import ch4_factory.ingredient.factor.cheese.Cheese;
import ch4_factory.ingredient.factor.clams.Clams;
import ch4_factory.ingredient.factor.dough.Dough;
import ch4_factory.ingredient.factor.pepperoni.Pepperoni;
import ch4_factory.ingredient.factor.sauce.Sauce;
import ch4_factory.ingredient.factor.veggies.Veggies;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public abstract class Pizza {
    protected String name;
    protected Dough dough;
    protected Sauce sauce;
    Veggies veggies[];
    Cheese cheese;
    Pepperoni pepperoni;
    Clams clam;
    protected List<String> toppings = new ArrayList<>();

    public abstract void prepare();

    public void bake() {
        System.out.println("175도에서 25분간 굽기");
    }

    public void cut() {
        System.out.println("피자를 사선으로 자르기");
    }

    public void box() {
        System.out.println("상자에 피자 담기");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Pizza{" +
                "name='" + name + '\'' +
                ", dough=" + dough +
                ", sauce=" + sauce +
                ", veggies=" + Arrays.toString(veggies) +
                ", cheese=" + cheese +
                ", pepperoni=" + pepperoni +
                ", clam=" + clam +
                ", toppings=" + toppings +
                '}';
    }
}

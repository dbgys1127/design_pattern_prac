import ch3_decorate.beverage.Beverage;
import ch3_decorate.beverage.DarkRoast;
import ch3_decorate.beverage.Espresso;
import ch3_decorate.beverage.HouseBlend;
import ch3_decorate.condimentdecorator.Mocha;
import ch3_decorate.condimentdecorator.Soy;
import ch3_decorate.condimentdecorator.Whip;

public class Dujeans {
    public static void main(String[] args) {
        Beverage espresso = new Espresso();
        espresso.setSize(Beverage.Size.GRANDE);
        System.out.println(espresso.getDescription() + " $"+espresso.cost());

        Beverage darkRoast = new DarkRoast(); //1.01
        darkRoast.setSize(Beverage.Size.VENTI);
        darkRoast = new Mocha(darkRoast); // 1.31 // 변수 beverage = darkRoast
        darkRoast = new Mocha(darkRoast); // 1.61 // 변수 beverage = darkRoast
        darkRoast = new Whip(darkRoast); // 1.82 // 변수 beverage = darkRoast
        System.out.println(darkRoast.getDescription() + " $"+darkRoast.cost());

        Beverage houseBlend = new HouseBlend();
        houseBlend.setSize(Beverage.Size.TALL);
        houseBlend = new Soy(houseBlend);
        houseBlend = new Mocha(houseBlend);
        houseBlend = new Whip(houseBlend);
        System.out.println(houseBlend.getDescription() + " $"+houseBlend.cost());

    }
}

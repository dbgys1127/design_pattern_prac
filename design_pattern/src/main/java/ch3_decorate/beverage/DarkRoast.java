package ch3_decorate.beverage;

public class DarkRoast extends Beverage{
    public DarkRoast() {
        description = "다크로스트";
    }

    @Override
    public double cost() {
        if (this.getSize().equals(Size.TALL)) {
            return .99;
        }
        if (this.getSize().equals(Size.GRANDE)) {
            return 1.00;
        }
        if (this.getSize().equals(Size.VENTI)) {
            return 1.01;
        }
        return .99;
    }
}

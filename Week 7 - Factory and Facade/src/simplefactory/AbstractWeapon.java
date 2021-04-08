package simplefactory;

public abstract class AbstractWeapon {
    String color;
    int power;
    int distance;

    public abstract void pewPew();

    public AbstractWeapon(String color, int power, int distance) {
        this.color = color;
        this.power = power;
        this.distance = distance;
    }
}
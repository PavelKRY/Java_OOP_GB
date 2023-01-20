package HW1;

public class Archer extends BaseHero{
    int shoot;

    public Archer(String name, int attack, int[] damage, int deference, int health, int speed, int shoot) {
        super(name, attack, damage, deference, health, speed);
        this.shoot = shoot;
    }

    
    @Override
    public String toString(){
        return super.toString() + ", Выстрел: " + shoot;

    }
}

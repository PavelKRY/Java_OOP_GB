package HW1;

public class Mag extends BaseHero {
    int mana;

    public Mag(String name, int attack, int[] damage, int deference, int health, int speed, int mana) {
        super(name, attack, damage, deference, health, speed);
       this.mana = mana;
    }

    public Mag(String name){
        super(name, 17, new int[] {-5,-5}, 12, 30, 9);
        this.mana = 1;
    }
    @Override
    public String toString(){
        return super.toString() + ", Мана" ;

    }
}

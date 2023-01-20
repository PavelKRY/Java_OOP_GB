package HW1;

public class Rogue extends BaseHero {

    public Rogue(String name, int attack, int[] damage, int deference, int health, int speed) {
        super(name, attack, damage, deference, health, speed);
       
    }
    public Rogue(String name){
        super(name, 8, new int[] {2,4}, 3, 10, 6);
    }
}

package HW1;

public class SpearMen extends BaseHero {

    public SpearMen(String name, int attack, int[] damage, int deference, int health, int speed) {
        super(name, attack, damage, deference, health, speed);
        
    }
    public SpearMen(String name){
        super(name, 4, new int[] {1,3}, 5, 10, 4);
    }
}

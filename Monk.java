package HW1;

public class Monk extends BaseHero {

    int mana;
    
    public Monk(String name, int attack, int[] damage, int deference, int health, int speed, int mana) {
        super(name, attack, damage, deference, health, speed);
        this.mana = mana;
    }

    public Monk(String name){
        super(name, 12, new int[] {-4,-4}, 7, 30, 5);
        this.mana = 1;
    }
  
    @Override
    public String toString(){
        return super.toString() + ", Мана";

    }
}

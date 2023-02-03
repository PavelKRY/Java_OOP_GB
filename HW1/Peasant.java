package HW1;

public class Peasant extends BaseHero{

    int supply;

    public Peasant(String name, String role, int attack, int[] damage,int defence, int health, int speed, int supply) {
        super(name, role, attack, defence, damage, health, speed);
        this.supply = supply;
    }


    public Peasant(String name){
        super(name, "Крестьянин", 1, 1, new int[] {1,1}, 1, 3);
        this.supply = 1;
    }
    @Override
    public String toString(){
        return super.toString() + ", Доставка ";

    }
}

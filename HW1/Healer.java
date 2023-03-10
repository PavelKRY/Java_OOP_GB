package HW1;

import java.util.ArrayList;

public class Healer extends BaseHero {
    
    int mana;

    public Healer(String name, String role, int attack,int deference, int[] damage, int health, int speed, int mana) {
        super(name, role, attack, deference, damage, health, speed);
        this.mana = mana;
    }

    @Override
    public String toString() {
        return super.toString() + ", Мана: ";
    }
    @Override
    public void step(ArrayList<BaseHero> heroList) {
        double max = 0;
        int maxi = 0;
        for (int i = 0; i < heroList.size(); i++) {
            String[] params = heroList.get(i).getInfo().split(" ");
            if (Integer.parseInt(params[1]) != Integer.parseInt(params[2]) ){
                double temp = Double.parseDouble(params[1]) / Double.parseDouble(params[2]) * 100;
                if (temp > max){
                    max = temp;
                    maxi = i;
                }
            }
        }
        healing(heroList.get(maxi));
    }

    private void healing(BaseHero weak){
        int currentHealth = weak.health;
        int healingPower = damage[0];
        if (Math.abs(healingPower - currentHealth) > weak.maxHealth){
            weak.health = weak.maxHealth;
            System.out.printf("\nПерсонаж %s %s вылечил персонажа %s %s полностью. Текущее здоровье: %d/%d", name, role, weak.name, weak.role, weak.health, weak.maxHealth);
        } else {
            weak.health = Math.abs(healingPower - currentHealth);
            System.out.printf("\nПерсонаж %s %s вылечил персонажа %s %s на %d ед. здоровья. Текущее здоровье: %d/%d", name, role, weak.name, weak.role, Math.abs(healingPower), weak.health, weak.maxHealth);
        }
}
}

package HW1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class BaseHero {
    int attack,defence, health, maxHealth, speed;
    String name;
    String role;
    int[] damage;

    public BaseHero(String name,String role, int attack, int defence, int[] damage, int health, int speed){
        this.name = name;
        this.role = role;
        this.attack = attack;
        this.defence = defence;
        this.damage = damage;
        this.maxHealth = health;
        this.health = maxHealth - new Random().nextInt(maxHealth);
        this.speed = speed;
    }
   
    public void step(ArrayList<BaseHero> heroList) {

    }
    
    public String getInfo() {
        return role + " " + String.valueOf(maxHealth) + " " + String.valueOf(health);
    }

    @Override
    public String toString(){
        return "Имя: "+ name + " ,Роль: + " + role + ", Атака: " + attack + ", Защита: " + defence + ", Здоровье: " + health+ ", Урон: " + Arrays.toString(damage) + ", Скорость: " + speed;
    }
}

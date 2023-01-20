package HW1;

import java.util.Arrays;

public class BaseHero {
    int attack, deference, health, speed;
    String name;
    int[] damage;

    public BaseHero(String name, int attack, int[] damage, int deference, int health, int speed){
        this.name = name;
        this.attack = attack;
        this.damage= damage;
        this.speed = speed;
        this.health = health;
        this.deference = deference;
    }
    @Override
    public String toString(){
        return "Имя: "+ name + ", Атака: " + attack + ", Защита: " + deference + ", Здоровье: " + health+ ", Урон: " + Arrays.toString(damage) + ", Скорость: " + speed;
    }
}

package HW1;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<BaseHero> Peasant = new ArrayList<>();
        String[] PeasantNames = {"Антонио", "Аркадий", "Артём", "Арсений", "Адам"};
        for (String name: PeasantNames){
            Peasant.add(new Peasant(name));
        }
        System.out.println("Крестьяне");
        System.out.println("");
        for (BaseHero character : Peasant){
            System.out.println(character);
        }

        System.out.println("----------------------------------------------------------------------");

        ArrayList<BaseHero> Rogue = new ArrayList<>();
        String[] RogueNames = {"Борис", "Браум", "Брон", "Брэндан", "Бек"};
        for (String name: RogueNames){
            Rogue.add(new Rogue(name));
        }
        System.out.println("Разбойники");
        System.out.println("");
        for (BaseHero character : Rogue){
            System.out.println(character);
        }

        System.out.println("----------------------------------------------------------------------");
        
        ArrayList<BaseHero> Sniper = new ArrayList<>();
        String[] SniperNames = {"Владимир", "Василий", "Виктор", "Владислав", "Вик"};
        for (String name: SniperNames){
            Sniper.add(new Sniper(name));
        }
        System.out.println("Снайпера");
        System.out.println("");
        for (BaseHero character : Sniper){
            System.out.println(character);
        }

        System.out.println("----------------------------------------------------------------------");
        
        ArrayList<BaseHero> Mag = new ArrayList<>();
        String[] MagNames = {"Генадий", "Господий", "Грин", "Гордон", "Гуддини"};
        for (String name: MagNames){
            Mag.add(new Mag(name));
        }
        System.out.println("Маги");
        System.out.println("");
        for (BaseHero character : Mag){
            System.out.println(character);
        }

        System.out.println("----------------------------------------------------------------------");
        
        ArrayList<BaseHero> CrossbowMan = new ArrayList<>();
        String[] CrossbowManNames = {"Дмитрий", "Декабрь", "Друзь", "Док", "Дрон"};
        for (String name: CrossbowManNames){
            CrossbowMan.add(new CrossbowMan(name));
        }
        System.out.println("Арбалетчики");
        System.out.println("");
        for (BaseHero character : CrossbowMan){
            System.out.println(character);
        }

        System.out.println("----------------------------------------------------------------------");

        ArrayList<BaseHero> Monk = new ArrayList<>();
        String[] MonkNames = {"Евкакий", "Ерлан", "Ек", "Екатерин", "Евпатий"};
        for (String name: MonkNames){
            Monk.add(new Monk(name));
        }
        System.out.println("Монахи");
        System.out.println("");
        for (BaseHero character : Monk){
            System.out.println(character);
        }

        System.out.println("----------------------------------------------------------------------");
        
        ArrayList<BaseHero> SpearMen = new ArrayList<>();
        String[] SpearMenNames = {"Жин", "Жожо", "Жир", "Жак", "Жан"};
        for (String name: SpearMenNames){
            SpearMen.add(new SpearMen(name));
        }
        System.out.println("Копейщики");
        System.out.println("");
        for (BaseHero character : SpearMen){
            System.out.println(character);
        }
        System.out.println("----------------------------------------------------------------------");

    }
    
}

package HW1;

import HW1.units.*;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static final int GANG_SIZE = 10;
    public static ArrayList<BaseHero> whiteSide;
    public static ArrayList<BaseHero> darkSide;

    public static void main(String[] args) {
        init();
        ArrayList<BaseHero> units = new ArrayList<>();
        units.addAll(whiteSide);
        units.addAll(darkSide);
        Comparator<BaseHero> comparator = Comparator.comparing(BaseHero::getSpeed);

        Scanner scanner = new Scanner(System.in);
        while (true) {
            units.sort(comparator);
            ConsoleView.view();
            System.out.println("Press ENTER");
            scanner.nextLine();

            units.forEach(n -> n.step(units));
            scanner.nextLine();
        }
    }

    private static void init() {
        String[] namesList = {"Артём", "Александр", "Михаил", "Максим", "Иван", "Даниил", "Дмитрий", "Кирилл", "Никита", "Егор", "Матвей", "Андрей", "Илья", "Алексей", "Роман", "Сергей", "Владислав", "Ярослав", "Тимофей", "Арсений", "Денис", "Владимир", "Павел", "Глеб", "Константин", "Богдан", "Евгений", "Николай", "Степан", "Захар", "Тимур", "Марк", "Семён", "Фёдор", "Георгий", "Лев", "Антон", "Вадим", "Игорь", "Руслан", "Вячеслав", "Григорий", "Макар", "Артур", "Виктор", "Станислав", "Савелий", "Олег", "Давид", "Леонид", "Пётр", "Юрий", "Виталий", "Мирон", "Василий", "Всеволод", "Елисей", "Назар", "Родион", "Марат",
                "Платон", "Герман", "Игнат", "Святослав", "Анатолий", "Тихон", "Валерий", "Мирослав", "Ростислав", "Борис", "Филипп", "Демьян", "Гордей", "Валентин", "Демид", "Прохор", "Серафим", "Савва", "Яромир",
                "Аркадий", "Архип", "Тарас", "Трофим"};
        int namesSize = namesList.length;
        whiteSide = new ArrayList<>();
        darkSide = new ArrayList<>();
        ArrayList<BaseHero> whiteFarmers = new ArrayList<>();
        ArrayList<BaseHero> darkFarmers = new ArrayList<>();

        Random random = new Random();
        int x = 1;
        int y = 1;

        for (int i = 0; i < GANG_SIZE; i++) {
            switch (random.nextInt(4)) {
                case 0 : whiteFarmers.add(new Farmer(whiteSide, namesList[random.nextInt(namesSize)], x, y++, "white", false)); break;
                case 1 : whiteSide.add(new Rogue(whiteSide, namesList[random.nextInt(namesSize)], x, y++, "white", false)); break;
                case 2 : whiteSide.add(new Sniper(whiteSide, namesList[random.nextInt(namesSize)], x, y++, "white", false)); break;
                case 3 : whiteSide.add(new Mage(whiteSide, namesList[random.nextInt(namesSize)], x, y++, "white", false)); break;
            }
        }
        whiteSide.addAll(whiteFarmers);

        x = GANG_SIZE;
        y = 1;
        for (int i = 0; i < GANG_SIZE; i++) {
            switch (random.nextInt(4)) {
                case 0 : darkSide.add(new Crossbowman(darkSide, namesList[random.nextInt(namesSize)], x, y++, "dark", false)); break;
                case 1 : darkSide.add(new Monk(darkSide, namesList[random.nextInt(namesSize)], x, y++, "dark", false)); break;
                case 2 : darkSide.add(new Spearman(darkSide, namesList[random.nextInt(namesSize)], x, y++, "dark", false)); break;
                case 3 : darkFarmers.add(new Farmer(darkSide, namesList[random.nextInt(namesSize)], x, y++, "dark", false)); break;
            }
        }
        darkSide.addAll(darkFarmers);
    }
}

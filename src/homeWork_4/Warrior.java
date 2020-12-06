package homeWork_4;

import java.util.Random;

public class Warrior {
    private String name;
    private int health;
    private String weaponsName;
    private int weapon;


    public Warrior(String name, int health, String weaponsName, int weapon) {
        this.name = name;
        this.health = health;
        this.weaponsName = weaponsName;
        this.weapon = weapon;
    }


    public void setHealth(int health) {
        this.health = health;
    }


    public void warriorParameters() {
        System.out.println("Warrior - " + this.name);
        System.out.println("Health - " + this.health + " hp");
        System.out.println("Weapon - " + this.weaponsName);
        System.out.println("Damage - " + "-" + this.weapon + " hp");
        System.out.println();
    }


    public static void whoAttack(Warrior[] arrayWar) {
        int countTheLiving = arrayWar.length;
        while (countTheLiving != 1) {
            randomWarrior(arrayWar).attack(randomWarrior(arrayWar));
            for (Warrior warrior : arrayWar) {
                if (warrior.health <= 0) {
                    countTheLiving--;
                }
            }
            if (countTheLiving > 1) {
                countTheLiving = arrayWar.length;
            }
            if (countTheLiving == 1) {
                System.out.println("       БИТВА ЗАКІНЧИЛАСЬ!\n");
                System.out.println("Переміг Воїн " + whoWon(arrayWar).name + " ! ! !");
            }
        }
    }


    public static Warrior randomWarrior(Warrior[] arrayWar) {
        Random random = new Random();
        int i = random.nextInt(arrayWar.length);
        return arrayWar[i];
    }


    public void attack(Warrior warrior) {
        if (health > 0 && warrior.health > 0 && !name.equals(warrior.name)) {
            System.out.println("Воїн " + name + " " + health + " hp - атакує Воїна " +
                    warrior.name + " " + warrior.health + " hp");
            warrior.setHealth(warrior.health - weapon);

            if (warrior.health > 0) {
                System.out.println("Воїн " +
                        warrior.name + " " + warrior.health + " hp" + "\n");
            }
            else {
                System.out.println("Воїн " + name + " вбив Воїна " + warrior.name);
                System.out.println("+1 Dead" + "\n");
            }
        }
    }


    public static Warrior whoWon(Warrior[] arrayWar) {
        int winnersNumber = 0;
        for (int i = 0; i < arrayWar.length; i++) {
            if (arrayWar[i].health > 0) {
                winnersNumber = i;
            }
        }
        return arrayWar[winnersNumber];
    }


}
//  Зробити міні-гру - битва.  Створити одну сутність - шаблонний варіант воїна.
//  Зробити декілька типів воїнів-наслідників. Кожен з них має свої особливості , наприклад hp, зброя і т.д.
//  Тут потрібно проявити свою фантазію і додавати класи, які хочеться. Потім має бути битва.
//  Воїни можуть атакувати, якщо вони атакують, життя зменшується. На кожному етапі показувати інфу.
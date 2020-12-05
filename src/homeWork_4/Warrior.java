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

    public static void whoShouldAttack(Warrior[] arrayWar) {

        int countTheDead = 0;
        while (countTheDead != arrayWar.length - 1) {
            if (countTheDead < arrayWar.length - 1) {
                countTheDead = 0;
            }
            for (Warrior warrior : arrayWar) {

                if (warrior.health > 0) {
                    randomWarrior3(arrayWar).attack(warrior);
                }
                if (warrior.health <= 0) {
                    countTheDead++;
                    System.out.println(countTheDead);
                }
                if (countTheDead == arrayWar.length - 1) {
                    System.out.println("Переміг Воїн " + whoWon(arrayWar).name + " ! ! !");
                }
            }
        }
    }


    public static void whoAttack(Warrior[] arrayWar) {
        int countTheDead = 0;
        while (countTheDead != arrayWar.length - 1) {
            randomWarrior3(arrayWar).attack(randomWarrior3(arrayWar));
            for (Warrior warrior : arrayWar) {
                if (warrior.health <= 0) {
                    countTheDead++;
//                    System.out.println(countTheDead);
                }
            }
            if (countTheDead < arrayWar.length - 1) {
                countTheDead = 0;
            }
            if (countTheDead == arrayWar.length - 1) {
                System.out.println("Переміг Воїн " + whoWon(arrayWar).name + " ! ! !");
            }
        }
    }


    public void attack(Warrior warrior) {
        if (health > 0 && warrior.health > 0 && !name.equals(warrior.name)) {
            System.out.println("Воїн " + name + " " + health + " hp - атакує Воїна " +
                    warrior.name + " " + warrior.health + " hp");
            warrior.setHealth(warrior.health - weapon);
            if (warrior.health > 0) {
                System.out.println("Воїн " +
                        warrior.name + " " + warrior.health + " hp" + "\n");
            } else {
                System.out.println("Воїн " + name + " вбив Воїна " + warrior.name);
                System.out.println("+1" + "\n");
            }
        }
    }


//    public static Warrior randomWarrior(Warrior[] arrayWar, int warIndex) {
//        int random = (int) (Math.random() * arrayWar.length);
//
//        while (arrayWar[random].health <= 0 && arrayWar[random].equals(arrayWar[warIndex])) {
//            random = (int) (Math.random() * arrayWar.length);
//        }
//        return arrayWar[random];
//    }

    public static Warrior anotherRandomWarrior(Warrior[] arrayWar, Warrior warrior) {
        Random random = new Random();
        int number = random.nextInt(arrayWar.length);

        int[] arrayNumbers = new int[arrayWar.length + 5];
        for (int i : arrayNumbers) {
            i = random.nextInt(arrayWar.length);
            if (!arrayWar[i].equals(warrior)) {
                number = i;
                break;
            }
        }
//        System.out.println(arrayWar[number].name);
        return arrayWar[number];
    }


    public static Warrior randomWarrior3(Warrior[] arrayWar) {
        Random random = new Random();
        int i = random.nextInt(arrayWar.length);
//        System.out.println("\n" + arrayWar[i].name + "\n");
        return arrayWar[i];
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
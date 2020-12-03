package homeWork_4;

public class Warrior {
    private static int countTheDead = 1;
    private static final int amountWarriors = 4;
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
        while (countTheDead < arrayWar.length) {

            for (Warrior warrior : arrayWar) {
                int random = (int) (Math.random() * arrayWar.length);
                while (arrayWar[random].health <= 0 && arrayWar[random].equals(warrior)) {
                    random = (int) (Math.random() * arrayWar.length);
                }
                if (warrior.health > 0) {
                    arrayWar[random].attack(warrior);
                }
                if (warrior.health <= 0) {
                    countTheDead++;
                }
                if (countTheDead == arrayWar.length - 1) {
                    System.out.println("Переміг Воїн " + arrayWar[random].name + " ! ! !");
                    break;
                }
            }
            if (countTheDead != arrayWar.length - 1) {
                countTheDead = 0;
            }
        }
    }


    public void attack(Warrior warrior) {
        if (health > 0 && warrior.health > 0) {
            System.out.println("Воїн " + name + " " + health + " hp - атакує Воїна " +
                    warrior.name + " " + warrior.health + " hp");
            warrior.setHealth(warrior.health - weapon);
            if (warrior.health > 0) {
                System.out.println("Воїн " +
                        warrior.name + " " + warrior.health + " hp" + "\n");
            } else {
                System.out.println("Воїн " + name + " вбив Воїна " + warrior.name + "\n");
//                if (countTheDead == Warrior.amountWarriors) {
//                    System.out.println("Переміг Воїн " + name + " ! ! !");
//                }
            }
//        Чому так не канає ?
//        this.health = this.health - weapon;
        }
    }
}

//    public static int random(int amount) {
//        return (int) (Math.random() * amount);
//    }
//
//}

//    public static int randomExcept(int exceptNumber) {
//        int number = random();
//        while (number == exceptNumber) {
//            number = random();
//        }
//        return number;
//    }
//}
//  Зробити міні-гру - битва.  Створити одну сутність - шаблонний варіант воїна.
//  Зробити декілька типів воїнів-наслідників. Кожен з них має свої особливості , наприклад hp, зброя і т.д.
//  Тут потрібно проявити свою фантазію і додавати класи, які хочеться. Потім має бути битва.
//  Воїни можуть атакувати, якщо вони атакують, життя зменшується. На кожному етапі показувати інфу.
package homeWork_4;

public class Warrior {
    private static final int amountWarriors = 4;
    private String name;
    private int health;
    private String weaponsName;
    private int weapon;

    public Warrior() {
    }

    public Warrior(String name, int health, String weaponsName, int weapon) {
        this.name = name;
        this.health = health;
        this.weaponsName = weaponsName;
        this.weapon = weapon;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

//    public int getNumber() {
//        return number;
//    }

    public void warriorParameters() {
        System.out.println("Warrior - " + this.name);
        System.out.println("Health - " + this.health + " hp");
        System.out.println("Weapon - " + this.weaponsName);
        System.out.println("Damage - " + "-" + this.weapon + " hp");
        System.out.println();
    }

    public static void print(Warrior warrior) {
        System.out.println(warrior.name);
    }

    public static void whoShouldAttack(Warrior warrior1, Warrior warrior2,
                                       Warrior warrior3, Warrior warrior4) {
        Warrior[] arrayWar = new Warrior[]{warrior1, warrior2, warrior3, warrior4};
        while (warrior1.health > 0 || warrior2.health > 0 || warrior3.health > 0 || warrior4.health > 0) {
            int count = 1;
            if (arrayWar[random()].equals(arrayWar[0])) {
                arrayWar[0].attack(arrayWar[randomExcept(0)], count);
            } else if (arrayWar[random()].equals(arrayWar[1])) {
                arrayWar[1].attack(arrayWar[randomExcept(1)], count);
            } else if (arrayWar[random()].equals(arrayWar[2])) {
                arrayWar[2].attack(arrayWar[randomExcept(2)], count);
            } else if (arrayWar[random()].equals(arrayWar[3])) {
                arrayWar[3].attack(arrayWar[randomExcept(3)], count);
            }
            if (count == Warrior.amountWarriors) {
                break;
            }
        }
    }


//  Так не виходить?
//        switch (arrayWar[random()]) {
//            case arrayWar[1]:
//                warrior1.attack();
//                break;
//            case arrayWar[2]:
//                break;
//            case arrayWar[3]:
//                break;
//            case arrayWar[4]:
//                break;
//      }


    public void whoWillBeAttacked(Warrior warrior1, Warrior warrior2,
                                  Warrior warrior3, Warrior warrior4) {
        Warrior[] arr = new Warrior[]{warrior1, warrior2, warrior3, warrior4};

    }

    public void attack(Warrior warrior, int countTheDead) {

        if (health > 0 && warrior.health > 0) {
            System.out.println("Воїн " + name + " " + health + " hp - атакує Воїна " +
                    warrior.name + " " + warrior.health + " hp");
            warrior.setHealth(warrior.health - weapon);
            if (warrior.health > 0) {
                System.out.println("Воїн " + name + " " + health + " hp   Воїн " +
                        warrior.name + " " + warrior.health + " hp" + "\n");
            } else {
                System.out.println("Воїн " + name + " вбив Воїна " + warrior.name + "\n");
                countTheDead++;
                System.out.println(countTheDead);
                if (countTheDead == Warrior.amountWarriors) {
                    System.out.println("\n Переміг Воїн " + name + " ! ! !");
                }
            }
//        Чому так не канає ?
//        this.health = this.health - weapon;
        }
    }

    public static int count(int i) {
        i = i + 1;
        return i;
    }

    public void defend() {

    }

    public void slipping() {

    }

//    public static String[] surviced () {
//
//    }

    public static void whoSurvived(Warrior[] warrior) {
        String s = "Бій закінчився\n\nПереміг Воїн ";
        for (int i = 0; i < Warrior.amountWarriors - 1; i++) {
//            if (warrior[i].health > 0 && ) {
//
//            }
        }
//        for (Warrior warrior : warrior) {
//
//        }
    }

    public static int random() {
        return (int) (Math.random() * amountWarriors);
    }

    public static int randomExcept(int exceptNumber) {
        int number = (int) (Math.random() * amountWarriors);
        while (number == exceptNumber) {
            number = (int) (Math.random() * amountWarriors);
        }
        return number;
    }
}
//  Зробити міні-гру - битва.  Створити одну сутність - шаблонний варіант воїна.
//  Зробити декілька типів воїнів-наслідників. Кожен з них має свої особливості , наприклад hp, зброя і т.д.
//  Тут потрібно проявити свою фантазію і додавати класи, які хочеться. Потім має бути битва.
//  Воїни можуть атакувати, якщо вони атакують, життя зменшується. На кожному етапі показувати інфу.
package homeWork_4;

public class Warrior {
    private int number;
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

    public int getNumber() {
        return number;
    }

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
        Warrior[] arr = new Warrior[] {warrior1, warrior2, warrior3, warrior4};

        switch (random()) {
            case 1:
                warrior1.attack();
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
        }
    }

    public void whoWillBeAttacked(Warrior warrior1, Warrior warrior2,
                                  Warrior warrior3, Warrior warrior4) {
        Warrior[] arr = new Warrior[] {warrior1, warrior2, warrior3, warrior4};

    }

    public void attack() {
        setHealth(health - weapon);
    }

    public static void warriorsArray() {

    }

    public void defend() {

    }

    public void slipping() {

    }

    public static int random() {
        return ((int) (Math.random() * 4) + 1);
    }
}
//  Зробити міні-гру - битва.  Створити одну сутність - шаблонний варіант воїна.
//  Зробити декілька типів воїнів-наслідників. Кожен з них має свої особливості , наприклад hp, зброя і т.д.
//  Тут потрібно проявити свою фантазію і додавати класи, які хочеться. Потім має бути битва.
//  Воїни можуть атакувати, якщо вони атакують, життя зменшується. На кожному етапі показувати інфу.